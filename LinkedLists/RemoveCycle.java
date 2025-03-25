package LinkedLists;
class list{
    class Node{
        int data;
        Node next;
         Node(int data) {
            this.data=data;
            this.next=null;
        }  
    }
    static Node head;
    boolean iscycle(){
        Node slow =head;
        Node fast = head;
        while(fast !=null&& fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    void remove(){
        //detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle =false;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        //find meating point
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //remove cycle->last.nexr=null
        prev.next=null;
    }

}
public class RemoveCycle {
    public static void main(String[] args) {
        list ll=new list();
        list.Node n=ll.new Node(1);
        list.Node temp=ll.new Node(2);
        ll.head=n;
        n.next=temp;
        n.next.next=ll.new Node(3);
        n.next.next.next=temp;
        System.out.println("Cycle detected: " + ll.iscycle());
        ll.remove();
        System.out.println("Cycle detected: " + ll.iscycle());
    }
}
