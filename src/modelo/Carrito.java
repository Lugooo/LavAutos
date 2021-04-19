package modelo;

import controlador.Coordinador;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Carrito {

    private String fecha;
    private String tipoVehiculo;
    private String servicio;
    private double precio;
    private String nombreEmpleado;
    ArrayList<Carrito> carrito;
    private Coordinador miCoordinador;

    public Carrito(String fecha, String servicio, String tipoVehiculo, double precio, String nombreEmpleado) {
        this.fecha = fecha;
        this.tipoVehiculo = tipoVehiculo;
        this.servicio = servicio;
        this.precio = precio;
        this.nombreEmpleado = nombreEmpleado;
    }

    public Carrito() {
        this.fecha = "";
        this.tipoVehiculo = "";
        this.servicio = "";
        this.precio = 0;
        this.carrito = new ArrayList<>();
        visualizarCarrito();
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setMiCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }

    public void agregarCarrito(String fecha, String servicio, String tipoVehiculo, double precio, String nombreEmpleado) {
        Carrito carritoCargar = new Carrito(fecha, servicio, tipoVehiculo, precio, nombreEmpleado);
        carrito.add(carritoCargar);
        JOptionPane.showMessageDialog(null, "Agregado correctamente");
    }

    public String tipoVehiculo(String tipoVehiculo) {
        tipoVehiculo = "";
        if (tipoVehiculo.equalsIgnoreCase("Automovil")) {
            tipoVehiculo = "Automovil";
        } else if (tipoVehiculo.equalsIgnoreCase("Camioneta")) {
            tipoVehiculo = "Camnioneta";
        }
        return tipoVehiculo;
    }

    public void visualizarCarrito() {
        for (int i = 0; i < carrito.size(); i++) {
            JOptionPane.showMessageDialog(null, "Fecha: " + carrito.get(i).getFecha() + "\n"
                    + "Servicio: " + carrito.get(i).getServicio() + "\n"
                    + "Tipo Vehículo: " + carrito.get(i).getTipoVehiculo());
        }
    }

    public double produccionServicio(String nombreServicio) {
        double total = 0;
        for (int i = 0; i < carrito.size(); i++) {
            if (nombreServicio.equalsIgnoreCase(carrito.get(i).getServicio())) {
                total += carrito.get(i).getPrecio();
            }
        }
        
        return total;
    }

    public double produccionFuncionario(String nombreServicio) {
        double total = 0;
        for (int i = 0; i < carrito.size(); i++) {
            if (nombreServicio.equalsIgnoreCase(carrito.get(i).getServicio())) {
                total += carrito.get(i).getPrecio();
            }
        }
        return total;
    }

}
