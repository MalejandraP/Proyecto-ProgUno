package co.edu.uniquindio.poo.bibliotecajfx.controller;

import co.edu.uniquindio.poo.bibliotecajfx.model.Biblioteca;
import co.edu.uniquindio.poo.bibliotecajfx.model.Bibliotecario;
import co.edu.uniquindio.poo.bibliotecajfx.model.Empleado;
import co.edu.uniquindio.poo.bibliotecajfx.model.Persona;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class ModificarEmpleadoController {
    private Biblioteca biblioteca;
    private Empleado empleado;
    private List<Empleado> empleados;

    @FXML
    private TextField txtNombreEM, txtCorreoEM, txtTelefonoEM, txtGeneroEM, txtEdadEM, txtIDEM;

    @FXML
    private ComboBox<String> cbxCargoModificaEmpleado;

    /**
     * PREGUNTICA
     * @param event
     */
    @FXML
    public void cargarEmpleado(ActionEvent event) {
        String idBuscado = txtIDEM.getText();
        for (Empleado e : empleados) {
            if (e.getIdentificacion().equals(idBuscado)) {
                txtNombreEM.setText(e.getNombrePersona());
                txtCorreoEM.setText(e.getCorreo());
                txtTelefonoEM.setText(e.getTelefono());
                txtGeneroEM.setText(e.getGenero());
                txtEdadEM.setText(String.valueOf(e.getEdad()));
                cbxCargoModificaEmpleado.setValue(e.getCargo());
                break;
            }
        }
    }

    /**
     * Quiero usar el metodo actualizarPersona de biblioteca pero ni idea de como llamrlo y utilizarlo
     * PREGUNTICA
     * @param
     */
    @FXML
    public boolean modificarEmpleado(Empleado empleado) {
        return biblioteca.actualizarPersona(empleado.getIdentificacion(), empleado);
    }

    @FXML

    public void regresarEmpleado(ActionEvent event) {
        try {
            // Cierra la ventana Registrar Empleado
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.close();

            // Carga la interfaz del administrador
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/bibliotecajfx/crudAdministrador.fxml"));
            Parent root = loader.load();
            Stage adminStage = new Stage();
            adminStage.setTitle("Administrador");
            adminStage.setScene(new Scene(root));
            adminStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
