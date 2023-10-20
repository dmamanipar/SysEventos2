// src/router.js
import { createRouter, createWebHistory } from 'vue-router';
import Login from './components/LoginSis.vue';
import MainMenu from './components/MainMenu.vue';
import InicioMenu from '../src/pages/InicioMenu.vue';
import PeriodoVista from '../src/pages/referencial/periodo/view/PeriodoVista.vue';
import UsuarioVista from '../src/pages/referencial/usuario/view/UsuarioVista.vue';
import store from './store';
const routes = [
  {
    path: '/',
    name: 'Login',
    component: Login
  },
  {
    path: '/app',
    component: MainMenu,
    children: [
      {
        path: 'home',
        name: 'Home',
        component: InicioMenu // Este será tu HomePage
      },
      {
        path: 'periodo',
        name: 'Periodos',
        component: PeriodoVista //
      },
      {
        path: 'usuario',
        name: 'Usuarios',
        component: UsuarioVista //
      },    ]
  }
]

const router = createRouter({
  history: createWebHistory(),
  routes // short for `routes: routes`
})

/*Esta linea la aregue ahora */

// router.js
router.beforeEach(async (to, from, next) => {
  // Verifica si el usuario está autenticado y si los detalles del usuario están en el store
  if (localStorage.getItem('token') && !store.state.user) {
    // Si el token existe y el usuario no está en el store, busca los detalles del usuario
    await store.dispatch('fetchUserDetails');
  }
  next();
});


export default router;
