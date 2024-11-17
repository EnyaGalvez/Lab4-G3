package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import interfaces.RadioC;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.SubScene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Pane;

public class ControlRadioC {
    
    @FXML
    private Button onOffButton; // Botón para encender/apagar el radio
    

    @FXML
    private Slider volumeSlider; // Control de volumen
    private RadioC radioC; // Llama los metodos relacionados a la interfaz RadioC
    private final Map<String, String> rutasVistas = new HashMap<>();

    @FXML
    private SubScene vistaSubScene;

    @FXML
    private TabPane tabPane; // Contenedor para las vistas de cada modo

    @FXML
    public void inicializarComponentes() {
        if (radioC != null && radioC.getEstado()) {
            cargarVista("VistaModos.fxml"); // Carga la vista de modos si el radio está encendido
        } else {
            cargarVista("VistaApagado.fxml"); // Carga una vista de apagado
        }
        configurarEventos();
        actualizarEstadoInicial();
    }

    public void configurarEventos() {
        // Evento para encender/apagar el radio
        onOffButton.setOnAction(event -> {
        if (radioC != null) {
            boolean nuevoEstado = !radioC.getEstado();
            radioC.encenderApagar(nuevoEstado);

            onOffButton.setText(nuevoEstado ? "Apagar" : "Encender");

            // Cambiar la vista dependiendo del estado
            if (nuevoEstado) {
                cargarVista("VistaModos.fxml");
            } else {
                cargarVista("VistaApagado.fxml");
            }
        }
    });
    
    // Evento para ajustar el volumen
    volumeSlider.valueProperty().addListener((obs, oldVal, newVal) -> {
        if (radioC != null && radioC.getEstado()) {
            radioC.cambiarVolumen(newVal.intValue());
        }
    });
    }

    // Actualizar estado inicial de los controles
    public void actualizarEstadoInicial() {
        boolean estado = radioC.getEstado();
        onOffButton.setText(estado ? "Apagar" : "Encender");
        volumeSlider.setDisable(!estado); // Deshabilitar el volumen si el radio está apagado
    }

    // Actualiza la vista en función del estado del radio
    public void actualizarVista() {
        boolean estado = radioC.getEstado();
        onOffButton.setText(estado ? "Apagar" : "Encender");
        volumeSlider.setDisable(!estado); // Habilitar/deshabilitar slider
        if (!estado) {
            cargarVista("VistaModos.fxml"); // Mostrar la vista inicial cuando está apagado
        }
    }

    // Cargar vistas dinámicamente en la SubScene
    public void cargarVista(String nombreFXML) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/path/to/" + nombreFXML));
            Pane vista = loader.load();
    
            // Actualizar el contenido de la SubScene
            vistaSubScene.setRoot(vista);
    
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}