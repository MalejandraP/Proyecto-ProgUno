package co.edu.uniquindio.poo.bibliotecajfx.model;

public class Empleado extends Persona{

    private String cargo;

    public Empleado(String nombrePersona, String identificacion, String genero, String correo, String telefono, int edad, String cargo) {
        super(nombrePersona, identificacion, genero, correo, telefono, edad);
        this.cargo=cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
