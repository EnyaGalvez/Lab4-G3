package models;

/**
 * Maneja la reproducción de música en formato MP3.
 */
public class MP3 extends Media {
    private String tituloPlaylist;

    public MP3() {
        super();
        this.tituloPlaylist = "";
    }

    /**
     * Permite seleccionar una lista de reproducción MP3
     */
    public void listaRep() {
        // Implementación de la selección de lista de reproducción
    }

    @Override
    public void cancionSig() {
        // Implementación específica para MP3
    }

    @Override
    public void cancionAnt() {
        // Implementación específica para MP3
    }

    @Override
    public void reprod() {
        // Implementación específica para MP3
    }
}