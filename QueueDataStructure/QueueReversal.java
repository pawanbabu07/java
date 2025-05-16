package QueueDataStructure;
import java.util.*;
// import java.util.Stack;
import java.util.LinkedList;
public class QueueReversal {
    public static void revurse(Queue<Integer> q){
        Stack<Integer> s=new Stack();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        q.add(11);
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);
        revurse(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
