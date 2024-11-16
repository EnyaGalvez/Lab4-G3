package models;

import java.util.ArrayList;

/**
 * Maneja las características y funcionalidades específicas del
 * modo de transmisión de emisoras de radio.
 */
public class RadioMod {
    private boolean banda; // true para FM, false para AM
    private float emisoraActual;
    private ArrayList<Float> listaEmisoras;

    public RadioMod() {
        this.banda = true; // Inicia en FM
        this.emisoraActual = 87.5f; // Frecuencia inicial FM
        this.listaEmisoras = new ArrayList<>();
    }

    /**
     * Cambia entre frecuencias AM y FM
     */
    public void frecuencia() {
        banda = !banda;
        if (banda) {
            emisoraActual = 87.5f; // FM inicial
        } else {
            emisoraActual = 530f; // AM inicial
        }
    }

    /**
     * Cambia la emisora actual
     */
    public void cambioEmisora() {
        if (banda) {
            emisoraActual += 0.5f;
            if (emisoraActual > 108.0f) emisoraActual = 87.5f;
        } else {
            emisoraActual += 10;
            if (emisoraActual > 1610f) emisoraActual = 530f;
        }
    }

    /**
     * Guarda la emisora actual en la lista
     */
    public void guardarEmisora() {
        if (listaEmisoras.size() < 50) {
            listaEmisoras.add(emisoraActual);
        }
    }

    /**
     * Carga una emisora guardada
     * @param index índice de la emisora a cargar
     */
    public void cargarEmisora(int index) {
        if (index >= 0 && index < listaEmisoras.size()) {
            emisoraActual = listaEmisoras.get(index);
        }
    }

    // Getters y setters
    public boolean isBanda() {
        return banda;
    }

    public float getEmisoraActual() {
        return emisoraActual;
    }

    public ArrayList<Float> getListaEmisoras() {
        return listaEmisoras;
    }
}