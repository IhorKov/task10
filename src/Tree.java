public class Tree {
    Node root;

    Tree (int value){
        root = new Node(value);
    }

    public Node add(Node node, int value) {
        if(node == null) {
            return new Node(value);
        }
        if(value < node.value) {
            node.left = add(node.left, value);
        }
        if(value > node.value) {
            node.right = add(node.right, value);
        }
        return node;
    }

    public void printNode(Node node) {
        if (node != null) {
            printNode(node.left);
            System.out.print(node.value + " ");
            printNode(node.right);
        }
    }
}
