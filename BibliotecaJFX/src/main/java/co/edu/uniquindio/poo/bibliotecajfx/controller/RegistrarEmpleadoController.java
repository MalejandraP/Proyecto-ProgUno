package co.edu.uniquindio.poo.bibliotecajfx.controller;

import co.edu.uniquindio.poo.bibliotecajfx.model.Bibliotecario;
import co.edu.uniquindio.poo.bibliotecajfx.model.Empleado;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.io.IOException;


public class RegistrarEmpleadoController {

    @FXML
    private TextField txtNombreEmpleado, txtIdentificacionEmpleado, txtGeneroEmpleado, txtCorreoEmpleado, txtTelefonoEmpleado, txtEdadEmpleado;

    @FXML
    private ComboBox<String> cbxCargoEmpleado;

    @FXML
    public void registrarEmpleado(ActionEvent event) {
        String nombre = txtNombreEmpleado.getText().trim();
        String identificacion = txtIdentificacionEmpleado.getText().trim();
        String genero = txtGeneroEmpleado.getText().trim();
        String correo = txtCorreoEmpleado.getText().trim();
        String telefono = txtTelefonoEmpleado.getText().trim();
        int edad = Integer.parseInt(txtEdadEmpleado.getText().trim());
        String cargo = cbxCargoEmpleado.getValue();

        /**
         * Metodo para saber cual es el cargo del empleado y registrarlo
         * FALTA EXPLICACION
         */
        Empleado nuevoEmpleado = null;
        if (cargo.equals("Bibliotecario")) {
            nuevoEmpleado = new Bibliotecario(nombre, identificacion, genero, correo, telefono, edad);
        }
        if (nuevoEmpleado != null){
            System.out.println("El empleado ha sido registrado con éxito:" +nuevoEmpleado);
        }
        else {
            System.out.println("El empleado no se ha podido registrar, cargo no disponible.");
        }
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
