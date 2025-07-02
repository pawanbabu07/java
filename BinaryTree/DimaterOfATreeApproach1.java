public class DimaterOfATreeApproach1 {
     static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        } 
 
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(rh, lh)+1;
    }
    public static int dimater(Node root){
        if(root==null){
            return 0;
        }

        int leftDimeter=dimater(root.left);
        int leftHeight= height(root.left);
        int rightDimeter= dimater(root.right);
        int rightHeight = height(root.right);
        int selfDimeter= leftHeight + rightHeight + 1;

        return Math.max(leftDimeter, Math.max(rightDimeter, selfDimeter));
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
        root.left.left.right = new Node(7);
    
        System.out.println(dimater(root));
    }
}
