package co.edu.uniquindio.poo.bibliotecajfx.viewController;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


import co.edu.uniquindio.poo.bibliotecajfx.App;
import co.edu.uniquindio.poo.bibliotecajfx.controller.PersonaController;
import co.edu.uniquindio.poo.bibliotecajfx.model.Persona;



public class PersonaViewController{

    PersonaController personaController;
    ObservableList<Persona> listPersonas = FXCollections.observableArrayList();
    Persona selectedPersona;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNombre;

    @FXML
    private Button btnLimpiar;

    @FXML
    private TableView<Persona> tblListPersonas;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnActualizarPersona;

    @FXML
    private TableColumn<Persona, String> tbcNombre;

    @FXML
    private TextField txtGenero;

    @FXML
    private TableColumn<Persona, String> tbcGenero;

    @FXML
    private Button btbAgregarPersona;

    @FXML
    private TableColumn<Persona, String> tbcIdentificacion;

    @FXML
    private TextField txtIdentificacion;
    private App app;

    @FXML
    void onAgregarPersona() {
        agregarPersona();
    }

    @FXML
    void onActualizarPersona() {
        actualizarPersona();
    }

    @FXML
    void onLimpiar() {
        limpiarSeleccion();
    }

    @FXML
    void onEliminar() {
        eliminarPersona();
    }

    @FXML
    void initialize() {
        this.app=app;
        personaController = new PersonaController(app.persona);
        initView();
    }

    private void initView() {
        // Traer los datos de la persona a la tabla
        initDataBinding();

        // Obtiene la lista
        obtenerPersona();

        // Limpiar la tabla
        tblListPersonas.getItems().clear();

        // Agregar los elementos a la tabla
        tblListPersonas.setItems(listPersonas);

        // Seleccionar elemento de la tabla
        listenerSelection();
    }

    private void initDataBinding() {
        tbcIdentificacion.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getIdentificacion()));
        tbcNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombrePersona()));
        tbcGenero.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getGenero()));
        // Usamos SimpleObjectProperty para manejar Double y Integer correctamente
    }

    private void obtenerPersona() {
        listPersonas.addAll(personaController.obtenerListaPersonas());
    }

    private void listenerSelection() {
        tblListPersonas.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedPersona = newSelection;
            mostrarInformacionPersona(selectedPersona);
        });
    }

    private void mostrarInformacionPersona(Persona persona) {
        if (persona != null) {
            txtIdentificacion.setText(persona.getIdentificacion());
            txtNombre.setText(persona.getNombrePersona());
            txtGenero.setText(persona.getGenero());
        }
    }

    private boolean agregarPersona() {
        Persona persona = buildPersona();
        if (personaController.crearPersona(persona)) {
            listPersonas.add(persona);
            limpiarCamposPersonas();
        }
    }

    private Persona buildPersona() {
        Persona persona = new Persona(txtIdentificacion.getText(), txtNombre.getText(), txtGenero.getText());
        return persona;
    }

    private void eliminarPersona() {
        if (personaController.eliminarPersona(txtIdentificacion.getText())) {
            listPersonas.remove(selectedPersona);
            limpiarCamposPersonas();
            limpiarSeleccion();
        }
    }

    private void actualizarPersona() {

        if (selectedPersona != null &&
                personaController.actualizarPersona(selectedPersona.getIdentificacion(), buildPersona())) {

            int index = listPersonas.indexOf(selectedPersona);
            if (index >= 0) {
                listPersonas.set(index, buildPersona());
            }

            tblListPersonas.refresh();
            limpiarSeleccion();
            limpiarCamposPersonas();
        }
    }

    private void limpiarSeleccion() {
        tblListPersonas.getSelectionModel().clearSelection();
        limpiarCamposPersonas();
    }

    private void limpiarCamposPersonas() {
        txtIdentificacion.clear();
        txtNombre.clear();
        txtGenero.clear();
    }

    public void setApp(App app) {
        this.app = app;
    }
} 
