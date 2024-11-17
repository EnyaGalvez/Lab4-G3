package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ControlRadioMod {
    
    @FXML
    private Button bandToggle;

    @FXML
    private TextField frequencyDisplay;

    @FXML
    private Button saveStationButton;

    @FXML
    private ComboBox<String> loadStationDropdown;

    @FXML
    private ListView<String> stationListDisplay;

    @FXML
    public void initialize() {
        // Configura controles iniciales, por ejemplo:
        // Carga las emisoras guardadas en stationListDisplay
    }

    @FXML
    private void changeBand() {
        // Llama a RadioMod.frecuencia() para alternar entre AM/FM
    }

    @FXML
    private void nextStation() {
        // Llama a RadioMod.cambioEmisora() para cambiar la emisora
    }

    @FXML
    private void saveStation() {
        // Llama a RadioMod.guardarEmisora() y actualiza stationListDisplay
    }

    @FXML
    private void loadStation() {
        // Llama a RadioMod.cargarEmisora() para cargar una emisora
    }
}
