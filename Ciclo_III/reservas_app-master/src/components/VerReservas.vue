<template>
  <div>
    <h1 class="display-4 pb-5 title">{{ titulo }}</h1>
    <div class="form-inline reserva">
      <div class="form-group mb-2">
        <label for="Fecha_Inicio" class="sr-only">Fecha Inicial</label>
        <input
          type="date"
          v-model="fecha_inicio"
          class="form-control"
          id="Fecha_Inicio"
          placeholder="Fecha Inicial"
        />
      </div>
      <div class="form-group mx-sm-3 mb-2">
        <label for="Fecha_Fin" class="sr-only">Fecha Final</label>
        <input
          type="date"
          v-model="fecha_fin"
          class="form-control"
          id="Fecha_Fin"
          placeholder="Fecha Final"
        />
      </div>
      <button
        type="button"
        v-on:click="buscarReserva"
        class="mb-2 btn btn-sm btn-outline-secondary"
      >
        Buscar
      </button>
    </div>
    <br />
    <br />
    <table v-if="visibilidad" class="table table-hover">
      <thead>
        <tr>
          <th>Id_reserva</th>
          <th>Nombre</th>
          <th>Apellido</th>
          <th>Cedula</th>
          <th># Personas</th>
          <th>Estado</th>
          <th>Cancelar</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="reserva in reservas" v-bind:key="reserva.id_reserva">
          <td>{{ reserva.id_reserva }}</td>
          <td>{{ reserva.nombre_cliente }}</td>
          <td>{{ reserva.apellido_cliente }}</td>
          <td>{{ reserva.cedula_cliente }}</td>
          <td>{{ reserva.cantidad_personas }}</td>
          <td>{{ reserva.estado_reserva }}</td>
          <td>
            <a
              v-if="reserva.id_reserva && reserva.estado_reserva == 'pendiente'"
              v-on:click.prevent="cancelarReserva($event, reserva.id_reserva)"
              href=""
              class="m-2 btn btn-sm btn-outline-secondary"
              >Cancelar</a
            >
          </td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import axios from "axios";
export default {
  name: "verreservas",
  data: function() {
    return {
      titulo: "Ver todas las reservas",
      fecha_inicio: "",
      fecha_fin: "",
      reservas: [],
      visibilidad: true
    };
  },
  methods: {
    cancelarReserva: function(event, reserva) {
      var cancelar = {
        id_reserva: reserva
      };
      axios
        .put("https://app-reservasg3m3.herokuapp.com/reserva/cancelar/", cancelar)
        .then(response => {
          alert(response.data.mensaje);
          this.buscarReserva();
        })
        .catch(error => {
          alert("No se puede cancelar la reserva");
        });
    },
    buscarReserva: function() {
      var fecha_ini = this.fecha_inicio.split("-").join("");
      var fecha_fin = this.fecha_fin.split("-").join("");

      if (!fecha_ini || !fecha_fin) {
        alert("Ingrese las fechas");
      } else {
        axios
          .get(
            "https://app-reservasg3m3.herokuapp.com/reserva/empleado/visualizar/" +
              fecha_ini +
              "/" +
              fecha_fin
          )
          .then(response => {
            this.reservas = response.data;
          })
          .catch(error => {
            console.log(error);
            alert("Error del servidor");
          });
      }
    }
  }
};
</script>

<style scoped>
.reserva {
  justify-content: center;
  text-align: center;
}
</style>
