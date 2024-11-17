package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import models.Clima;

public class ControlClima extends ControlerModos {
    @FXML
    private Label weatherDisplay;

    private Clima clima;

    @FXML
    private void initialize() {
        clima = new Clima();
        updateWeather();
    }

    public void updateWeather() {
        if (clima != null) {
            clima.tiempo();
            actualizarVista();
        } else {
            System.err.println("Error: 'clima' no está inicializado.");
        }
    }

    private void actualizarVista() {
        if (clima != null && weatherDisplay != null) {
            weatherDisplay.setText(String.format(
                "Temperatura: %.1f°C\nProbabilidad de lluvia: %.1f%%\n%s",
                clima.getTemperaturaActual(),
                clima.getLluviaProb(),
                clima.getDescripcionClima()
            ));
        }
    }

    // Metodo para establecer 'clima' desde otra clase
    public void setClima(Clima clima) {
        this.clima = clima;
    }
}
