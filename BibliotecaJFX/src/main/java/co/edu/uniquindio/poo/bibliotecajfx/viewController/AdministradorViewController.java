package co.edu.uniquindio.poo.bibliotecajfx.viewController;

import co.edu.uniquindio.poo.bibliotecajfx.controller.AdministradorController;
import co.edu.uniquindio.poo.bibliotecajfx.model.Empleado;
import co.edu.uniquindio.poo.bibliotecajfx.model.Persona;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AdministradorViewController {
    private AdministradorController administradorController;

    @FXML
    private Button btnRegistrarEmpleado, btnModificarEmpleado, btnEliminarEmpleado, btnPrestamosEnElMes, btnEmpleadosEliminados;

    @FXML
    private Label lblQueDeseasHacer, lblAdministrador;



    /**
     * Necesito que me lleve a la ventana registrar empleado
     * SIN HACER
     */
    @FXML
    void onRegistrarEmpleado() {
        try {
            // Cargar la nueva ventana
            FXMLLoader loader = new FXMLLoader(getClass().getResource("crudRegistrarEmpleado.fxml"));
            Parent root = loader.load();

            // Crear una nueva escena y mostrarla
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Registrar Empleado");
            stage.show();

            // Cerrar la ventana actual si es necesario
            Stage currentStage = (Stage) btnRegistrarEmpleado.getScene().getWindow();
            currentStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @FXML
    void onModificarEmpleado() {
        try {
            // Cargar la nueva ventana
            FXMLLoader loader = new FXMLLoader(getClass().getResource("crudModificarEmpleado.fxml"));
            Parent root = loader.load();

            // Crear una nueva escena y mostrarla
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Modificar Empleado");
            stage.show();

            // Cerrar la ventana actual si es necesario
            Stage currentStage = (Stage) btnModificarEmpleado.getScene().getWindow();
            currentStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void onEliminarEmpleado() {
        try {
            // Cargar la nueva ventana
            FXMLLoader loader = new FXMLLoader(getClass().getResource("crudEliminarEmpleado.fxml"));
            Parent root = loader.load();

            // Crear una nueva escena y mostrarla
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Eliminar Empleado");
            stage.show();

            // Cerrar la ventana actual si es necesario
            Stage currentStage = (Stage) btnEliminarEmpleado.getScene().getWindow();
            currentStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
