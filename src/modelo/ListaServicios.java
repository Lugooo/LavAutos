package modelo;

import controlador.Coordinador;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListaServicios {

    private Coordinador miCoordinador;

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }
    ArrayList<Servicio> listaServicios;

    public ListaServicios() {
        listaServicios = new ArrayList<>();
        agregarServicio();
    }

    public void agregarServicio() {
        Servicio lavadoBasico = new Servicio("Lavado Basico", "Incluye lavado exterior, lavado interior y aspirada", 20000, "Daniela Silva");
        Servicio lavadoEspecial = new Servicio("Lavado Especial", "Incluye lavado básico mas polichad con máquina y las mejores ceras", 20000, "Johan Moreno");
        Servicio desinfeccionBasica = new Servicio("Desinfeccion Basica", "Con máquina generadora de ozono", 20000, "Daniela Lugo");
        Servicio desinfeccionEspecial = new Servicio("Desinfeccion Especial", "Incluye desinfección básica mas limpieza interior con máquina de vapor", 20000, "Johan Silva");
        Servicio comboUno = new Servicio("Combo 1", "Lavado, polichado, y desengrasante", 80000, "Daniela Johan");
        Servicio comboDos = new Servicio("Combo 2", "Incluye Combo 1 mas grafitado de chasis", 120000, "Johan Daniela");
        Servicio comboTres = new Servicio("Combo 3", "Inlcuye Combo 2 mas tapicería", 150000, "Daniela Johan Moreno Silva");

        listaServicios.add(lavadoBasico);
        listaServicios.add(lavadoEspecial);
        listaServicios.add(desinfeccionBasica);
        listaServicios.add(desinfeccionEspecial);
        listaServicios.add(comboUno);
        listaServicios.add(comboDos);
        listaServicios.add(comboTres);
    }

    public void buscarServicio(String nombre) {
        String encontrado = "";
        for (int i = 0; i < listaServicios.size(); i++) {
            if (nombre.equalsIgnoreCase(listaServicios.get(i).getNombre())) {
                JOptionPane.showMessageDialog(null, "Nombre Servicio: " + listaServicios.get(i).getNombre() + "\n"
                        + "Descripción Servicio: " + listaServicios.get(i).getDescripcion() + "\n"
                        + "Precio Servicio: $" + listaServicios.get(i).getPrecio() + "\n"
                        + "Empleado Asignado: " + listaServicios.get(i).getNombreEmpleado());
            }
        }
    }

    public String buscarEmpleado(String nombre) {
        for (int i = 0; i < listaServicios.size(); i++) {
            if (nombre.equalsIgnoreCase(listaServicios.get(i).getNombre())) {
                nombre = listaServicios.get(i).getNombreEmpleado();
            }
        }
        return nombre;
    }

    public int buscarPrecio(String nombre) {
        int precio = 0;
        for (int i = 0; i < listaServicios.size(); i++) {
            if (nombre.equalsIgnoreCase(listaServicios.get(i).getNombre())) {
                precio = (int) listaServicios.get(i).getPrecio();
            }
        }
        return precio;
    }

    public void visualizarServicios() {
        String visualizar = "";
        for (int i = 0; i < listaServicios.size(); i++) {
            JOptionPane.showMessageDialog(null, "Nombre: " + listaServicios.get(i).getNombre() + "\n"
                    + "Descripción: " + listaServicios.get(i).getDescripcion() + "\n"
                    + "Precio: " + listaServicios.get(i).getPrecio() + "\n"
                    + "Asignado a: " + listaServicios.get(i).getNombreEmpleado());
        }
    }
}
