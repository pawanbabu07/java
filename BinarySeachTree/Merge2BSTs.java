package BinarySeachTree;

import java.util.ArrayList;

public class Merge2BSTs {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data= data;
            this.left= this.right= null;
        }
    }

    public static void priorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        priorder(root.left);
        priorder(root.right);
    }

    public static void getInorder(Node root, ArrayList<Integer> arr){
        if(root==null){
            return;
        }

        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }

    public static Node creatBST(ArrayList<Integer> inorder, int st, int end){
        if(st>end){
            return null;
        }

        int mid=(st+end)/2;
        Node root=new Node(inorder.get(mid));
        root.left= creatBST(inorder, st, mid-1);
        root.right= creatBST(inorder, mid+1, end);
        return root;
    }

    public static Node mergedBST(Node root1, Node root2){
        //step 1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1,arr1);

        //step 2
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        ArrayList<Integer> finalArr = new ArrayList<>();
        int i=0,j=0;
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i) <= arr2.get(j)){
                finalArr.add(arr1.get(i));
                i++;
            }else{
                finalArr.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()){
            finalArr.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()){
            finalArr.add(arr2.get(j));
            j++;
        }
        return creatBST(finalArr, 0, finalArr.size()-1);
    }

    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right =new Node(12);

        Node root = mergedBST(root1, root2);
        priorder(root);
        
    }
}
