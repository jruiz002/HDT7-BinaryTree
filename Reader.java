import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    /**
    * Llena el árbol binario con datos del archivo especificado.
    * 
    * @param nombreArchivo El nombre del archivo que contiene las traducciones.
    * @param arbol El árbol binario donde se insertarán los datos.
    */
    public static void llenarArbol(String nombreArchivo, BinaryTree arbol) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                String ingles = partes[0].trim().substring(1); // Eliminar el paréntesis inicial
                String espanol = partes[1].substring(0, partes[1].length() - 1); // No necesitamos eliminar el paréntesis final
                String espanolCorregido = espanol.trim();
                arbol.insert(ingles, espanolCorregido);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Traduce las palabras de un archivo utilizando el árbol binario proporcionado.
     * Si una palabra no se encuentra en el árbol, se incluye entre asteriscos en mayúsculas.
     * 
     * @param nombreArchivo El nombre del archivo que contiene la frase a traducir.
     * @param tree El árbol binario que contiene las traducciones de las palabras.
     */
    public static void traducir(String nombreArchivo, BinaryTree tree){
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            StringBuilder frase = new StringBuilder();
            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.toLowerCase().split(" ");
                for (String palabra : palabras) {
                    Node<Association<String, String>> result = tree.search(palabra);
                    if (result != null) {
                        frase.append(result.getData().getValue() + " ");
                    }else{
                        frase.append("*" + palabra.toUpperCase() + "* ");
                    }
                }
            }
            System.out.println("-----FRASE TRADUCIDA-----");
            System.out.println(frase);
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
