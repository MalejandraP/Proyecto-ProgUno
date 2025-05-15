package co.edu.uniquindio.poo.bibliotecajfx.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Prestamo {
    private LocalDate fecha, fechaMaximaDevolucion, fechaDevolucion;
    private double deuda;
    private Libro libro;
    private Usuario usuario;

    public Prestamo(LocalDate fecha, LocalDate fechaMaximaDevolucion,LocalDate fechaDevolucion, double deuda,Libro libro, Usuario usuario) {
        this.fecha = fecha;
        this.fechaMaximaDevolucion = fechaMaximaDevolucion;
        this.fechaDevolucion = fechaDevolucion;
        this.deuda = deuda;
        this.libro = libro;
        this.usuario = usuario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFechaMaximaDevolucion() {
        return fechaMaximaDevolucion;
    }

    public void setFechaMaximaDevolucion(LocalDate fechaMaximaDevolucion) {
        this.fechaMaximaDevolucion = fechaMaximaDevolucion;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }


    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public double calcularDeuda(){
        double deuda = 2000;
        if (fechaMaximaDevolucion.isBefore(fechaDevolucion)){
            deuda= deuda * ChronoUnit.DAYS.between(fechaMaximaDevolucion, fechaDevolucion);
        }
        else{
            deuda = 0;
        }
        return deuda;
    }
}
