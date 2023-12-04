<script setup>
import Navbar from "../components/Navbar.vue";
import Footer from "../components/Footer.vue";
</script>

<template>
  <Navbar></Navbar>

  <main>
    <div>
      <div class="barra">
        <ol class="breadcrumb" id="navegacion-secundaria">
          <li class="nav-link breadcrumb-item">
            <RouterLink to="/">Inicio</RouterLink>
          </li>
          <li class="nav-link breadcrumb-item">Crear Nuevo Usuario</li>
        </ol>
      </div>
      <div class="container pb-5 pt-3">
        <div class="card text-left">
          <div class="card-header" style="background-color: #930050">
            <ul class="nav nav-tabs card-header-tabs">
              <li class="nav-item">
                <span
                  class="nav-link active mr-2 border-bottom border-secondary"
                  style="color: black"
                >
                  <h4>Crear Nuevo Usuario</h4>
                </span>
              </li>
            </ul>
          </div>
          <div class="card-body">
            <form class="col-12">
              <div class="row">
                <div class="col">
                  <label for="nombre">Nombre</label>
                  <input
                    type="text"
                    class="form-control"
                    placeholder="Ingrese el nombre"
                    required
                  />
                </div>
                <div class="col">
                  <label for="nombre">Apellido</label>
                  <input
                    type="text"
                    class="form-control"
                    placeholder="Ingrese el apellido"
                    required
                  />
                </div>
              </div>
              <div class="row">
                <div class="col mt-3">
                  <label for="nombre">Teléfono celular</label>
                  <input
                    type="tel"
                    class="form-control"
                    placeholder="Ingrese el teléfono celular"
                    required
                  />
                </div>
                <div class="col mt-3">
                  <label for="nombre">Correo electrónico</label>
                  <input
                    type="email"
                    class="form-control"
                    placeholder="Ingrese el correo electrónico"
                    required
                  />
                </div>
              </div>
              <div class="row">
                <div class="col mt-3">
                  <label for="nombre">RUT</label>
                  <input
                    type="text"
                    class="form-control"
                    placeholder="Ingrese el RUT"
                    required
                  />
                </div>
                <div class="col mt-3">
                  <label for="nombre">Dirección</label>
                  <input
                    type="text"
                    class="form-control"
                    placeholder="Ingrese la dirección"
                    required
                  />
                </div>
              </div>
              <div class="row">
                <div class="col mt-3">
                  <label for="nombre">Contraseña</label>
                  <input
                    type="password"
                    class="form-control"
                    placeholder="Ingrese la contraseña"
                    required
                  />
                </div>
                <div class="col mt-3">
                  <label for="nombre">Confirmar contraseña</label>
                  <input
                    type="password"
                    class="form-control"
                    placeholder="Ingrese la contraseña nuevamente"
                    required
                  />
                </div>
              </div>
              <button
                type="submit"
                class="btn mt-4 ml-3 btn-lg"
                style="background-color: #55012f; color: white"
              >
                Crear usuario
              </button>
            </form>
          </div>
        </div>
      </div>
    </div>
  </main>

  <Footer></Footer>
</template>

<style scoped>
@import url("https://fonts.cdnfonts.com/css/kufam-2");

main {
  background-color: #640238;
  color: white;
  font-family: kufam;
  padding-top: 22vh;
}
main h1 {
  text-align: center;
}
.barra {
  margin: 0 1% 0 22%;
  display: flex;
}

#navegacion-secundaria {
  border-radius: 5px;
  background-color: #3a0020;
  text-decoration: none;
  padding: 6px;
}

.nav-link a {
  text-decoration: none;
  color: white;
}
.card {
  height: 100%;
  color: rgb(0, 0, 0);
}

.card-body {
  background-color: white;
  display: flex;
}
.col input {
  background-color: #d7d7d7;
}
</style>
