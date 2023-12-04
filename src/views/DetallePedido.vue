<script setup>
import Navbar from "../components/Navbar.vue";
import Footer from "../components/Footer.vue";
import { RouterLink } from "vue-router";
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
          <li class="nav-link breadcrumb-item">Administrador</li>
        </ol>
      </div>
      <div class="container">
        <!---->
        <div class="card">
          <div class="nav-menu-admin">
            <div class="titulo-menu-admin">
              <h2>Administrador</h2>
            </div>
            <ul class="nav nav-tabs" id="nav-tab" role="tablist">
              <li role="presentation">
                <router-link to="/administrador#lista-usuarios"
                  ><button
                    class="nav-link btn-admin active"
                    id="Admin-Usuarios-tab"
                    data-bs-toggle="tab"
                    data-bs-target="#lista-usuarios"
                    type="button"
                    role="tab"
                    aria-controls="lista-usuarios"
                    aria-selected="true"
                  >
                    Administrar Usuarios
                  </button></router-link
                >
              </li>
              <li role="presentation">
                <router-link to="/administrador#lista-productos"
                  ><button
                    class="nav-link btn-admin"
                    id="Admin-Productos-tab"
                    data-bs-toggle="tab"
                    data-bs-target="#lista-productos"
                    type="button"
                    role="tab"
                    aria-controls="lista-productos"
                    aria-selected="false"
                  >
                    Administrar Productos
                  </button></router-link
                >
              </li>
              <li role="presentation">
                <router-link to="/administrador#lista-pedidos"
                  ><button
                    class="nav-link btn-admin"
                    id="Admin-Pedidos-tab"
                    data-bs-toggle="tab"
                    data-bs-target="#lista-pedidos"
                    type="button"
                    role="tab"
                    aria-controls="lista-pedidos"
                    aria-selected="false"
                  >
                    Administrar Pedidos
                  </button></router-link
                >
              </li>
            </ul>
          </div>

          <div class="tab-content" id="nav-tabContent">
            <div>djaskjsalkdjaskdaskdjsl</div>
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
.container {
  padding-bottom: 30vh;
}
.card {
  height: 100%;
  color: rgb(0, 0, 0);
}
.nav-menu-admin {
  display: flex;
  background-color: #940051;
}
.nav-menu-admin ul li {
  display: flex;
  justify-content: end;
  flex-grow: 1;
  margin-top: 5%;
  margin-left: 1vh;
}
.titulo-menu-admin {
  background-color: white;
  display: flex;
  padding: 1%;
  justify-content: center;
  align-items: center;
}
.titulo-menu-admin h2 {
  color: black;
}
.boton-nuevo-usuario {
  display: flex;
  flex-grow: 1;
  justify-content: end;
  align-items: center;
  position: absolute;
  right: 0%;
  top: 0%;
  color: white;
}
.img-add {
  width: 10vh;
}
.img-accion {
  width: 10vh;
}
.btn-admin {
  background-color: #640238;
}
.btn-admin:hover {
  background-color: #2a0020;
}
.nav-link {
  text-decoration: none;
  color: white;
}
h5 {
  color: black;
}
td .btn-ver-detalles {
  background-color: #adff87;
  border-color: #adff87;
}
</style>
