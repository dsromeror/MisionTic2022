<template>
  <div class="App">
    <div class="header">
      <nav class="navbar navbar-expand-md navbar-light bg-light border">
        <a class="navbar-brand" href="/"
          ><span class="blue">Aplicación de reservas</span></a
        >
        <button
          aria-controls="navbar"
          aria-expanded="false"
          aria-label="Toggle navigation"
          class="navbar-toggler"
          data-target="#navbar"
          data-toggle="collapse"
          type="button"
        >
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbar">
          <ul class="navbar-nav ml-auto pr-3">
            <li class="nav-item">
              <button
                v-if="is_auth"
                v-on:click="checkin"
                class="m-2 btn btn-sm btn-outline-secondary"
                type="button"
              >
                Check-In
              </button>
            </li>
            <li class="nav-item">
              <button
                v-if="is_auth"
                class="m-2 btn btn-sm btn-outline-secondary"
                type="button"
                v-on:click="checkout"
              >
                Check-Out
              </button>
            </li>
            <li class="nav-item">
              <button
                v-if="is_auth"
                v-on:click="verreservas"
                class="m-2 btn btn-sm btn-outline-secondary"
                type="button"
              >
                Ver reservas
              </button>
            </li>
            <li class="nav-item">
              <button
                v-if="is_auth"
                v-on:click="buscarreserva"
                class="m-2 btn btn-sm btn-outline-secondary"
                type="button"
              >
                Buscar reserva
              </button>
            </li>
            <li class="nav-item">
              <button
                v-if="is_auth"
                v-on:click="logout"
                class="m-2 btn btn-sm btn-outline-secondary"
                type="button"
              >
                Logout
              </button>
            </li>
          </ul>
        </div>
      </nav>
    </div>
    <div class="main-component">
      <div class="jumbotron">
        <h1 v-if="visibilidad" class="display-4 pb-5 title">
          Bienvenido a la aplicación de reservas
        </h1>
        <router-view v-on:login="login"></router-view>
      </div>
    </div>
   
  </div>
</template>

<script>
export default {
  name: "App",
  components: {},
  data: function() {
    return {
      titulo: "Bienvenido a la aplicación de reservas",
      visibilidad: false,
      is_auth: localStorage.getItem("is_auth") || false
    };
  },
  methods: {
    checkin: function() {
      var self = this;

      if (self.$route.name != "checkin") {
        self.visibilidad = false;
        self.$router.push({ name: "checkin" });
      }
      self.update_auth();
    },
    verreservas: function() {
      var self = this;

      if (self.$route.name != "verreservas") {
        self.visibilidad = false;
        self.$router.push({ name: "verreservas" });
      }
      self.update_auth();
    },
    checkout: function() {
      var self = this;

      if (self.$route.name != "checkout") {
        self.visibilidad = false;
        self.$router.push({ name: "checkout" });
      }
      self.update_auth();
    },
    buscarreserva: function() {
      var self = this;

      if (self.$route.name != "buscarreserva") {
        self.visibilidad = false;
        self.$router.push({ name: "buscarreserva" });
      }
      self.update_auth();
    },
    login: function(username) {
      var self = this;

      localStorage.setItem("current_username", username);
      localStorage.setItem("is_auth", true);
      self.$router.push("/");
      self.visibilidad = true;
      self.update_auth();
    },

    update_auth: function() {
      var self = this;
      self.is_auth = localStorage.getItem("is_auth") || false;

      if (self.is_auth == false) {
        if (self.$route.name != "login") {
          self.$router.push({ name: "login" });
        }
      }
    },

    logout: function() {
      var self = this;

      localStorage.removeItem("current_username");
      localStorage.removeItem("is_auth");
      self.visibilidad = false;
      self.update_auth();
    }
  },

  created: function() {
    var self = this;
    if (self.$route.name != "login" && self.is_auth == false) {
      self.$router.push({ name: "login" });
    }
    if (self.$route.name == null) {
      self.visibilidad = true;
    }
  }
};
</script>

<style>
.footer {
  margin: 0;
  padding: 0;
  width: 100%;
  height: 9vh;
}
.footer-text {
  width: 100%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
}
.title {
  font-size: 2em;
  justify-content: center;
  text-align: center;
}
.main-component {
  height: 83vh;
  margin: 0%;
  padding: 4%;
  background: #fdfdfe;
}
</style>
