package LinkedLists;

public class ReverseADoublyLL {
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    static Node head;
    static Node tail;
    static int size;
    //add
    void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    //print
    void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev= next;
            prev = curr;
            curr = next; 
        }
        head = prev;
    }
    public static void main(String[] args) {
    ReverseADoublyLL dll = new ReverseADoublyLL();
    dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.println(dll.size);
        dll.reverse();
        dll.print();
}
}
