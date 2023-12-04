<script setup>
import Navbar from "../components/Navbar.vue";
import Footer from "../components/Footer.vue";
import { RouterLink } from "vue-router";
import ProductoDetalle from "../components/ProductoDetalle.vue";
</script>

<template>
  <Navbar></Navbar>

  <main>
    <!-- Barra de Navegación Secundaria-->

    <div class="barra">
      <ol class="breadcrumb" id="navegacion-secundaria">
        <li class="nav-link breadcrumb-item">
          <RouterLink to="/">Inicio</RouterLink>
        </li>
        <li class="nav-link breadcrumb-item">Producto</li>
      </ol>
    </div>
    <ProductoDetalle></ProductoDetalle>
  </main>

  <Footer></Footer>
</template>

<style scoped>
@import url("https://fonts.cdnfonts.com/css/kufam-2");

main {
  color: white;
  background-color: #69003a;
  padding-top: 170px;
  padding-bottom: 150px;
}
.barra {
  margin: 0 1% 0 22%;
  display: flex;
}
.container-card {
  background-color: #930050;
  padding-top: 3vh;
  padding-bottom: 1vh;
}
#card-detalle-producto {
  padding: 10vh 2vh 10vh 2vh;
  margin-left: 30vh;
  margin-right: 30vh;
  margin-bottom: 2vh;
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
h5 {
  color: black;
}
.detalle button {
  background-color: #940051;
  margin: 1vh;
}
.imagen {
  position: absolute;
  top: 13vh;
  left: 23vh;
  width: 18%;
}
</style>
