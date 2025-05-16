package QueueDataStructure.DequeDataStructure;
import java.util.Deque;
import java.util.LinkedList;

public class BasicDeque {
    public static void main(String[] args) {
        //Double ended queue
        
        //addFirst()
        //addLast()
        //remobeFirst()
        //removeLast()
        //getFirst()
        //getLast()

        Deque<Integer> dq= new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        // dq.removeFirst();
        System.out.println(dq);
     
        dq.addLast(3);
        dq.addLast(4);
        // dq.removeLast();
        System.out.println(dq);

        System.out.println("first el = "+ dq.getFirst());
        System.out.println("first el = "+ dq.getLast());
    }
}
