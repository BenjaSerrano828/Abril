<script setup>
import { defineProps } from "vue";
import { useRouter } from "vue-router";

const props = defineProps(["vistas", "rutaActual"]);

const obtenerTitulo = () => {
  const vistaActual = props.vistas.find(
    (vista) => vista.title === props.rutaActual.replace("/", "")
  );
  return vistaActual ? vistaActual.title : "";
};

const router = useRouter();
</script>

<template>
  <div class="barra">
    <ol class="breadcrumb" id="navegacion-secundaria">
      <li class="nav-link breadcrumb-item">
        <router-link to="/">Inicio</router-link>
      </li>
      <li class="breadcrumb-item" v-if="router.currentRoute.value.path !== '/'">
        {{ obtenerTitulo() }}
      </li>
    </ol>
  </div>
</template>

<style scoped>
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
</style>
