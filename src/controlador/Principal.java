package controlador;

import modelo.Carrito;
import modelo.ListaServicios;
import modelo.Servicio;
import vista.LavadoEstrella;

public class Principal {

    public static void main(String[] args) {
        
        LavadoEstrella ventanaPrincipal = new LavadoEstrella();
        Servicio servicio = new Servicio();
        ListaServicios listaServicios = new ListaServicios();
        Carrito carrito = new Carrito();
        Coordinador miCoordinador = new Coordinador();

        ventanaPrincipal.setCoordinador(miCoordinador);
        servicio.setCoordinador(miCoordinador);
        listaServicios.setCoordinador(miCoordinador);
        carrito.setCoordinador(miCoordinador);
        
        miCoordinador.setVentanaPrincipal(ventanaPrincipal);
        miCoordinador.setServicio(servicio);
        miCoordinador.setListaServicios(listaServicios);
        miCoordinador.setCarrito(carrito);
        
        ventanaPrincipal.setVisible(true); 
    }

}
