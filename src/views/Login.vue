<template>
  <body>
    <div class="container">
      <router-link to="/"
        ><img src="../components/icons/Logo2__1_-removebg-preview 3 (1).png"
      /></router-link>
      <h1 class="form-title">Iniciar sesión</h1>
      <form action="#">
        <div class="main-user-info">
          <div class="email-input-box">
            <label for="correo">Correo electrónico</label>
            <input
              type="text"
              id="email"
              name="email"
              placeholder="Ingrese su correo electrónico"
              required
            />
          </div>
          <div class="contra-input-box">
            <label for="contrasena">Contraseña</label>
            <input
              type="password"
              id="contrasena"
              name="contrasena"
              placeholder="Ingrese su contraseña"
              required
            />
          </div>
        </div>
        <div class="boton">
          <input type="submit" name="botonPrincipal" value="Iniciar sesión" />
        </div>
        <div class="iniciar_sesion">
          <h3>
            ¿No tienes una cuenta?<router-link to="/registro">Regístrate</router-link>
          </h3>
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
    background-color: #3A0020;
    height: 100vh;
    padding-top: 16vh;
}

.container {
  width: 100%;
  max-width: 450px;
  background-color: rgb(148, 0, 81);
  padding: 0 17px;
  border-radius: 20px;
}

.form-title {
  font-size: auto;
  font-weight: 500;
  text-align: center;
  padding-top: 2%;
  padding-bottom: 4px;
  color: #ffffff;
}

.main-user-info {
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
  border-radius: 3rem;
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
  text-indent: 4%;
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
  text-indent: 4%;
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

.iniciar_sesion h3 {
  padding: 0.9rem;
  font-size: 0.9rem;
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
