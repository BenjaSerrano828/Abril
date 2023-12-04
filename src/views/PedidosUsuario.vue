<script setup>
import Navbar from "../components/Navbar.vue";
import Footer from "../components/Footer.vue";
import { RouterLink } from "vue-router";
</script>

<template>
  <Navbar></Navbar>

  <main>
    <div class="barra">
      <ol class="breadcrumb" id="navegacion-secundaria">
        <li class="nav-link breadcrumb-item">
          <RouterLink to="/">Inicio</RouterLink>
        </li>
        <li class="nav-link breadcrumb-item">Mis pedidos</li>
      </ol>
    </div>
    <div class="container">
      <!---->
      <div class="card">
        <div class="card-header" style="background-color: #930050">
          <ul class="nav nav-tabs card-header-tabs">
            <li class="nav-item">
              <span
                class="nav-link active mr-2 border-bottom border-secondary"
                style="color: black"
              >
                <h4>Mis pedidos</h4>
              </span>
            </li>
          </ul>
        </div>
        <div
          class="tab-pane"
          id="lista-pedidos"
          role="tabpanel"
          aria-labelledby="Admin-Pedidos-tab"
        >
          <table class="table">
            <caption></caption>
            <thead>
              <tr>
                <th scope="col">ID Compra</th>
                <th scope="col">Estado</th>
                <th scope="col">Fecha Compra</th>
                <th scope="col">Fecha Estimada <br />de Entrega</th>
                <th scope="col">Total Pedido</th>
                <th scope="col">Acciones</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <th scope="row">1</th>
                <td>
                  <label
                    name="estado"
                    id="estado"
                    style="
                      background-color: green;
                      padding: 3%;
                      border-radius: 20px;
                      color: white;
                    "
                  >
                    Listo para despacho
                  </label>
                </td>
                <td>28/09/2023</td>
                <td>04/10/2023</td>
                <td>$51.000</td>
                <td>
                  <ul>
                    <li>Serum x1 .........$16.000</li>
                    <li>Crema x2 ........$25.000</li>
                    <li>Shampoo x1 .....$10.000</li>
                  </ul>
                </td>
              </tr>
              <tr>
                <th scope="row">2</th>
                <td>
                  <label
                    name="estado"
                    id="estado"
                    style="
                      background-color: yellow;
                      padding: 3%;
                      border-radius: 20px;
                    "
                  >
                    En preparación
                  </label>
                </td>
                <td>15/10/2023</td>
                <td>20/10/2023</td>
                <td>$30.000</td>
                <td>
                  <ul>
                    <li>Serum x2 .........$10.000</li>
                    <li>Crema x1 ........$10.000</li>
                    <li>Shampoo x1 .....$10.000</li>
                  </ul>
                </td>
              </tr>
              <tr>
                <th scope="row">3</th>
                <td>
                  <label
                    name="estado"
                    id="estado"
                    style="
                      background-color: yellow;
                      padding: 3%;
                      border-radius: 20px;
                    "
                  >
                    En preparación
                  </label>
                </td>
                <td>25/11/2023</td>
                <td>30/11/2023</td>
                <td>$45.000</td>
                <td>
                  <ul>
                    <li>Serum x1 .........$10.000</li>
                    <li>Crema x1 ........$25.000</li>
                    <li>Shampoo x2 .....$10.000</li>
                  </ul>
                </td>
              </tr>
            </tbody>
          </table>
        </div>
      </div>
    </div>
  </main>
  <Footer></Footer>
</template>

<style scoped>
@import url("https://fonts.cdnfonts.com/css/kufam-2");

main {
  color: white;
  background-color: #69003a;
  padding-top: 160px;
  padding-bottom: 150px;
  font-family: kufam;
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
table {
  margin-left: 1%;
  margin-right: 1%;
  margin-top: 1%;
}
#lista-pedidos{
  display: flex;
}
</style>
