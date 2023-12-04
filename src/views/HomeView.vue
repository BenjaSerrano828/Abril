<script setup>
import { productos } from "../mocks/productos.js";
import Navbar from "../components/Navbar.vue";
import Footer from "../components/Footer.vue";
import ProductoVista from "../components/ProductoVista.vue";

const groupedProductos = productos.reduce((resultArray, item, index) => {
  const chunkIndex = Math.floor(index / 3);

  if (!resultArray[chunkIndex]) {
    resultArray[chunkIndex] = [];
  }

  resultArray[chunkIndex].push(item);

  return resultArray;
}, []);
</script>

<template>
  <Navbar></Navbar>

  <main>
    <div>
      <div class="barra">
        <ol class="breadcrumb" id="navegacion-secundaria">
          <li class="nav-link breadcrumb-item">
            <router-link to="/">Inicio</router-link>
          </li>
        </ol>
      </div>

      <!-- Carrusel Slider-->
      <div id="carouselExample" class="carousel slide">
        <div class="carousel-inner">
          <div class="carousel-item active">
            <img
              src="../components/img/homeview/imagen carru.png"
              class="d-block w-100"
              alt="..."
              style="height: 57.39vh"
            />
          </div>
          <div class="carousel-item">
            <img
              src="../components/img/homeview/imagen-carru-2.png"
              class="d-block w-100"
              alt="..."
              style="height: 57.39vh"
            />
          </div>
          <div class="carousel-item">
            <img
              src="../components/img/homeview/imagen carru-3.png"
              class="d-block w-100"
              alt="..."
              style="height: 57.39vh"
            />
          </div>
        </div>
        <button
          class="carousel-control-prev"
          type="button"
          data-bs-target="#carouselExample"
          data-bs-slide="prev"
        >
          <span class="margen-flecha-izquierda" aria-hidden="true"
            ><img
              src="../components/img/homeview/icon _arrow_right_.png"
              alt="Deslizar a la izquierda"
              style="transform: rotate(180deg)"
          /></span>
          <span class="visually-hidden">Previous</span>
        </button>
        <button
          class="carousel-control-next"
          type="button"
          data-bs-target="#carouselExample"
          data-bs-slide="next"
        >
          <span class="margen-flecha-derecha" aria-hidden="true"
            ><img
              src="../components/img/homeview/icon _arrow_right_.png"
              alt="Deslizar a la izquierda"
          /></span>
          <span class="visually-hidden">Next</span>
        </button>
      </div>

      <h1>Todos Nuestros Productos</h1>
    </div>

    <div class="row">
      <div
        id="carouselExampleControls2"
        class="carousel slide"
        data-ride="carousel"
      >
        <div class="carousel-inner" style="background-color: #930050">
          <div class="subtitulo">
            <h1 id="skincare">Skincare</h1>
          </div>
          <div
            v-for="(group, index) in groupedProductos"
            :key="index"
            class="carousel-item"
            :class="{ active: index === 0 }"
          >
            <div class="cards-wrapper">
              <ProductoVista
                v-for="p in group"
                :key="p.id"
                :id="p.id"
                :nombre="p.nombre"
                :precio="p.precio"
                :formato="p.formato"
                :imageUrl="p.imageUrl"
              ></ProductoVista>
            </div>
          </div>
        </div>
        <button
          class="carousel-control-prev flecha-izq-abajo"
          type="button"
          data-bs-target="#carouselExampleControls2"
          data-bs-slide="prev"
        >
          <span class="margen-flecha-izquierda" aria-hidden="true"
            ><img
              src="../components/img/homeview/icon_arrow_left_.png"
              alt="Deslizar a la izquierda"
          /></span>
          <span class="visually-hidden">Previous</span>
        </button>
        <button
          class="carousel-control-next flecha-der-abajo"
          type="button"
          data-bs-target="#carouselExampleControls2"
          data-bs-slide="next"
        >
          <span class="margen-flecha-derecha" aria-hidden="true"
            ><img
              src="../components/img/homeview/icon_arrow_left_.png"
              alt="Deslizar a la derecha"
              style="transform: rotate(180deg)"
          /></span>
          <span class="visually-hidden">Next</span>
        </button>
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
  padding-top: 25vh;
}
main h1 {
  text-align: center;
  padding-top: 5%;
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
.carousel-item .card {
  height: 60vh;
  width: 55vh;
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  margin: 1%;
}
.card {
  padding-top: 47vh;
  padding-bottom: 22vh;
}
.card img {
  position: absolute;
  top: -100px;
  right: 0;
  left: 20px;
  bottom: 0;
}
.card-header p {
  color: white;
  display: flex;
}
.card-header a {
  display: flex;
  align-items: end;
}

.cards-wrapper {
  display: flex;
  justify-content: center;
  padding: 5vh;
}

#card-detalle-producto {
  padding: 7vh;
}
.card-img-top {
  max-width: 90%;
  max-height: 90%;
}
#estilo-card-header {
  display: flex;
  background-color: #68026a;
  justify-content: space-between;
  padding: 2vh;
}
#btn-ver-producto {
  margin: 10px;
  background: #940051;
  color: white;
}
.margen-flecha-izquierda {
  display: flex;
  justify-content: space-between;
  margin-right: 20vh;
}

.margen-flecha-derecha {
  display: flex;
  justify-content: end;
  margin-left: 20vh;
}
.carousel-control-prev {
  margin-top: 14%;
  height: 0;
}
.carousel-control-next {
  margin-top: 14%;
  height: 0;
}
.flecha-izq-abajo {
  margin-top: 60vh;
  margin-left: 2vh;
}
.flecha-der-abajo {
  margin-top: 59vh;
  margin-right: 2vh;
}
</style>
