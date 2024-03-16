public class Main {
    public static void main(String[] args) {
        BinaryTree<String, Integer> tree = new BinaryTree<>();
        tree.insert("key1", 1);
        tree.insert("key2", 2);
        Node<Association<String, Integer>> result = tree.search("key2");
        System.out.println(result);
        if (result != null){
            System.out.println("Found: " + result.getData().getKey() + ": " + result.getData().getValue());
        }else{
            System.out.println("Not found");
        }
    }
}
