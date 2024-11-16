import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import controllers.ControlRadioC;

/**
 * Clase principal que inicia la aplicación JavaFX del Radio Mercedes
 */
public class App extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try {
            // Cargar el FXML principal
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/main.fxml"));
            Parent root = loader.load();
            
            // Configurar la escena
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("/styles/styles.css").toExternalForm());
            
            // Configurar la ventana principal
            primaryStage.setTitle("Radio Mercedes Clase C");
            primaryStage.setScene(scene);
            primaryStage.setResizable(false); // El radio no debería ser redimensionable
            
            // Obtener el controlador principal
            ControlRadioC controller = loader.getController();
            controller.inicializarComponentes(); // Inicializar componentes del radio
            
            // Mostrar la ventana
            primaryStage.show();
            
        } catch (Exception e) {
            System.err.println("Error al iniciar la aplicación: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Método principal para iniciar la aplicación
     * @param args argumentos de línea de comando (no utilizados)
     */
    public static void main(String[] args) {
        try {
            launch(args);
        } catch (Exception e) {
            System.err.println("Error fatal en la aplicación: " + e.getMessage());
            e.printStackTrace();
        }
    }
}