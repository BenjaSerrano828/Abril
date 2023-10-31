<template>
  <div class="barra">
    <ol class="breadcrumb" id="navegacion-secundaria">
      <li class="nav-link breadcrumb-item">
        <router-link to="/"><a href="">Inicio</a></router-link>
      </li>
      <li class="breadcrumb-item">Producto</li>
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
}

.nav-link a {
  text-decoration: none;
  color: white;
}
</style>
