<script setup>
import Navbar from "../components/Navbar.vue";
import NavSecundaria from "../components/NavSecundaria.vue";
import Footer from "../components/Footer.vue";
import { onMounted, ref } from "vue";
import axios from "axios";

const noticias = ref([]);
const titulos = ref("");

onMounted(async () => {
  try {
  } catch (err) {
    console.log("Error ;(");
  }
});
</script>
<template>
  <header><Navbar></Navbar></header>

  <main>
    <div>
      <NavSecundaria></NavSecundaria>

      <!-- Carrusel Slider-->
      <div id="carouselExample" class="carousel slide">
        <div class="carousel-inner">
          <div class="carousel-item active">
            <img
              src="./images/imagen carru.png"
              class="d-block w-100"
              alt="..."
            />
          </div>
          <div class="carousel-item">
            <img
              src="./images/imagen-carru-2.png"
              class="d-block w-100"
              alt="..."
            />
          </div>
          <div class="carousel-item">
            <img
              src="./images/imagen carru-3.png"
              class="d-block w-100"
              alt="..."
            />
          </div>
        </div>
        <button
          class="carousel-control-prev"
          type="button"
          data-bs-target="#carouselExample"
          data-bs-slide="prev"
        >
          <span class="" aria-hidden="true"
            ><img
              src="./images/icon_arrow_left_.png"
              alt="Deslizar a la izquierda"
          /></span>
          <span class="visually-hidden">Previous</span>
        </button>
        <button
          class="carousel-control-next"
          type="button"
          data-bs-target="#carouselExample"
          data-bs-slide="next"
        >
          <span class="" aria-hidden="true"
            ><img
              src="./images/icon _arrow_right_.png"
              alt="Deslizar a la izquierda"
          /></span>
          <span class="visually-hidden">Next</span>
        </button>
      </div>

      <h1>Todos Nuestros Productos</h1>
    </div>

    <div class="row"></div>
  </main>

  <footer><Footer></Footer></footer>
</template>
<style scoped>
@import url("https://fonts.cdnfonts.com/css/kufam-2");

main {
  background-color: #640238;
  color: white;
  font-family: kufam;
}
main {
  padding-top: 22vh;
}
main h1 {
  text-align: center;
}
</style>
