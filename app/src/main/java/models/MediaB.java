package models;

/**
 * Maneja la reproducción de música a través de conexión Bluetooth.
 */
public class MediaB extends Media {
    private boolean estadoConexion;

    public MediaB() {
        super();
        this.estadoConexion = false;
    }

    /**
     * Permite escoger entre aplicaciones de reproducción disponibles
     */
    public void escogeAplicacion() {
        // Implementación de selección de aplicación
    }

    @Override
    public void cancionSig() {
        // Implementación específica para Bluetooth
    }

    @Override
    public void cancionAnt() {
        // Implementación específica para Bluetooth
    }

    @Override
    public void reprod() {
        // Implementación específica para Bluetooth
    }
}