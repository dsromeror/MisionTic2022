<template>
  <div>
    <h1 class="display-4 pb-5 title">{{ titulo }}</h1>
    <div class="form-inline reserva">
      <div class="form-group mx-sm-3 mb-2">
        <label for="cedula" class="sr-only">Cédula del cliente: </label>
        <input type="text" v-model="cedula" class="form-control" id="cedula" />
      </div>
      <button
        type="button"
        v-on:click="traerReservas"
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
          <th>Id reserva</th>
          <th>Nombre</th>
          <th>Apellido</th>
          <th>Contacto</th>
          <th># Personas</th>
          <th>habitaciones</th>
          <th>Estado</th>
          <th>Realizada por empleado con id</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="reserva in reservas" v-bind:key="reserva.id_reserva">
          <td>{{ reserva.id_reserva }}</td>
          <td>{{ reserva.nombre_cliente }}</td>
          <td>{{ reserva.apellido_cliente }}</td>
          <td>{{ reserva.contacto_cliente }}</td>
          <td>{{ reserva.cantidad_personas }}</td>
          <td>
            <span
              v-for="habitacion in reserva.lista_habitaciones"
              v-bind:key="habitacion"
              >{{ habitacion }}
            </span>
          </td>
          <td>{{ reserva.estado_reserva }}</td>
          <td>{{ reserva.id_quien_realiza }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import axios from "axios";
export default {
  name: "buscarreserva",
  data: function() {
    return {
      titulo: "Buscar reserva de un cliente",
      cedula: "",
      reservas: [],
      visibilidad: false
    };
  },
  methods: {
    traerReservas: function() {
      if (!this.cedula) {
        alert("Ingrese la cedula del cliente");
      } else if (isNaN(this.cedula)) {
        alert("Ingrese una cedula válida");
      } else {
        axios
          .get("https://app-reservasg3m3.herokuapp.com/reserva/empleado/buscar/" + this.cedula)
          .then(response => {
            this.reservas = response.data;
            this.visibilidad = true;
          })
          .catch(error => {
            alert(error.response.data.detail);
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
