import java.util.ArrayList;

public class Main {
    public static ArrayList<MySinglyLinkedList<MyBinaryTreeNode<Integer>>> generateListOfDepths(MyBinaryTreeNode<Integer> tree){
        ArrayList<MySinglyLinkedList<MyBinaryTreeNode<Integer>>> depths = new ArrayList<>();
        depths.add(new MySinglyLinkedList<>());
        depths.get(0).addEnd(tree);
        for (int i = 0; i < depths.size(); i++) {
            MySinglyLinkedList<MyBinaryTreeNode<Integer>> list = depths.get(i);
            if(list.head != list.tail) {
                depths.add(new MySinglyLinkedList<>());
                MySinglyLinkedListNode<MyBinaryTreeNode<Integer>> n = list.head;
                n = n.next;
                while (n != null) {
                    if (n.data.left != null) {
                        depths.get(depths.size() - 1).addEnd(n.data.left);
                    }
                    if (n.data.right != null) {
                        depths.get(depths.size() - 1).addEnd(n.data.right);
                    }
                    n = n.next;
                }
            }
        }
        depths.remove(depths.size() - 1);

        return depths;
    }
    public static void main(String[] args) {
        MyBinaryTreeNode<Integer> tree = MyBinaryTreeNode.generateBinarySearchTree();
        ArrayList<MySinglyLinkedList<MyBinaryTreeNode<Integer>>> result = generateListOfDepths(tree);
        for (MySinglyLinkedList<MyBinaryTreeNode<Integer>> list : result) {
            MySinglyLinkedListNode<MyBinaryTreeNode<Integer>> n = list.head;
            n = n.next;
            System.out.print("[");
            while (n != null) {
                System.out.print(n.data.data);
                if(n.next != null)
                    System.out.print(", ");
                n = n.next;
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
