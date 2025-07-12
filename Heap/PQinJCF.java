package  Heap;
import java.util.Comparator;
import java.util.PriorityQueue;


 
public class PQinJCF{
    public static void main(String[] args) {
        PriorityQueue<Integer> PQ = new PriorityQueue<>();

        PQ.add(3);// O(logn)
        PQ.add(4);
        PQ.add(1);
        PQ.add(2);

        while(!PQ.isEmpty()){
            System.out.println(PQ.peek());// O(1)
            PQ.remove();//O(logn)
        }
        /*output:
         1
         2
         3
         4
        */

        PriorityQueue<Integer> PQR = new PriorityQueue<>(Comparator.reverseOrder());

        PQR.add(3);// O(logn)
        PQR.add(4);
        PQR.add(1);
        PQR.add(2);

        while(!PQR.isEmpty()){
            System.out.println(PQR.peek());// O(1)
            PQR.remove();//O(logn)
        }

         /*output:

         4
         3
         2
         1
        */
    }
}

