package co.edu.uniquindio.poo.bibliotecajfx.model;

public class Libro {
    private String titulo, autor, genero;
    private int anioPublicacion;
    private EstadoLibro estadoLibro;
    private Prestamo prestamo;


    public Libro(String titulo, String autor, String genero, int anioPublicacion, EstadoLibro estadoLibro, Prestamo prestamo) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anioPublicacion = anioPublicacion;
        this.estadoLibro = estadoLibro;
        this.prestamo = prestamo;

    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getGenero() {
        return genero;
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public EstadoLibro getEstadoLibro() {
        return estadoLibro;
    }
    public void setEstadoLibro(EstadoLibro estadoLibro) {
        this.estadoLibro = estadoLibro;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    public Prestamo getPrestamo() {
        return prestamo;
    }
    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

}
