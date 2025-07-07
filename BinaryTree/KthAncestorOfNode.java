public class KthAncestorOfNode {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static int kthAncestor(Node root, int n, int k){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDis = kthAncestor(root.left, n, k);
        int rightDis = kthAncestor(root.right, n, k);
        if(leftDis == -1 && rightDis ==-1){
            return -1;
        }
        int max= Math.max(leftDis, rightDis);
        if(max+1==k){
            System.out.println(root.data);
        }
        return max+1;
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

        int n1=4, n2=2;
        kthAncestor(root, n1, n2);
    }
}
