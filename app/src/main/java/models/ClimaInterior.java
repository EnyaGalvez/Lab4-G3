package models;

/**
 * Controla el sistema de climatización del vehículo.
 */
public class ClimaInterior {
    private double temperatura;
    private int posicion;
    private boolean recirculacion;

    public ClimaInterior() {
        this.temperatura = 20.0; // temperatura inicial en celsius
        this.posicion = 0;
        this.recirculacion = false;
    }

    /**
     * Ajusta el nivel de ventilación
     * @param nivel nivel de ventilación (0-5)
     */
    public void ajustarNivelVentilacion(int nivel) {
        if (nivel >= 0 && nivel <= 5) {
            this.posicion = nivel;
        }
    }

    /**
     * Ajusta la temperatura deseada
     * @param temp temperatura deseada (1-10)
     */
    public void ajustarTemp(double temp) {
        if (temp >= 1.0 && temp <= 10.0) {
            this.temperatura = temp;
        }
    }

    /**
     * Activa o desactiva la recirculación del aire
     */
    public void modoDeCirculacion(boolean estado) {
        this.recirculacion = estado;
    }

    // Getters
    public double getTemperatura() {
        return temperatura;
    }

    public int getPosicion() {
        return posicion;
    }

    public boolean isRecirculacion() {
        return recirculacion;
    }
}