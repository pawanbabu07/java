
package BinarySeachTree;

import java.util.ArrayList;

import javax.swing.plaf.basic.BasicBorders;

class BuildABST {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data= data;
        }
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

    public static void inordet(Node root){
        if(root==null){
            return;
        }
        inordet(root.left);
        System.out.print(root.data+" ");
        inordet(root.right);
    }

    public static boolean search(Node root, int key){ //time complicty is O(H)
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int val){
        if(root.data <val){
            root.right = delete(root.right, val);
        }else if(root.data >val){
            root.left = delete(root.left, val);
        }else{
            // case 1 : leaf node
            if(root.left==null && root.right== null){
                return null;
            }
            // case 2: single child
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            // case 3: both children
            else{
                Node is = findInorderSuccessor(root.right);
                root.data=is.data;
                root.right = delete(root.right, is.data);
            }
        }
        return  root;
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left!= null){
            root=root.left;
        }
        return root;
    }


    public static void printInRange(Node root, int k1, int k2){
        if(root==null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }else if(root.data<k1){
            printInRange(root.left, k1, k2);
        }else{
            printInRange(root.right, k1, k2);
        }
    }

    public static void printRootToLeaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            System.out.println(path);
        }
        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        int [] a={5,1,3,4,2,7};
        Node root=null;
        for(int i=0; i<a.length; i++){
            root=insert(root, a[i]);
        }
        // inordet(root);
        // System.out.println(search(root, 9));
        // System.out.println();
        // root=delete(root, 7);
        // inordet(root);
        // printInRange(root, 9, 10);
        printRootToLeaf(root, new ArrayList<>());
    }
}