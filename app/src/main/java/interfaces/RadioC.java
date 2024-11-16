package interfaces;

/**
 * Interface principal que define las funcionalidades básicas del radio
 * para la clase C de vehículo Mercedes-Benz.
 */
public interface RadioC {
    /**
     * Enciende o apaga el radio
     * @param estado true para encender, false para apagar
     */
    void encenderApagar(Boolean estado);
    
    /**
     * Cambia el volumen del radio
     * @param nivel nuevo nivel de volumen
     */
    void cambiarVolumen(int nivel);
    
    /**
     * Cambia el modo del radio
     * @param modo número que indica el modo a activar
     */
    void modo(int modo);
    
    /**
     * @return estado actual del radio
     */
    boolean getEstado();
    
    /**
     * @return volumen actual del radio
     */
    int getVolumen();
    
    /**
     * @return modo actualmente activado
     */
    String getModoActivado();
}