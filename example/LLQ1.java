package example;

class LinkedLists{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head;
    static Node tail;

    void addFirst(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    void print(){
        Node temp =head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
}
public class LLQ1 {
    public static void main(String[] args) {
        LinkedLists ll=new LinkedLists();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.print();
    }
}
