package QueueDataStructure;
import  java.util.Queue;
public class QueueUsingJCF {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.print(q.remove());
        } 
    }
}
