<script setup>
import Navbar from "../components/Navbar.vue";
import NavSecundaria from "../components/NavSecundaria.vue";
import Footer from "../components/Footer.vue";
</script>

<template>
  <header><Navbar></Navbar></header>

  <main>
    <div>
      <NavSecundaria></NavSecundaria>
      <div class="container-carrito">
        <div class="card">
          <h4 class="card-title">Carrito de compras</h4>
          <div class="card-body col-12">
            <img src="../components/icons/crema amarilla 1.png" alt="" />
            <h5 style="padding-left: 2%">
              Serum
              <p>$8.000 c/u</p>
            </h5>
            <div class="cantidada col-4">
              <div class="boton-menos">
                <button><img src="../components/icons/Minus.png" alt="" /></button>
              </div>
              <div class="input-value">
                <input
                  type="number"
                  id="numero-producto-carrito"
                  value="2"
                  min="1"
                />
              </div>
              <div class="boton-mas">
                <button><img src="../components/icons/Plus.png" alt="" /></button>
              </div>
              <div class="precio">
                <h5>$16.000</h5>
              </div>
              <div class="button-trash">
                <button><img src="../components/icons/Trash.png" alt="" /></button>
              </div>
            </div>
            <div class="col-3 titulo-detalle-carrito">
              <h5>3 Productos seleccionados para el pedido</h5>
            </div>
          </div>
          <div class="col-8">
            <hr size="20px" color="black" />
          </div>
          <div class="card-body col-12">
            <img src="../components/icons/crema 1.png" alt="" />
            <h5 style="padding-left: 2%">
              Crema de limpieza
              <p>$7.000 c/u</p>
            </h5>
            <div class="cantidad col-4">
              <div class="boton-menos">
                <button><img src="../components/icons/Minus.png" alt="" /></button>
              </div>
              <div class="input-value">
                <input
                  type="number"
                  id="numero-producto-carrito"
                  value="2"
                  min="1"
                />
              </div>
              <div class="boton-mas">
                <button><img src="../components/icons/Plus.png" alt="" /></button>
              </div>
              <div class="precio">
                <h5>$14.000</h5>
              </div>
              <div class="button-trash">
                <button><img src="../components/icons/Trash.png" alt="" /></button>
              </div>
            </div>
            <div class="col-4 lista-detalle-carrito">
              <ul>
                <li>Serum x2 .............................. $16.000</li>
                <li>Crema de limpieza x2.......... $14.000</li>
                <li>Crema de arandanos x1....... $10.000</li>
              </ul>
            </div>
          </div>
          <div class="col-8">
            <hr size="20px" color="black" />
          </div>
          <div class="card-body col-12">
            <img src="../components/icons/crema 1.png" alt="" />
            <h5 style="padding-left: 2%">
              Crema de limpieza
              <p>$10.000 c/u</p>
            </h5>
            <div class="cantidad col-4">
              <div class="boton-menos">
                <button><img src="../components/icons/Minus.png" alt="" /></button>
              </div>
              <div class="input-value">
                <input
                  type="number"
                  id="numero-producto-carrito"
                  value="1"
                  min="1"
                />
              </div>
              <div class="boton-mas">
                <button><img src="../components/icons/Plus.png" alt="" /></button>
              </div>
              <div class="precio">
                <h5>$10.000</h5>
              </div>
              <div class="button-trash">
                <button><img src="../components/icons/Trash.png" alt="" /></button>
              </div>
            </div>
            <div class="col-4 total-realizar-pedido">
              <h3>Precio Total: $40.000</h3>
              <button class="btn btn-dark" type="submit">
                Realizar pedido
              </button>
            </div>
          </div>
          <div class="col-8">
            <hr size="20px" color="black" />
          </div>
        </div>
      </div>
    </div>
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
.container-carrito {
  background-color: #640238;
  padding: 0 5% 9% 5%;
  width: 100%;
}

.card {
  height: 100%;
  color: rgb(0, 0, 0);
}

.card-body {
  background-color: white;
  display: flex;
}

.card-body img {
  width: 14%;
  height: 100%;
}

.card-body h5 {
  text-align: left !important;
  margin-top: 4%;
  margin-left: 1%;
  padding-right: 1%;
}

.button-trash {
  margin-left: 7%;
  align-items: center;
  justify-content: center;
}

.button-trash button {
  border: none;
  background-color: white;
}

.button-trash button img {
  width: 100%;
}

.boton-menos button {
  margin-top: 11%;
  margin-left: 1%;
  border: none;
  background-color: white;
}

.boton-menos button img {
  width: 100%;
}

.cantidad {
  display: flex;
  align-items: center;
}

.cantidada {
  margin-left: 7%;
  display: flex;
  align-items: center;
}

.precio {
  margin-top: 2%;
  display: flex;
  align-items: center;
}

.input-value {
  width: 18%;
}

.input-value input {
  width: 100%;
}

.boton-menos {
  padding: 10%;
}

.boton-mas {
  padding: 10%;
}

.boton-mas button {
  margin-top: 11%;
  border: none;
  background-color: white;
}

.boton-mas button img {
  width: 100%;
}

.titulo-detalle-carrito {
  display: flex;
  float: right;
  justify-content: center;
  align-items: center;
  margin-left: 5%;
}

.total-realizar-pedido {
  display: flex;
  float: right;
  justify-content: center;
  align-items: center;
  margin-left: 5%;
}

.total-realizar-pedido button {
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: #68026a;
  color: white;
  border-radius: 16px;
}

.lista-detalle-carrito {
  display: flex;
  justify-content: center;
  align-items: center;
  margin-left: 1%;
}

.titulo-detalle-carrito h5 {
  word-wrap: break-word;
  display: flex;
}

.detalle-carrito {
  display: flex;
}

.card-title {
  color: white;
  background-color: #930050;
  padding: 1% 0 1% 1%;
}
</style>
