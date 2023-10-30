import { createRouter, createWebHistory } from 'vue-router';
import HomeView from '../views/HomeView.vue';
import Login from '../views/Login.vue';
import Registro from '../views/Registro.vue';
import CrearNuevoUsuario from '../views/CrearNuevoUsuario.vue';
import EditarUsuario from '../views/EditarUsuario.vue';
import CrearNuevoProducto from '../views/CrearNuevoProducto.vue';
import EditarProducto from '../views/EditarProducto.vue';
import Carrito from '../views/Carrito.vue';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/login',
      name: 'login',
      component: Login
    },
    {
      path: '/registro',
      name: 'registro',
      component: Registro
    },
    {
      path: '/crear-nuevo-usuario',
      name: 'crear-nuevo-usuario',
      component: CrearNuevoUsuario
    },
    {
      path: '/editar-usuario',
      name: 'editar-usuario',
      component: EditarUsuario
    },
    {
      path: '/crear-nuevo-producto',
      name: 'crear-nuevo-producto',
      component: CrearNuevoProducto
    },
    {
      path: '/editar-producto',
      name: 'editar-producto',
      component: EditarProducto
    }
    ,
    {
      path: '/carrito',
      name: 'carrito',
      component: Carrito
    }
  ]
})

export default router
