package controlador;

import javax.swing.JTextField;
import modelo.Carrito;
import modelo.ListaServicios;
import modelo.Servicio;
import vista.LavadoEstrella;

public class Coordinador {

    private LavadoEstrella ventanaPrincipal;
    private Servicio servicio;
    private ListaServicios listaServicios;
    private Carrito carrito;

    public Coordinador() {

    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public void setVentanaPrincipal(LavadoEstrella ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public void setListaServicios(ListaServicios listaServicio) {
        this.listaServicios = listaServicio;
    }

    public void agregarCarrito(String txtFecha, String selecionAuto, String tipoServicio, double precio, String nombreEmpleado) {
        carrito.agregarCarrito(txtFecha, selecionAuto, tipoServicio, precio, nombreEmpleado);
    }

    public int buscarPrecio(String nombre) {
        return listaServicios.buscarPrecio(nombre);
    }

    public String tipoVehiculo(String tipoVehiculo) {
        return carrito.tipoVehiculo(tipoVehiculo);
    }

    public void buscarServicio(String nombre) {
        listaServicios.buscarServicio(nombre);
    }

    public void visualizarCarrito() {
        carrito.visualizarCarrito();
    }

    public void visualizarServicios() {
        listaServicios.visualizarServicios();
    }
    
    public double produccionServicio(String nombreServicio){
        return carrito.produccionServicio(nombreServicio);
    }
    
    public String buscarEmpleado(String nombre){
        return listaServicios.buscarEmpleado(nombre);
    }
    
    public double produccionFuncionario(String nombreServicio){
        double total = carrito.produccionFuncionario(nombreServicio);
        return total;
    }

}
