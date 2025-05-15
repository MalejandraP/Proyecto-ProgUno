package co.edu.uniquindio.poo.bibliotecajfx.model;

import java.util.Collection;
import java.util.LinkedList;


public class Biblioteca {
    private String nombre, direccion;
    private Collection<Libro> listLibros;
    private Collection<Persona> listPersonas;

    public Biblioteca(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        listLibros = new LinkedList<>();
        listPersonas = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public Collection<Libro> getListLibros() {
        return listLibros;
    }

    public void setListLibros(Collection<Libro> listLibros) {
        this.listLibros = listLibros;
    }

    public Collection<Persona> getListPersonas() {
        return listPersonas;
    }

    public void setListPersonas(Collection<Persona> listPersonas) {
        this.listPersonas = listPersonas;
    }
    public boolean agregarPersona(Persona persona) {
        boolean centinela = false;
        if (!verificarPersona(persona.getIdentificacion())) {
            listPersonas.add(persona);
            centinela = true;
        }
        return centinela;
    }

    public boolean eliminarPersona(String identificacion) {
        boolean centinela = false;
        for (Persona persona : listPersonas) {
            if (persona.getIdentificacion().equals(identificacion)) {
                listPersonas.remove(persona);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean actualizarPersona(String identificacion, Persona actualizada) {
        boolean centinela = false;
        for (Persona persona : listPersonas) {
            if (persona.getIdentificacion().equals(identificacion)) {
                persona.setNombrePersona(actualizada.getNombrePersona());
                persona.setIdentificacion(actualizada.getIdentificacion());
                persona.setGenero(actualizada.getGenero());
                persona.setCorreo(actualizada.getCorreo());
                persona.setTelefono(actualizada.getTelefono());
                persona.setEdad(actualizada.getEdad());

                centinela = true;
                break;
            }
        }
        return centinela;
    }
    public boolean verificarPersona(String identificacion) {
        boolean centinela = false;
        for (Persona persona : listPersonas) {
            if (persona.getIdentificacion().equals(identificacion)) {
                centinela = true;
            }
        }
        return centinela;
    }

}
