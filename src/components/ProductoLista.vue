<script setup>
const props = defineProps({
  id: {
    type: String,
    required: true,
  },
  nombre: {
    type: String,
    required: true,
  },
  tipo: {
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
});
</script>

<template>
  <tbody>
    <tr>
      <td>{{ id }}</td>
      <td>{{ nombre }}</td>
      <td>{{ tipo }}</td>
      <td>{{ formato }}</td>
      <td>{{ precio }}</td>
      <td>{{ stock }}</td>
      <td>
        <router-link to="/editar-producto"
          ><img
            class="img-accion"
            src="../components/icons/Edit.png"
            alt="Editar"
        /></router-link>
      </td>
      <td>
        <a href="#"
          ><img
            class="img-accion"
            src="../components/icons/Delete.png"
            alt="Eliminar"
        /></a>
      </td>
    </tr>
  </tbody>
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
.card-header {
  background-color: white;
  margin-left: 1vh;
  margin-top: 1vh;
  padding-bottom: 0;
  padding-top: 0;
}
.span-titulo {
  color: black;
  border: none;
}
.nav-menu-admin {
  display: flex;
  background-color: #940051;
  border-top-right-radius: 5px;
  border-top-left-radius: 5px;
}
.nav-menu-admin ul li {
  display: flex;
  justify-content: end;
  margin-top: 4%;
  margin-left: 1vh;
}

.span-titulo h4 {
  color: black;
}
.boton-nuevo-usuario {
  display: flex;
  justify-content: end;
  align-items: center;
  position: absolute;
  right: 0%;
  top: 0;
  color: white;
}
.boton-nuevo-usuario h6 {
  margin-right: 1vh;
}
.boton-nuevo-producto {
  display: flex;
  justify-content: end;
  align-items: center;
  position: absolute;
  right: 0%;
  top: 0%;
  color: white;
}
.img-add {
  width: 10vh;
  margin-bottom: 10%;
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
