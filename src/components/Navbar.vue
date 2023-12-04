<template>
  <header>
    <div class="row align-items-center">
      <div class="col-3">
        <router-link to="/">
          <a class="logo">
            <img
              src="./icons/Logo2__1_-removebg-preview 3 (1).png"
              alt="Logo Abril"
            />
          </a>
        </router-link>
      </div>
      <div class="col-4 nav-links">
        <nav>
          <ul>
            <li>
              <a class="nav-link">Skincare</a>
            </li>
            <li>
              <a class="nav-link">Cabello</a>
            </li>
            <li>
              <a class="nav-link">Jabones</a>
            </li>
          </ul>
        </nav>
      </div>
      <div class="col-2 busqueda">
        <form class="form-inline">
          <input
            class="form-control barra-busqueda"
            type="search"
            placeholder="¿Qué estás buscando?"
          />
        </form>
      </div>
      <div class="col-3 iconos">
        <router-link to="/carrito"
          ><a class="icono-nav-carrito"
            ><img src="./icons/icon_cart.png" alt="Carrito" /></a
        ></router-link>
        <div class="dropdown">
          <button
            class="btn"
            type="button"
            data-bs-toggle="dropdown"
            aria-expanded="false"
          >
            <a class="icono-nav-perfil"
              ><img src="./icons/icon_user.png" alt="Perfil"
            /></a>
          </button>
          <ul class="dropdown-menu">
            <li class="letra-menu">
              <router-link to="/registro"
                ><a class="dropdown-item">Registrarse</a></router-link
              >
            </li>
            <li class="letra-menu">
              <router-link to="/login"
                ><a class="dropdown-item">Iniciar Sesión</a></router-link
              >
            </li>
            <li class="letra-menu">
              <router-link to="/vista-cliente"
                ><a class="dropdown-item">Vista Cliente</a></router-link
              >
            </li>
            <li class="letra-menu">
              <router-link to="/vista-admin"
                ><a class="dropdown-item">Vista Admin</a></router-link
              >
            </li>
            <li class="letra-menu">
              <router-link to="/pedidos-usuario"
                ><a class="dropdown-item">Mis Pedidos (cliente)</a></router-link
              >
            </li>
            <li class="letra-menu">
              <router-link to="/administrador"
                ><a class="dropdown-item">Administrador</a></router-link
              >
            </li>
          </ul>
        </div>
      </div>
    </div>
  </header>
</template>

<style scoped>
header {
  background-color: #3a0020;
  color: #ffffff;
  z-index: 100;
  top: 0;
  width: 100%;
  position: fixed;
}
.logo img {
  margin: 2vh 0 2vh 2vh;
}
.nav-links {
  margin-top: 2vh;
}
nav ul {
  list-style: none;
  display: flex;
  justify-content: space-between;
  margin-right: 5vh;
}
.nav-link a {
  text-decoration: none;
  color: white;
}
nav a {
  font-size: 25px;
  text-decoration: none;
  color: white;
}
nav a:hover {
  color: rgb(234, 255, 0);
}
.iconos {
  display: flex;
  justify-content: end;
}
.icono-nav-perfil img {
  height: 70px;
  margin-left: 15px;
  margin-right: 25px;
}
.icono-nav-carrito img {
  margin-top: 2vh;
  height: 53px;
}
.letra-menu a {
  text-decoration: none;
}
</style>
