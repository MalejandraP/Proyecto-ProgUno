package co.edu.uniquindio.poo.bibliotecajfx.controller;


import co.edu.uniquindio.poo.bibliotecajfx.model.Persona;
import co.edu.uniquindio.poo.bibliotecajfx.model.Biblioteca;
import java.util.Collection;

public class PersonaController {

    Biblioteca biblioteca;

    public PersonaController(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public boolean crearPersona(Persona persona) {
        return biblioteca.agregarPersona(persona);
    }

    public Collection<Persona> obtenerListaPersonas() {
        return biblioteca.getListPersonas();
    }

    public boolean eliminarPersona(String identificacion) {
        return biblioteca.eliminarPersona(identificacion);
    }

    public boolean actualizarPersona(String identificacion, Persona persona) {
        return biblioteca.actualizarPersona(identificacion, persona);
    }
}