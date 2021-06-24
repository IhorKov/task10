public class Tree {
    Node node;

    Tree (int value){
        node = new Node(value);
    }

    public Node insert(Node node, int value) {
        if(node == null) {
            return new Node(value);
        }
        if(value < node.value) {
            node.left = insert(node.left, value);
        }
        if(value > node.value) {
            node.right = insert(node.right, value);
        }
        return node;
    }

    public void sort(Node node) {
        if (node != null) {
            sort(node.left);
            System.out.print(node.value + " ");
            sort(node.right);
        }
    }
}
