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
    void addFast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    void print(){
        if(head==null){
            System.out.println("LinkList is empty");
            return;
        }
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    boolean iscycle(){
        Node slow = head ;
        Node fast = head ;
        while(fast !=null && fast.next !=null){
            slow =slow.next;
            fast =fast.next.next;
            if(slow ==fast){
                return true;
            }
        }
        return false;
    }
}
public class Cycle {
    public static void main(String[] args) {
        list ll = new list();
        ll.head = ll.new Node(1);
        ll.head.next = ll.new Node(2);
        ll.head.next.next = ll.new Node(3);
        ll.head.next.next.next=ll.head;
        System.out.println("Cycle detected: " + ll.iscycle());
    }
}
