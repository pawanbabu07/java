package BinarySeachTree;

public class MirrorBST {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data= data;
            this.left= this.right= null;
        }
    }

    public static Node mirror(Node root){
        if(root == null){
            return null;
        }
        Node leftMirror = mirror(root.left);
        Node rightMirror = mirror(root.right);
        root.left= rightMirror;
        root.right= leftMirror;
        return root;
    }

    public static void priorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        priorder(root.left);
        priorder(root.right);
    }

    public static void main(String[] args) {

            //      8
            //     / \
            //    5   10
            //   / \   \
            //  3   6   11
        Node root= new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        root = mirror(root);
        priorder(root);

    }
}
