package controller;

import interfaces.RadioC;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TabPane;
import javafx.scene.layout.HBox;

public class ControlRadioC {
    
    @FXML
    private Button onOffButton; // Botón para encender/apagar el radio
    @FXML
    private Slider volumeSlider; // Control de volumen
    private RadioC radioC; // Llama los metodos relacionados a la interfaz RadioC

    @FXML
    private HBox hboxModos; // Contenedor para los botones de los modos
    @FXML
    private Button botonRadio; // Botón para modo Radio
    @FXML
    private Button botonMedia; // Botón para modo Reproducción
    @FXML
    private Button botonTelefono; // Botón para modo Teléfono
    @FXML
    private Button botonClima; // Botón para modo Productividad
    @FXML
    private Button botonClimaInterior;

    @FXML
    private TabPane tabPane; // Contenedor para las vistas de cada modo

    @FXML
    public void initialize() {
        inicializarComponentes();
        configurarEventos();
    }

    private void inicializarComponentes() {
        if (radioC != null) {
            volumeSlider.setValue(radioC.getVolumen());
        }

        // Configuración inicial de botones
        onOffButton.setText(radioC != null && radioC.getEstado() ? "Apagar" : "Encender");
    }

    // Configura los eventos de los botones
    private void configurarEventos() {
        // Evento para encender/apagar el radio
        onOffButton.setOnAction(event -> {
            if (radioC != null) {
                boolean nuevoEstado = !radioC.getEstado();
                radioC.encenderApagar(nuevoEstado);
                onOffButton.setText(nuevoEstado ? "Apagar" : "Encender");
                actualizarVista();
            }
        });

        // Evento para ajustar el volumen
        volumeSlider.valueProperty().addListener((obs, oldVal, newVal) -> {
            if (radioC != null) {
                radioC.cambiarVolumen(newVal.intValue());
                actualizarVista();
            }
        });

        // Eventos para los botones de modos
        botonRadio.setOnAction(event -> cambiarModo(1));
        botonMedia.setOnAction(event -> cambiarModo(2));
        botonTelefono.setOnAction(event -> cambiarModo(3));
        botonClima.setOnAction(event -> cambiarModo(4));
        botonClimaInterior.setOnAction(event -> cambiarModo(5));
    }

    // Cambia el modo del radio y actualiza la vista
    private void cambiarModo(int modo) {
        if (radioC != null) {
            radioC.modo(modo);
            tabPane.getSelectionModel().select(modo - 1); // Cambia al tab correspondiente
            actualizarVista();
        }
    }

    // Actualiza la vista en función del estado actual del radio
    private void actualizarVista() {
        if (radioC == null) {
            return;
        }

        boolean estado = radioC.getEstado();
        String modo = radioC.getModoActivado();
        int volumen = radioC.getVolumen();

        // Actualiza un mensaje de alerta o el estado visual
        if (!estado) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Radio Apagado");
            alert.setHeaderText(null);
            alert.setContentText("El radio está apagado. Enciéndalo para usar las funcionalidades.");
            alert.showAndWait();
        } else {
            System.out.println("Estado del Radio: Encendido");
            System.out.println("Modo Actual: " + modo);
            System.out.println("Volumen: " + volumen);
        }
    }

    // Método para inyectar la instancia de RadioC desde otra clase
    public void setRadioC(RadioC radioC) {
        this.radioC = radioC;
        actualizarVista();
    }
}