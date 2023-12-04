<script setup>
import { ref } from "vue";

const props = defineProps({
  id: {
    type: String,
    required: true,
  },
  nombre: {
    type: String,
    required: true,
  },
  descripcion: {
    type: String,
    required: true,
  },
  formato: {
    type: String,
    required: true,
  },
  precio: {
    type: String,
    required: true,
  },
  stock: {
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
</script>

<template>
  <div class="container-card">
    <!--Card Producto-->
    <div class="card" id="card-detalle-producto">
      <div class="card-body">
        <div class="row">
          <div class="col-lg-6">
            <img
              class="imagen"
              :src="imagen"
              alt=""
            />
          </div>
          <div class="col-lg-6 detalle">
            <form>
              <h2 class="card-title" style="color: black">
                {{nombre}}
              </h2>

              <ul class="list-group">
                <li
                  class="list-group-item"
                  style="display: flex; justify-content: space-between"
                >
                  <p>
                    Descripción: {{descripcion}}
                  </p>
                  <p style="margin-left: 1vh">Formato: {{formato}}</p>
                </li>
                <li
                  class="list-group-item"
                  style="display: flex; justify-content: space-between"
                >
                  <h5>Precio: {{precio}} c/u</h5>
                  <h6 style="color: black">Disponibilidad: {{stock}} en stock</h6>
                </li>
              </ul>
              <input
                type="number"
                id="cantidad"
                name="cantidad"
                autocomplete="off"
                min="1"
                max="5"
                value="1"
              />
              <button type="submit" class="btn btn-dark">
                Añadir al carrito
              </button>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
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
