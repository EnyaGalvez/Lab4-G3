package controller;

import javafx.fxml.FXML;

public class ControlerModos {

    
    private ControlRadioC controlRadioC;

    public void setControlRadioC(ControlRadioC controlRadioC) {
        this.controlRadioC = controlRadioC;
    }

    @FXML
    public void cambiarVistaRadioMod() {
        controlRadioC.cargarVista("VistaRadioMod.fxml");
    }

    @FXML
    public void cambiarVistaMedia() {
        controlRadioC.cargarVista("VistaMedia.fxml");
    }

    @FXML
    public void cambiarVistaTelefono() {
        controlRadioC.cargarVista("VistaTelefono.fxml");
    }

    @FXML
    public void cambiarVistaClima() {
        controlRadioC.cargarVista("VistaClima.fxml");
    }
}