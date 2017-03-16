/*
HOJA DE TRABAJO # 6
Desarrolladores de Java, Android y iOS

Autores:
Daniel Rodriguez # 15796
Yasmin Chavez # 16101

Clase Conjunto donde se almacena la informacion de los desarrolladores.
*/
public class Conjunto<K, V, I> {

	protected K key;
	protected V value;
	protected I desarrollador;

	public Conjunto(){

	}
	   /**
     * Constructs a pair from a key and value.
     *
     * @pre key is non-null
     * @post constructs a key-value pair
     * @param key A non-null object.
     * @param value A (possibly null) object.
     */
	 public Conjunto(K key, V value, I desarrollador)
	    {

	        this.key = key;
	        this.value = value;
	        this.desarrollador = desarrollador;
	    }

	  /**
	     * Standard comparison function.  Comparison based on keys only.
	     *
	     * @pre other is non-null Association
	     * @post returns true iff the keys are equal
	     * @param other Another association.
	     * @return true iff the keys are equal.
	     */
	 public boolean equals(Object other)
	    {
	        Conjunto<K, V, I> otherConjunto = (Conjunto<K, V, I>) other;
	        return getKey().equals(otherConjunto.getKey());
	    }

	 /**
     * Standard hashcode function.
     *
     * @post return hash code association with this association
     * @return A hash code for association.
     * @see Hashtable
     */
    public int hashCode()
    {
        return getKey().hashCode();
    }

    /**
     * Fetch value from association.  May return null.
     *
     * @post returns value from association
     * @return The value field of the association.
     */
    public V getValue() //Almacena el Nombre del Desarrollador
    {
        return value;
    }

    /**
     * Fetch key from association.  Should not return null.
     *
     * @post returns key from association
     * @return Key of the key-value pair.
     */
    public K getKey() //Almacena el DPI del Desarrollador
    {
        return key;
    }

    /**
     * Fetch key from association.  Should not return null.
     *
     * @post returns key from association
     * @return Key of the key-value pair.
     */
    public I getdesarrollador() //Devuelve el desarrollador.
    {
        return desarrollador;
    }
    /**
     * Sets the value of the key-value pair.
     *
     * @post sets association's value to value
     * @param value The new value.
     */
    public V setValue(V value)
    {
        V oldValue = value;
        value = value;
        return oldValue;
    }

    /**
     * Standard string representation of an association.
     *
     * @post returns string representation
     * @return String representing key-value pair.
     */
    public String toString() //Imprime la informacion del Desarrollador
    {
        StringBuffer s = new StringBuffer();
        s.append("\n"+" DPI: "+getKey()+" name: "+getValue());
        return s.toString();
    }

}

