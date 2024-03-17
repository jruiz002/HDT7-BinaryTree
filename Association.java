/**
 * Representa una asociación entre una clave y un valor.
 * 
 * @param <K> El tipo de la clave.
 * @param <V> El tipo del valor.
 */
public class Association<K, V> {
    private K key;
    private V value;

    /**
     * Crea una nueva asociación con la clave y el valor especificados.
     * 
     * @param key La clave de la asociación.
     * @param value El valor asociado a la clave.
     */
    public Association(K key, V value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Obtiene la clave de la asociación.
     * 
     * @return La clave de la asociación.
     */
    public K getKey() {
        return key;
    }

    /**
     * Obtiene el valor asociado a la clave.
     * 
     * @return El valor asociado a la clave.
     */
    public V getValue() {
        return value;
    }
}