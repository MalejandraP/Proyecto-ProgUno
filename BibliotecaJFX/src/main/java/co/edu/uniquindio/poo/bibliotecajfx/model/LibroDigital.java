package co.edu.uniquindio.poo.bibliotecajfx.model;

public class LibroDigital extends Libro {
    private FormatoLibroDigital formato;
    public LibroDigital(String titulo, String autor, String genero, int anioPublicacion, EstadoLibro estadoLibro, Prestamo prestamo, FormatoLibroDigital formato) {
        super(titulo, autor, genero, anioPublicacion, estadoLibro, prestamo);
        this.formato = formato;
    }
}
