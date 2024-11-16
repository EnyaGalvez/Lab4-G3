package models;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Maneja las opciones del teléfono conectado.
 */
public class Telefono {
    private boolean estadoConexion;
    private ArrayList<HashMap<String, String>> contactos;
    private int contactoActual;
    private String estadoLlamada;

    public Telefono() {
        this.estadoConexion = false;
        this.contactos = new ArrayList<>();
        this.contactoActual = -1;
        this.estadoLlamada = "INACTIVA";
    }

    /**
     * Conecta o desconecta el teléfono
     */
    public void conexion(Boolean estado) {
        this.estadoConexion = estado;
    }

    /**
     * Muestra la lista de contactos disponibles
     */
    public ArrayList<HashMap<String, String>> mostrarContactos() {
        return contactos;
    }

    /**
     * Inicia una llamada con un contacto específico
     */
    public void llamarContacto(int indice) {
        if (indice >= 0 && indice < contactos.size()) {
            contactoActual = indice;
            estadoLlamada = "ACTIVA";
        }
    }

    /**
     * Termina la llamada actual
     */
    public void finLlamada() {
        contactoActual = -1;
        estadoLlamada = "INACTIVA";
    }

    /**
     * Pone la llamada actual en espera
     */
    public void llamaEspera() {
        if (estadoLlamada.equals("ACTIVA")) {
            estadoLlamada = "EN_ESPERA";
        }
    }

    // Getters
    public boolean isEstadoConexion() {
        return estadoConexion;
    }

    public String getEstadoLlamada() {
        return estadoLlamada;
    }

    public int getContactoActual() {
        return contactoActual;
    }
}
