
import vueRouter from "vue-router"
import BuscarReserva from "./components/BuscarReserva"
import Checkin from "./components/CheckIn"
import VerReservas from "./components/VerReservas"
import checkout from "./components/CheckOut"
import Login from "./components/Login"

const router = new vueRouter ({
    mode: 'history',
    base: __dirname,
    routes: [
        {
            path: '/checkin',
            name: 'checkin',
            component: Checkin
        },
        {
            path: '/verreservas',
            name: 'verreservas',
            component: VerReservas
        },
        {
            path: '/checkout',
            name: 'checkout',
            component: checkout
        },
        {
            path: '/buscar',
            name: 'buscarreserva',
            component: BuscarReserva
        },
        {
            path: '/login',
            name: 'login',
            component: Login
        },
    ]
})

export default router