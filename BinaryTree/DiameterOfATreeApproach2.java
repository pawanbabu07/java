public class DiameterOfATreeApproach2 {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        } 
 
    }

    static class Info{
        int dim;
        int hei;
        public Info(int dim , int hei){
            this.dim=dim;
            this.hei=hei;
        }
    }

    public static Info diameter(Node root){

        if(root==null){
            return new Info(0,0);
        }
        Info leftInfo= diameter(root.left);
        Info rightInfo= diameter(root.right);

        int dim = Math.max(Math.max(leftInfo.dim, rightInfo.dim), leftInfo.hei + rightInfo.hei + 1);
        int hei = Math.max(leftInfo.hei, rightInfo.hei) +1;
        return new Info(dim, hei);
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
    
        System.out.println(diameter(root).dim);
    }
}
