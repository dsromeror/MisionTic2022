<template>
  <div>
    <h1 class="display-4 pb-5 title">{{ titulo }}</h1>
    <div class="form-inline reserva">
      <div class="form-group mx-sm-3 mb-2">
        <input
          type="text"
          v-model="usr.usuario"
          class="form-control"
          id="usuario"
        />
      </div>
      <div class="form-group mx-sm-3 mb-2">
        <input
          type="password"
          v-model="usr.contrasenia"
          class="form-control"
          id="contrasenia"
        />
      </div>
      <button
        type="button"
        v-on:click="login"
        class="mb-2 btn btn-sm btn-outline-secondary"
      >
        Log In
      </button>
    </div>
  </div>
</template>

<script>
import axios from "axios";
export default {
  name: "login",
  data: function() {
    return {
      titulo: "Login",
      usr: { usuario: "", contrasenia: "" },
      autenticado: false
    };
  },
  methods: {
    login: function() {
      var self = this;

      if (self.usuario || self.contrasenia) {
        alert("Ingrese el usuario y la contraseña");
      } else {
        axios
          .post("https://app-reservasg3m3.herokuapp.com/login", self.usr)
          .then(response => {
            self.autenticado = response.data;
            self.$emit("login", self.usr.usuario);
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
