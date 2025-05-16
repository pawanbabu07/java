package QueueDataStructure;
import java.util.*;
import java.util.LinkedList;
public class Interleave2HalvesOfaQueueEvenLength {
    public static void interLeave(Queue<Integer> q){
        Queue<Integer> firstHalfe = new LinkedList<>();
        int size = q.size();
        for(int i=0;i<size/2;i++){
            firstHalfe.add(q.remove());
        }
        while(!firstHalfe.isEmpty()){
            q.add(firstHalfe.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new java.util.LinkedList<>();
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
        interLeave(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
