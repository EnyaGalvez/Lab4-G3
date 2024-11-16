package models;

/**
 * Muestra la información del pronóstico del clima.
 */
public class Clima {
    private float temperaturaActual;
    private float lluviaProb;
    private String descripcionClima;

    public Clima() {
        this.temperaturaActual = 0.0f;
        this.lluviaProb = 0.0f;
        this.descripcionClima = "";
    }

    /**
     * Muestra el pronóstico del tiempo
     */
    public void tiempo() {
        // Implementación del pronóstico del tiempo
    }

    // Getters y setters
    public float getTemperaturaActual() {
        return temperaturaActual;
    }

    public float getLluviaProb() {
        return lluviaProb;
    }

    public String getDescripcionClima() {
        return descripcionClima;
    }
}