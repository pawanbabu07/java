package LinkedLists;
class list{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head;
    void addFirst(int data){
        Node newNode= new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    void print(){
        if(head == null){
            System.out.println("empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1, Node head2){
        Node meargedLL =new Node(-1);
        Node temp = meargedLL;
        while(head1 != null && head2 != null){
            if(head1.data<=head2.data){
                temp.next = head1.next;
                head1 = head1.next;
                temp = temp.next;
            }else{
               temp.next =head2;
               head2 = head2.next;
               temp = temp.next; 
            }
        }
        while(head1 !=null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return meargedLL.next;
    }
    Node mergeSort(Node head){
        if(head==null || head.next ==null){
            return head;
        }
        //find mid
        Node mid = getMid(head);
        //left & right ms
        Node rightHead= mid.next;
        mid.next=null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        //merge
        return merge(newLeft, newRight);
    }
}
public class MergeSort {
    public static void main(String[] args) {
        list ll=new list();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        System.out.println(ll);
        ll.head= ll.mergeSort(ll.head);
        ll.print();
    }
}
