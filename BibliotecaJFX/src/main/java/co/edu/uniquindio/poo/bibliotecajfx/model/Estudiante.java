package co.edu.uniquindio.poo.bibliotecajfx.model;

public class Estudiante extends Usuario{
    private String credencial;

    public Estudiante(String nombrePersona, String identificacion, String genero, String correo,String telefono, int edad, String credencial) {
        super(nombrePersona, identificacion, genero, correo, telefono, edad);
        this.credencial = credencial;
    }

    public String getCredencial() {
        return credencial;
    }

    public void setCredencial(String credencial) {
        this.credencial = credencial;
    }
}
