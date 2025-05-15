package co.edu.uniquindio.poo.bibliotecajfx.controller;

import co.edu.uniquindio.poo.bibliotecajfx.model.Empleado;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.util.List;

public class EliminarEmpleadoController {
    @FXML
    private TextField txtIDEmpleadoEliminar;

    @FXML
    private Label lblNombreEmpleadoEliminar;

    private List<Empleado> empleados;

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    /**
     * Metodo del boton eliminar
     * @param event
     */
    @FXML
    private void onEliminarEmpleado(ActionEvent event) {
        String idBuscado = txtIDEmpleadoEliminar.getText();
        empleados.removeIf(e -> idBuscado.equals(e.getIdentificacion()));
    }

    /**
     * Metodo del botón cargar (busca el id ingresado en la lista de empleados, de ahí muestra su nombre)
     * PREGUNTICA
     * @param event
     */
    @FXML
    public void cargarEmpleado(ActionEvent event) {
        String idBuscado = txtIDEmpleadoEliminar.getText();
        for (Empleado e : empleados) {
            if (e.getIdentificacion().equals(idBuscado)) {
                lblNombreEmpleadoEliminar.setText(e.getNombrePersona());
                break;
            }
        }
        lblNombreEmpleadoEliminar.setText("Empleado no encontrado");
    }

    /**
     * Metodo del boton regresar, regresa a Administrador
     * @param event
     */
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
