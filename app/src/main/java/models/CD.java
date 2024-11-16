package models;

/**
 * Maneja la reproducción de música por disco compacto.
 */
public class CD extends Media {
    private int duracionCD;

    public CD() {
        super();
        this.duracionCD = 0;
    }

    /**
     * Permite seleccionar una lista de reproducción del CD
     */
    public void listaRep() {
        // Implementación de la selección de lista de reproducción
    }

    @Override
    public void cancionSig() {
        // Implementación específica para CD
    }

    @Override
    public void cancionAnt() {
        // Implementación específica para CD
    }

    @Override
    public void reprod() {
        // Implementación específica para CD
    }
}