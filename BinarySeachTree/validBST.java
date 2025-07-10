package BinarySeachTree;

public class validBST {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data= data;
        }
    }

    public static boolean  isValidate(Node root, Node min, Node max){
        if(root == null){
            return true;
        }
        if(min !=null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data>= max.data){
            return false;
        }
        return  isValidate(root.left, min, root) &&  isValidate(root.right, root, max);

    }

    public static Node insert(Node root, int val){
        if(root == null){
            root =new Node(val);
            return root;
        }
        if(root.data>val){
            //left subtree
            root.left=insert(root.left, val);
        }
        if(root.data<val){
            //right subtree
            root.right=insert(root.right, val);
        }
        return root;
    }

    public static void main(String[] args) {
        int values[]= {8,5,6,10,11,14};
        Node root= null;
        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }
        System.out.println(isValidate(root, null, null));
    }
}
