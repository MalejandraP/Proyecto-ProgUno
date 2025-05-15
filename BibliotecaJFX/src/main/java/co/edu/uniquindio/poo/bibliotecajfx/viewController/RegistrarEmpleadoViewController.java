package co.edu.uniquindio.poo.bibliotecajfx.viewController;

import co.edu.uniquindio.poo.bibliotecajfx.App;
import co.edu.uniquindio.poo.bibliotecajfx.controller.RegistrarEmpleadoController;
import co.edu.uniquindio.poo.bibliotecajfx.model.Empleado;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ResourceBundle;

public class RegistrarEmpleadoViewController {

    RegistrarEmpleadoController registrarEmpleadoController;

    @FXML
    private App app;

    @FXML
    private ResourceBundle resources;
    @FXML
    private Button btnTerminarREgistroEmpleado,btnRegresarRegistroEmpleado;

    @FXML
    private TextField txtNombreEmpleado,txtIdentificacionEmpleado,txtGeneroEmpleado,txtCorreoEmpleado, txtTelefonoEmpleado,txtEdadEmpleado;

    @FXML
    private Label lblNombreEmpleado,lblIdentificacionEmpleado,lblGeneroEmpleado,lblCorreoEmpleado, lblTelefonoEmpleado,lblEdadEmpleado, lblCargoEmpleado;

    @FXML
    private ComboBox cbxCargoEmpleado;

    @FXML
    void onRegistrarEmpleado() {
        registrarEmpleado();
    }
    @FXML
    void onRegresarEmpleado(){
        regresarEmpleado();
    }
    @FXML
    void initialize() {
        this.app=app;
        RegistrarEmpleadoController = new RegistrarEmpleadoController(app.biblioteca);

    }
    private void agregarEmpleado() {
        Empleado empleado= buildCliente();
        if (RegistrarEmpleadoController.registrarEmpleado(cliente)) {
            listClientes.add(cliente);
            limpiarCamposCliente();
        }
    }

    private Cliente buildCliente() {
        Cliente cliente = new Cliente(txtCedula.getText(), txtNombre.getText(), txtApellido.getText());
        return cliente;
    }


}
