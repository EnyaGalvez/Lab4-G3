package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class ControlTelefono {
    @FXML
    private Button connectToggleButton;

    @FXML
    private ListView<String> contactsList;

    @FXML
    private Button callButton;

    @FXML
    private Button endCallButton;

    @FXML
    private Button holdCallButton;

    @FXML
    public void initialize() {
        // Configura los controles iniciales y carga la lista de contactos
    }

    @FXML
    private void toggleConnection() {
        // Llama a Telefono.conexion() para conectar o desconectar
    }

    @FXML
    private void callContact() {
        // Llama a Telefono.llamarContacto()
    }

    @FXML
    private void endCall() {
        // Llama a Telefono.finLlamada()
    }

    @FXML
    private void holdCall() {
        // Llama a Telefono.llamaEspera()
    }
}
