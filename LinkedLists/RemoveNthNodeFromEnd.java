package LinkedLists;

class List{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head;
    static Node tail;
    static int size;
    void addF(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head =tail=newNode;
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
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    void removeNthNode(int n){
        int size=0;
        Node temp = head;
        while(temp != null){
            temp =temp.next;
            size++;
        }
        if(n==size){
            head=head.next;
            return;
        }
        int i=1;
        int iToFind =size-n;
        Node prev =head;
        while(i<iToFind){
            prev =prev.next;
            i++;
        }
        prev.next=prev.next.next;
    }
}

public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {
    List ll=new List();
        ll.addF(5);
        ll.addF(4);
        ll.addF(3);
        ll.addF(2);
        ll.addF(1);
        ll.print();
        ll.removeNthNode(3);
        ll.print();
    }
}
