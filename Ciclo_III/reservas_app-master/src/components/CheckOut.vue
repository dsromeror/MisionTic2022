<template>
  <div>
    <h1 class="display-4 pb-5 title">{{ titulo }}</h1>
    <table class="table table-hover">
      <thead>
        <tr>
          <th>Id_reserva</th>
          <th>Nombre</th>
          <th>Apellido</th>
          <th>Cedula</th>
          <th># Personas</th>
          <th>Check-out</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="reserva in reservas" v-bind:key="reserva.id_reserva">
          <td>{{ reserva.id_reserva }}</td>
          <td>{{ reserva.nombre_cliente }}</td>
          <td>{{ reserva.apellido_cliente }}</td>
          <td>{{ reserva.cedula_cliente }}</td>
          <td>{{ reserva.cantidad_personas }}</td>
          <td>
            <a
              v-if="reserva.id_reserva"
              v-on:click.prevent="enviarId($event, reserva.id_reserva)"
              href=""
              class="m-2 btn btn-sm btn-outline-secondary"
              >Check-Out</a
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
  name: "checkout",
  data: function() {
    return {
      titulo: "Reservas pendientes por hacer Check-out",
      reservas: []
    };
  },
  methods: {
    enviarId: function(event, reserva) {
      var checkout = { id_reserva: reserva };
      axios
        .put("https://app-reservasg3m3.herokuapp.com/reserva/chekout", checkout)
        .then(response => {
          alert("Recepcionado correctamente");
          window.location.reload(true);
        })
        .catch(error => {
          alert("No se puede realizar el check-out");
        });
    }
  },
  beforeCreate: function() {
    axios
      .get("https://app-reservasg3m3.herokuapp.com/reserva/empleado/visualizar/progreso")
      .then(response => {
        this.reservas = response.data;
      })
      .catch(error => {
        console.log(error);
        alert("Error del servidor");
      });
  }
};
</script>

<style scoped>
.reserva {
  justify-content: center;
  text-align: center;
}
</style>
