/**
 * Representa un nodo en un árbol binario.
 * 
 * @param <T> El tipo de dato que se almacena en el nodo.
 */
public class Node<T> {
    private T data;
    private Node<T> left;
    private Node<T> right;

    /**
     * Crea un nuevo nodo con el dato especificado.
     * 
     * @param data El dato almacenado en el nodo.
     */
    public Node(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    /**
     * Obtiene el dato almacenado en el nodo.
     * 
     * @return El dato almacenado en el nodo.
     */
    public T getData() {
        return data;
    }

    /**
     * Establece el dato almacenado en el nodo.
     * 
     * @param data El dato que se va a almacenar en el nodo.
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Obtiene el nodo hijo izquierdo.
     * 
     * @return El nodo hijo izquierdo.
     */
    public Node<T> getLeft() {
        return left;
    }

    /**
     * Establece el nodo hijo izquierdo.
     * 
     * @param left El nodo hijo izquierdo que se va a establecer.
     */
    public void setLeft(Node<T> left) {
        this.left = left;
    }

    /**
     * Obtiene el nodo hijo derecho.
     * 
     * @return El nodo hijo derecho.
     */
    public Node<T> getRight() {
        return right;
    }

    /**
     * Establece el nodo hijo derecho.
     * 
     * @param right El nodo hijo derecho que se va a establecer.
     */
    public void setRight(Node<T> right) {
        this.right = right;
    }
}
