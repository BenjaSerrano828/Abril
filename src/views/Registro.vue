<script>
import { validarRut } from "../utils/validarRut.js";
export default {
  name: "Registro",
  data() {
    return {
      nombre: "",
      apellido: "",
      email: "",
      telefono: "",
      rut: "",
      rutValido: true,
      password: "",
      confirmPassword: "",
      direccion: "",
    };
  },
  computed: {
    emailRules() {
      return [(v) => !!v || "El email es requerido"];
    },
    telefonoRules() {
      return [(v) => !!v || "El telefono es requerido"];
    },
    rutRules() {
      return [
        (v) => !!v || "El RUT es requerido",
        (v) => this.rutValido || "RUT inválido",
      ];
    },
    passwordRules() {
      return [(v) => !!v || "La contraseña es requerida"];
    },
    confirmPasswordRules() {
      return [(v) => !!v || "La contraseña es requerida"];
    },
    direccionRules() {
      return [(v) => !!v || "La dirección es requerida"];
    },
  },
  methods: {
    registro() {
      const rutLimpio = this.rut.replace(/[.-]/g, "");
      this.rutValido = validarRut(rutLimpio);
      if (this.rutValido) {
        console.log(rutLimpio);

      } else {
        console.log("Rut no válido");
        return "Rut invalido";
      }
    },
  },
};
</script>

<template>
  <body>
    <div class="container">
      <router-link to="/"
        ><img src="../components/icons/Logo2__1_-removebg-preview 3 (1).png" alt="logo-abril"
      /></router-link>
      <h1 class="form-title">Crea tu cuenta</h1>
      <form action="#">
        <div class="main-user-info">
          <div class="user-input-box">
            <label for="nombre">Nombre</label>
            <input
              type="text"
              id="nombre"
              v-model="nombre"
              title="Solo letras permitidas"
              placeholder="Ingrese su nombre"
              pattern="[A-Za-z]+"
              required
            />
          </div>
          <div class="user-input-box">
            <label for="apellido">Apellido</label>
            <input
              type="text"
              id="apellido"
              v-model="apellido"
              title="Solo letras permitidas"
              placeholder="Ingrese su apellido"
              pattern="[A-Za-z]+"
              required
            />
          </div>
          <div class="email-input-box">
            <label for="email">Correo electrónico</label>
            <input
              type="email"
              id="email"
              v-model="email"
              title="Ingrese una dirección de correo electrónico válida"
              placeholder="correo@ejemplo.com"
              pattern="[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}(\.[a-zA-Z]{2,})?"
              required
            />
          </div>
          <div class="user-input-box">
            <label for="telefono">Teléfono celular</label>
            <input
              type="tel"
              id="telefono"
              v-model="telefono"
              title="Ingrese un número de teléfono válido (entre 8 y 15 dígitos)"
              placeholder="912345678"
              pattern="[0-9]{8,15}"
              required
            />
          </div>
          <div class="user-input-box">
            <label for="rut">RUT</label>
            <input
              type="text"
              id="rut"
              v-model="rut"
              placeholder="Ingrese su RUT"
              required
            />
          </div>
          <div class="contra-input-box">
            <label for="password">Contraseña</label>
            <input
              type="password"
              id="password"
              v-model="password"
              placeholder="Ingrese su contraseña"
              required
            />
          </div>
          <div class="contra-input-box">
            <label for="confirmPassword">Confirmar contraseña</label>
            <input
              type="password"
              id="confirmPassword"
              v-model="confirmPassword"
              placeholder="Ingrese su contraseña nuevamente"
              required
            />
          </div>
          <div class="contra-input-box">
            <label for="direccion">Dirección</label>
            <input
              type="text"
              id="direccion"
              v-model="direccion"
              placeholder="Ingrese su dirección"
              required
            />
          </div>
        </div>
        <div class="boton">
          <input type="submit" name="botonPrincipal" value="Crear cuenta" />
        </div>
        <div class="iniciar_sesion">
          <h4>
            ¿Ya tienes una cuenta?<router-link to="/login"
              >Iniciar Sesión</router-link
            >
          </h4>
        </div>
      </form>
    </div>
  </body>
</template>

<style scoped>
* {
  font-family: "Kufam";
}

body {
  background-color: #3a0020;
  padding-top: 2vh;
  padding-bottom: 2vh;
}

.container {
  width: 100%;
  max-width: 550px;
  background-color: rgb(148, 0, 81);
  border-radius: 20px;
}

.form-title {
  font-size: auto;
  font-weight: 100;
  text-align: center;
  padding-top: 3vh;
  padding-bottom: 4px;
  color: #ffffff;
}

.main-user-info {
  padding-left: 2%;
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
  border-radius: 3rem;
}

.user-input-box {
  display: flex;
  flex-wrap: wrap;
  width: 50%;
  padding-bottom: 5px;
}

.user-input-box label {
  width: 95%;
  color: rgb(255, 255, 255);
  font-size: auto;
  font-weight: 400;
  margin-bottom: 5px;
  padding-left: 1rem;
}

.user-input-box input {
  height: 40px;
  width: 95%;
  border-radius: 0.5rem;
  outline: none;
  border: 1px solid rgb(236, 236, 236);
  background-color: rgb(236, 236, 236);
  color: rgba(0, 0, 0, 0.9);
  text-align: left;
  font-weight: 900;
  font-size: auto;
  text-indent: 4%;
  border-color: rgb(148, 0, 81);
}

.email-input-box {
  display: flex;
  flex-wrap: wrap;
  width: 100%;
  padding-bottom: 5px;
}

.email-input-box input {
  height: 40px;
  width: 97.6%;
  display: flex;
  border-radius: 0.5rem;
  outline: none;
  border: 1px solid rgb(236, 236, 236);
  background-color: rgb(236, 236, 236);
  color: rgba(0, 0, 0, 0.9);
  text-align: left;
  font-weight: 900;
  font-size: auto;
  text-indent: 2%;
  border-color: rgb(148, 0, 81);
}

.email-input-box label {
  display: flex;
  width: 95%;
  color: rgb(255, 255, 255);
  font-size: auto;
  font-weight: 400;
  margin-bottom: 5px;
  padding-left: 1rem;
}

.contra-input-box {
  display: flex;
  flex-wrap: wrap;
  width: 100%;
  padding-bottom: 5px;
}

.contra-input-box input {
  display: flex;
  height: 40px;
  width: 97.6%;
  border-radius: 0.5rem;
  outline: none;
  border: 1px solid rgb(236, 236, 236);
  background-color: rgb(236, 236, 236);
  color: rgba(0, 0, 0, 0.9);
  text-align: left;
  font-weight: 900;
  font-size: auto;
  text-indent: 2%;
  border-color: rgb(148, 0, 81);
}

.contra-input-box label {
  display: flex;
  width: 95%;
  color: rgb(255, 255, 255);
  font-size: auto;
  font-weight: 400;
  margin-bottom: 5px;
  padding-left: 1rem;
}

.boton {
  display: flex;
  justify-content: center;
  margin-top: 3%;
  margin-bottom: 1%;
}

.boton input {
  padding: 5px;
  font-size: 1.3rem;
  justify-content: center;
  border-radius: 1rem;
  border-style: none;
  width: 51%;
  background-color: #55012f;
  color: white;
}

.iniciar_sesion {
  display: flex;
  align-items: center;
  justify-content: center;
}

.iniciar_sesion h4 {
  padding: 0.9rem;
  font-size: auto;
  align-items: center;
  justify-content: center;
  color: #ffffff;
}

a {
  margin-left: 0.8rem;
  color: #ffffff;
}

input::placeholder {
  color: rgba(0, 0, 0, 0.6);
  font-weight: 100;
}

input:hover {
  background-color: rgb(207, 101, 159);
}

input.botonPrincipal:hover {
  background-color: rgb(207, 101, 159);
}

.container img {
  width: 30%;
  padding-top: 4%;
}
</style>
