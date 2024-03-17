public class BinaryTree<K extends Comparable<K>, V> {
    private Node<Association<K, V>> root;

    /**
     * Inserta una asociación (clave, valor) en el árbol binario.
     * 
     * @param key La clave que se va a insertar en el árbol.
     * @param value El valor asociado a la clave que se va a insertar en el árbol.
     */
    public void insert(K key, V value) {
        Association<K, V> association = new Association<>(key, value);
        root = insert(root, association);
    }

    /**
     * Inserta una asociación (clave, valor) en el árbol binario, comenzando desde el nodo especificado.
     * 
     * @param node El nodo en el que se va a iniciar la inserción.
     * @param association La asociación (clave, valor) que se va a insertar en el árbol.
     * @return El nodo resultante después de la inserción.
     */
    private Node<Association<K, V>> insert(Node<Association<K, V>> node, Association<K, V> association) {
        if (node == null) {
            return new Node<>(association);
        }

        int cmp = association.getKey().compareTo(node.getData().getKey());
        if (cmp < 0) {
            node.setLeft(insert(node.getLeft(), association));
        } else if (cmp > 0) {
            node.setRight(insert(node.getRight(), association));
        }

        return node;
    }

    /**
     * Busca una clave en el árbol binario y devuelve el nodo que contiene la asociación correspondiente.
     * 
     * @param key La clave que se está buscando en el árbol.
     * @return El nodo que contiene la asociación correspondiente a la clave buscada, o null si la clave no se encuentra en el árbol.
     */
    public Node<Association<K, V>> search(K key) {
        return search(root, key);
    }
    
    /**
     * Busca una clave en el árbol binario, comenzando desde el nodo especificado, y devuelve el nodo que contiene la asociación correspondiente.
     * 
     * @param node El nodo en el que se va a iniciar la búsqueda.
     * @param key La clave que se está buscando en el árbol.
     * @return El nodo que contiene la asociación correspondiente a la clave buscada, o null si la clave no se encuentra en el árbol.
     */
    private Node<Association<K, V>> search(Node<Association<K, V>> node, K key) {
        if (node != null) {
            Node<Association<K, V>> found = search(node.getLeft(), key);
            if (found != null) {
                return found;
            }
            
            if (node.getData().getKey().equals(key)) {
                return node;
            }
    
            return search(node.getRight(), key);
        }
    
        return null;
    }
    
}
