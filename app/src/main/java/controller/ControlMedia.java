package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class ControlMedia {
    @FXML
    private Button playPauseButton;

    @FXML
    private Button nextButton;

    @FXML
    private Button previousButton;

    @FXML
    private Label songInfoLabel;

    @FXML
    private ComboBox<String> mediaTypeSelector;

    @FXML
    private ComboBox<String> playlistDropdown;

    @FXML
    private ComboBox<String> appSelector;

    @FXML
    public void initialize() {
        // Configura controles iniciales
    }

    @FXML
    private void playPauseMedia() {
        // Llama a Media.reprod() para reproducir o pausar
    }

    @FXML
    private void nextSong() {
        // Llama a Media.cancionSig() para la siguiente canción
    }

    @FXML
    private void previousSong() {
        // Llama a Media.cancionAnt() para la canción anterior
    }

    @FXML
    private void selectMediaType() {
        // Cambia el tipo de reproducción según mediaTypeSelector
    }
}
