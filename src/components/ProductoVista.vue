<script setup>
import { ref } from "vue";
import { useRouter } from "vue-router";

const props = defineProps({
  id: {
    type: String,
    required: true,
  },
  nombre: {
    type: String,
    required: true,
  },
  precio: {
    type: String,
    required: true,
  },
  formato: {
    type: String,
    required: true,
  },
  imageUrl: {
    type: String,
    required: true,
  },
});

const imagen = ref("");

imagen.value = props.imageUrl;
const router = useRouter();

function verProducto() {
  router.push({ name: "detalle-producto", params: { id: id.value } });
}
</script>

<template>
  <div class="card">
    <img :src="imagen" class="card-img-top" alt="" />
    <div style="text-align: center">
      <h5>{{ nombre }}</h5>
      <div class="card-header" id="estilo-card-header">
        <p>Precio: {{ precio }}</p>
        <p>Formato: {{ formato }}</p>
      </div>
      <router-link to="/detalle-producto"
        ><button type="button" class="btn" id="btn-ver-producto">
          Ver Producto
        </button></router-link
      >
    </div>
  </div>
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
  padding-top: 5%;
}
.barra {
  margin: 0 1% 0 22%;
  display: flex;
}
#navegacion-secundaria {
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
</style>
