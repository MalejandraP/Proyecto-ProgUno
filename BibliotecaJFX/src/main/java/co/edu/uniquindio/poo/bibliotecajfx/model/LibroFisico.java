package co.edu.uniquindio.poo.bibliotecajfx.model;

public class LibroFisico extends Libro {
    public LibroFisico(String titulo, String autor, String genero, int anioPublicacion, EstadoLibro estadoLibro, Prestamo prestamo) {
        super(titulo, autor, genero, anioPublicacion, estadoLibro, prestamo);
    }
}
