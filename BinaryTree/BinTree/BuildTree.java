package BinTree;

import java.util.LinkedList;
import java.util.Queue;

public class BuildTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BiTree{
        static  int idx = -1;
        public static Node bBuidTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=bBuidTree(nodes);
            newNode.right=bBuidTree(nodes);

            return newNode;
        }

        //print preorder tree(root print first)
        public static void preorder(Node root){
            if(root==null){
                System.out.print("-1 ");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        //print inorder tree (root print last befor right node)
        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        //print postordat tree (root print last after right node)
        public static void postordat(Node root){
            if(root==null){
                return;
            }

            postordat(root.left);
            postordat(root.right);
            System.out.print(root.data+" ");
        }

        //Level Order Traversal
        public static void levelOrder(Node root){
            if(root==null){
                return;
            }

            Queue<Node> q = new LinkedList<>();

            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BiTree tree = new BiTree();
        Node root = tree.bBuidTree(nodes);
        // System.out.println(root.data);
        // tree.preorder(root);
        // tree.inorder(root);
        // System.out.println();
        // tree.postordat(root);

        tree.levelOrder(root);        
    }
}
