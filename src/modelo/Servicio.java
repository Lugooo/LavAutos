package modelo;

import controlador.Coordinador;

public class Servicio {

    private String nombre;
    private String descripcion;
    private int precio;
    private String nombreEmpleado;
    private Coordinador miCoordinador;

    public Servicio() {

    }

    public void setCoordinador(Coordinador miCoordinator) {
        this.miCoordinador = miCoordinator;
    }

    public Servicio(String nombre, String descripcion, int precio, String nombreEmpleado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

}
