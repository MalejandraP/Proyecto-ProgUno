package co.edu.uniquindio.poo.bibliotecajfx;

import co.edu.uniquindio.poo.bibliotecajfx.model.Bibliotecario;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import co.edu.uniquindio.poo.bibliotecajfx.model.Persona;
import co.edu.uniquindio.poo.bibliotecajfx.model.Biblioteca;
import co.edu.uniquindio.poo.bibliotecajfx.viewController.PersonaViewController;
import co.edu.uniquindio.poo.bibliotecajfx.viewController.PrimaryController;

/**
 * JavaFX App
 */
public class App extends Application {

    public Biblioteca persona;
    private Stage primaryStage;
    public static Biblioteca biblioteca = new Biblioteca("UQ", "Cra 50");

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Gestion de Personal");
        openViewPrincipal();
    }

    private void openViewPrincipal() {
        inicializarData();
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("primary.fxml"));
            javafx.scene.layout.VBox rootLayout = (javafx.scene.layout.VBox) loader.load();
            PrimaryController primaryController = loader.getController();
            primaryController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }

    public void openCrudCliente() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("crudPersona.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            PersonaViewController personaViewController = loader.getController();
            personaViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //servicios

    public void inicializarData(){
        Persona bibliotecario1 = new Bibliotecario("12233", "juan", "masc", "@pablito", "3224727119", 14);
        biblioteca.agregarPersona(bibliotecario1);
    }

    public void openCrudPersona() {
    }
}
