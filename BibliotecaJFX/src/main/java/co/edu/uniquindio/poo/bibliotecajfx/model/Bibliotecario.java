package co.edu.uniquindio.poo.bibliotecajfx.model;

import java.util.Collection;
import java.util.LinkedList;

public class Bibliotecario extends Empleado {
    private Collection<Prestamo> prestamos;
    private Collection<Libro> libros;

    public Bibliotecario(String nombrePersona, String identificacion, String genero, String correo, String telefono, int edad){
        super(nombrePersona, identificacion, genero, correo, telefono, edad);
        this.prestamos = new LinkedList<>();
        this.libros = new LinkedList<>();

    }

    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Collection<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public Collection<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Collection<Libro> libros) {
        this.libros = libros;
    }
}
