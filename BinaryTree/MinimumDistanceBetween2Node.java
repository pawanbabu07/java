public class MinimumDistanceBetween2Node {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    public static Node lca(Node root, int n1, int n2){
        if(root==null || root.data==n1 ||root.data==n2){
            return root;
        }
        Node leftLca = lca(root.left, n1, n2);
        Node rightLca = lca(root.right, n1, n2);

        //leftLca ya rightLca = null
        if(rightLca == null){
            return leftLca;
        }
        if(leftLca == null){
            return rightLca;
        }
        return  root;
    }

    public static int lcaDis(Node root, int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDis = lcaDis(root.left, n);
        int rightDis = lcaDis(root.right, n);
        if(leftDis==-1 && rightDis ==-1){
            return -1;
        }else if (leftDis==-1){
            return rightDis+1;
        }else{
            return leftDis+1;
        }
    }

    public static int mainDis(Node root, int n1, int n2){
        Node lca = lca(root, n1, n2);
        int lcaDist1 = lcaDis(lca, n1);
        int lcaDist2 = lcaDis(lca, n2);
        return lcaDist1+ lcaDist2;
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

        int n1=4, n2=5;
        System.out.println(mainDis(root, n1, n2));
    }
}
