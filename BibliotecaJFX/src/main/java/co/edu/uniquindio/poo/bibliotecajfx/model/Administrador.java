package co.edu.uniquindio.poo.bibliotecajfx.model;

import java.util.Collection;
import java.util.LinkedList;


public class Administrador extends Persona {
    private Collection<Empleado> empleados;
    private Biblioteca biblioteca;
    private Prestamo prestamo;

    public Administrador(String nombrePersona, String identificacion, String genero, String correo, String telefono, int edad, Biblioteca biblioteca, Prestamo prestamo) {
        super(nombrePersona, identificacion, genero, correo, telefono, edad);
        this.empleados = new LinkedList<>();
        this.biblioteca = biblioteca;
        this.prestamo = prestamo;

    }
    /**
     * Metodo para generar reporte de la lista de préstamos que se hicieron durante el mes
     * SIN HACER
     * @param prestamo
     * @return
     */
    public Collection<Prestamo> mostrarPrestamosDelMes(Prestamo prestamo) {
        Collection<Prestamo> prestamosDelMes = new LinkedList<>();
        return prestamosDelMes;
    }

    /**
     * Metodo para saber cuantos empleados han sido eliminados (despedidos, sacados del sistema)
     * SIN HACER
     * @return
     */
    public int cantidadEmpleadosEliminados(){
        return empleados.size();
    }
    public boolean registrarEmpleado(Empleado empleado) {
        return biblioteca.agregarPersona(empleado);
    }
    public boolean modificarEmpleado(Empleado empleado) {
        return biblioteca.actualizarPersona(empleado.getIdentificacion(), empleado);
    }
    public boolean eliminarEmpleado(Empleado empleado) {
        return biblioteca.eliminarPersona(empleado.getIdentificacion());
    }

    public Collection<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Collection<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }
}
