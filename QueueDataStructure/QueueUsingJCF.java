package QueueDataStructure;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
public class QueueUsingJCF {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>();//ArrayDeque
        Queue<Integer> q= new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.print(q.remove());
        } 
    }
}
