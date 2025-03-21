package LinkedLists;
class list{
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data=data;
            this.next=null;
        }
        
    }
    static Node head;
    void addF(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    void  print(){
        if(head==null){
            System.out.println("LinkList is empty");
            return;
        }
        Node temp= head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    boolean checkPalidrome(){
        if(head == null || head.next == null){
            return true;
        }
        Node midNode = findMid(head);
        Node prev =null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right  = prev;
        Node left = head;
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return  true;
    }

}
public class Palindrome {
    public static void main(String[] args) {
        list ll=new list();
        ll.addF(5);
        ll.addF(4);
        ll.addF(3);
        ll.addF(2);
        ll.addF(1);
        ll.addF(0);
        //ll.addF(0);
        ll.addF(1);
        ll.addF(2);
        ll.addF(3);
        ll.addF(4);
        ll.addF(5);
        ll.print();
        System.out.println(ll.checkPalidrome());
    }
}
