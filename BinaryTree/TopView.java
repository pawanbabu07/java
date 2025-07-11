
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;



public class TopView {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
 
    }

    static class info{
        Node node;
        int hig;
        info(Node node, int hig){
            this.node=node;
            this.hig=hig;
        }
    }
    public static void view(Node root){
        // level order
        Queue<info> q= new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max=0;
        q.add(new info(root, 0));
        q.add(null);
        while(!q.isEmpty()){
            info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!map.containsKey(curr.hig)){
                 map.put(curr.hig, curr.node);
                }
                if(curr.node.left != null){
                    q.add(new info (curr.node.left, curr.hig-1));
                    min=Math.min(min, curr.hig-1);
                }
                if(curr.node.right != null){
                    q.add(new info(curr.node.right, curr.hig+1));
                    max = Math.max(max, curr.hig+1);
                }
            }

        }
        for(int i=min; i<=max; i++){
            System.out.print(map.get(i).data+" ");
        }
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

        view(root);
    }
}
