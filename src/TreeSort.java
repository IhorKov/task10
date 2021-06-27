import java.util.Arrays;

public class TreeSort {
    public static void main(String[] args) {
        int[] arr = {50, 30, 70, 15, 7, 62, 22, 35, 87, 22, 31};
        System.out.println("Изначальный массив - "+ Arrays.toString(arr));
        Tree tree = new Tree(arr[0]);
        for(int num : arr){
            tree.add(tree.root, num);
        }
        System.out.print("Отсортированый массив - ");
        tree.printNode(tree.root);
    }
}
