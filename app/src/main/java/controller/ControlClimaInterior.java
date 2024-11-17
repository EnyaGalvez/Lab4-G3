package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.Button;
import models.ClimaInterior;

public class ControlClimaInterior extends ControlerModos {
    @FXML
    private Label temperatureDisplay;

    @FXML
    private Slider fanSpeedSlider;

    @FXML
    private Button toggleAcButton;

    @FXML
    private Slider temperatureSlider;

    private ClimaInterior climaInterior;

    @FXML
    private void initialize() {
        climaInterior = new ClimaInterior();
        configurarControles();
        actualizarVista();
    }

    private void configurarControles() {
        if (fanSpeedSlider != null) {
            fanSpeedSlider.setMin(0);
            fanSpeedSlider.setMax(5);
            fanSpeedSlider.setValue(0);
            fanSpeedSlider.valueProperty().addListener((obs, oldVal, newVal) ->
                adjustFanSpeed(newVal.intValue()));
        }

        if (temperatureSlider != null) {
            temperatureSlider.setMin(16); // Temperatura mínima realista en grados Celsius
            temperatureSlider.setMax(30); // Temperatura máxima realista
            temperatureSlider.setValue(22);
            temperatureSlider.valueProperty().addListener((obs, oldVal, newVal) ->
                adjustTemperature(newVal.doubleValue()));
        }

        if (toggleAcButton != null) {
            toggleAcButton.setOnAction(e -> toggleAc());
        }
    }

    public void adjustTemperature(double temperature) {
        if (climaInterior != null) {
            climaInterior.ajustarTemp(temperature);
            actualizarVista();
        }
    }

    public void adjustFanSpeed(int speed) {
        if (climaInterior != null) {
            climaInterior.ajustarNivelVentilacion(speed);
            actualizarVista();
        }
    }

    public void toggleAc() {
        if (climaInterior != null) {
            climaInterior.modoDeCirculacion(!climaInterior.isRecirculacion());
            actualizarVista();
        }
    }

    private void actualizarVista() {
        if (climaInterior != null && temperatureDisplay != null) {
            temperatureDisplay.setText(String.format("%.1f°C", climaInterior.getTemperatura()));
        }
    }

    // Método para establecer 'climaInterior' desde otra clase 
    public void setClimaInterior(ClimaInterior climaInterior) {
        this.climaInterior = climaInterior;
    }

    @Override
    public void mostrarContenido() {
    }

    @Override
    public void ocultarContenido() {
    }
}
