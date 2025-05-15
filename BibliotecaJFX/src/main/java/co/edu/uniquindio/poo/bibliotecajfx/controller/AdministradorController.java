package co.edu.uniquindio.poo.bibliotecajfx.controller;

import co.edu.uniquindio.poo.bibliotecajfx.model.Biblioteca;
import co.edu.uniquindio.poo.bibliotecajfx.model.Empleado;

public class AdministradorController {
    private Biblioteca biblioteca;

    public AdministradorController(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public boolean registrarEmpleado(Empleado empleado) {
        return biblioteca.agregarPersona(empleado);
    }
    public boolean eliminarEmpleado(Empleado empleado) {
        return biblioteca.eliminarPersona(empleado.getIdentificacion());
    }
    public boolean modificarEmpleado(Empleado empleado) {
        return biblioteca.actualizarPersona(empleado.getIdentificacion(), empleado);
    }



}
