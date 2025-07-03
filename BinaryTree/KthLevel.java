

public class KthLevel {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        } 
 
    }

    public static void  KthLevelNode(Node root, int level, int key){
        if(level==key){
            System.out.print(root.data+" ");
            return;
        }
        KthLevelNode(root.left,level+1, key);
        KthLevelNode(root.right,level+1, key);
    }

    public static void main(String[] args) {
        /*
                     1
                    / \
                   /   \
                  2     3
                 / \   / \
                /   \ /   \
               4    5 6    7

         */

        Node root = new Node(1);
        root.left= new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        KthLevelNode(root, 1, 3);
    }
}
