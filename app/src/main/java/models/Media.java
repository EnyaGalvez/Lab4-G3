package models;

import java.util.HashMap;

/**
 * Permite la selección y control de un modo de reproducción de música específico.
 */
public class Media {
    protected int tipoReprod;
    protected HashMap<String, String> cancionActual;

    public Media() {
        this.tipoReprod = 0;
        this.cancionActual = new HashMap<>();
        cancionActual.put("nombre", "");
        cancionActual.put("artista", "");
        cancionActual.put("duracion", "");
        cancionActual.put("genero", "");
    }

    /**
     * Cambia a la siguiente canción
     */
    public void cancionSig() {
        // Implementación específica en subclases
    }

    /**
     * Cambia a la canción anterior
     */
    public void cancionAnt() {
        // Implementación específica en subclases
    }

    /**
     * Controla la reproducción (play/pause)
     */
    public void reprod() {
        // Implementación específica en subclases
    }

    // Getters y setters
    public HashMap<String, String> getCancionActual() {
        return cancionActual;
    }

    public int getTipoReprod() {
        return tipoReprod;
    }
}