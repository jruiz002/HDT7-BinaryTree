public class BinaryTree<K extends Comparable<K>, V> {
    private Node<Association<K, V>> root;

    public void insert(K key, V value) {
        Association<K, V> association = new Association<>(key, value);
        root = insert(root, association);
    }

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

    public Node<Association<K, V>> search(K key) {
        return search(root, key);
    }
    
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
