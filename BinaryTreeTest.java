import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class BinaryTreeTest {
    @Test
    public void insertTest(){
        // Crear un árbol binario para probar la inserción
        BinaryTree<Integer, String> tree = new BinaryTree<>();
        
        // Insertar algunas asociaciones (clave, valor)
        tree.insert(1, "Manzana");
        tree.insert(2, "Banana");

        // Verificar que una clave inexistente no se encuentre en el árbol
        assertNull(tree.search(3));
    }

    @Test
    public void searchTest(){
        // Crear un árbol binario para probar la búsqueda
        BinaryTree<String, String> tree = new BinaryTree<>();
        // Se inserta un nodo de tipo Association
        tree.insert("Hello", "Hola");
        // Pruebas
        assertEquals("Hola", tree.search("Hello").getData().getValue()); // Buscar una clave existente
    }
}
