<script setup>
import { usuarios } from "../mocks/usuarios.js";
import Navbar from "../components/Navbar.vue";
import Footer from "../components/Footer.vue";
import { RouterLink } from "vue-router";
import Usuario from "../components/Usuario.vue";
import { productos } from "../mocks/productos.js";
import ProductoLista from "../components/ProductoLista.vue";
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
            <ul class="nav nav-tabs card-header">
              <li class="nav-item">
                <span class="nav-link span-titulo">
                  <h4>Administrador</h4>
                </span>
              </li>
            </ul>
            <ul class="nav nav-tabs" id="nav-tab" role="tablist">
              <li role="presentation">
                <button
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
                </button>
              </li>
              <li role="presentation">
                <button
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
                </button>
              </li>
              <li role="presentation">
                <button
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
                </button>
              </li>
            </ul>
          </div>

          <div class="tab-content" id="nav-tabContent">
            <div
              class="tab-pane fade show active"
              id="lista-usuarios"
              role="tabpanel"
              aria-labelledby="Admin-Usuarios-tab"
              tabindex="0"
            >
              <!--Boton Nuevo Usuario -->
              <div class="boton-nuevo-usuario">
                <h6>
                  Nuevo
                  <br />Usuario
                </h6>
                <router-link to="/crear-nuevo-usuario"
                  ><img
                    class="img-add"
                    src="../components/icons/Add.png"
                    alt="add"
                /></router-link>
              </div>

              <!--Tabla usuarios-->

              <table class="table">
                <caption></caption>
                <thead>
                  <tr>
                    <th scope="col">Tipo</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Apellido</th>
                    <th scope="col">Rut</th>
                    <th scope="col">Correo</th>
                    <th scope="col">Telefono</th>
                    <th scope="col">Direccion</th>
                    <th scope="col">Editar</th>
                    <th scope="col">Eliminar</th>
                  </tr>
                </thead>
                <tbody>
                  <Usuario
                    v-for="u in usuarios"
                    :key="u.rut"
                    :rut="u.rut"
                    :tipo="u.tipo"
                    :nombre="u.nombre"
                    :apellido="u.apellido"
                    :correo="u.correo"
                    :telefono="u.telefono"
                    :direccion="u.direccion"
                  ></Usuario>
                </tbody>
              </table>
            </div>
            <div
              class="tab-pane fade"
              id="lista-productos"
              role="tabpanel"
              aria-labelledby="Admin-Productos-tab"
              tabindex="0"
            >
              <!--Boton Nuevo Producto-->
              <div class="boton-nuevo-producto">
                <h6>
                  Nuevo
                  <br />Producto
                </h6>
                <router-link to="crear-nuevo-producto"
                  ><img
                    class="img-add"
                    src="../components/icons/Add.png"
                    alt="add"
                /></router-link>
              </div>
              <table class="table">
                <caption></caption>
                <thead>
                  <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Tipo</th>
                    <th scope="col">Formato</th>
                    <th scope="col">Precio</th>
                    <th scope="col">Stock</th>
                    <th scope="col">Editar</th>
                    <th scope="col">Eliminar</th>
                  </tr>
                </thead>

                <ProductoLista
                  v-for="p in productos"
                  :key="p.id"
                  :id="p.id"
                  :nombre="p.nombre"
                  :tipo="p.tipo"
                  :formato="p.formato"
                  :precio="p.precio"
                  :stock="p.stock"
                ></ProductoLista>
              </table>
            </div>
            <div
              class="tab-pane fade"
              id="lista-pedidos"
              role="tabpanel"
              aria-labelledby="Admin-Pedidos-tab"
              tabindex="0"
            >
              <table class="table">
                <caption></caption>
                <thead>
                  <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Usuario</th>
                    <th scope="col">Rut</th>
                    <th scope="col">Estado</th>
                    <th scope="col">Fecha Creación</th>
                    <th scope="col">Fecha Entrega</th>
                    <th scope="col">Total Pedido</th>
                    <th scope="col">Acciones</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <th scope="row">1</th>
                    <td>Sebastián Torres</td>
                    <td>20.645.607-8</td>
                    <td>
                      <select
                        name="estado"
                        id="estado"
                        class="form-select"
                        aria-label="Default select example"
                      >
                        <option class="opcion-preparacion" value="1">
                          En preparación
                        </option>
                        <option class="opcion-listo" value="2">
                          Listo para despacho
                        </option>
                      </select>
                    </td>
                    <td>28/09/2023</td>
                    <td>04/10/2023</td>
                    <td>$28.000</td>
                    <td>
                      <a href="#"
                        ><img
                          class="img-accion"
                          src="../components/icons/Delete.png"
                          alt="Eliminar"
                      /></a>
                      <router-link to="/detalle-pedido#detalle-pedido">
                        <button
                          class="btn btn-admin btn-ver-detalles"
                          id="Admin-Pedidos-Detalle-tab"
                          data-bs-toggle="tab"
                          data-bs-target="#detalle-pedido"
                          type="button"
                          role="tab"
                          aria-controls="detalle-pedido"
                          aria-selected="false"
                        >
                          Ver detalles
                        </button>
                      </router-link>
                    </td>
                  </tr>
                </tbody>
              </table>
            </div>
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
