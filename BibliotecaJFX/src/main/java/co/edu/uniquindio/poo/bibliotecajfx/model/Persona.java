package co.edu.uniquindio.poo.bibliotecajfx.model;

public class Persona {
    private String nombrePersona, identificacion, genero, correo, telefono;
    private int edad;

    public Persona(String nombrePersona, String identificacion, String genero, String correo, String telefono, int edad) {
        this.nombrePersona = nombrePersona;
        this.identificacion = identificacion;
        this.genero = genero;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
