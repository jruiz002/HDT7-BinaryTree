/**
 * @author José Ruiz
 * @version 1.0
 * Fecha creación: 15/03/2024
 * 
 */
public class Main {
    public static void main(String[] args) {
        // Se crea el arbol binario.
        BinaryTree<String, Integer> tree = new BinaryTree<>();
        // Se inserta cada asociación en un nodo del arbol.
        Reader.llenarArbol("diccionario.txt", tree);
        // Se procede a realizar la traducción
        Reader.traducir("texto.txt", tree);
    }
}
