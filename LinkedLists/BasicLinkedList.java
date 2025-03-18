package LinkedLists;

public class BasicLinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        //step=creat new node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        //step2-newNode next=head
        newNode.next=head; //link

        //step3- head=newNode
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if (head==null) {
            head= tail =newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
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
    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNod=new Node(data);
        size++;
        Node temp = head;
        int i =0;
        while(i< idx-1){
            temp = temp.next;
            i++;
        }
        newNod.next = temp.next;
        temp.next = newNod;
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("linklist is empity");
            return Integer.MAX_VALUE;
        }else if(size==1){
            int val =head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val =head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("lest is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail=null;
            size=0;
            return val;
        }
        //prev i=sixe-2
        Node prev =head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val = prev.next.data;
        prev.next=null;
        tail =prev;
        size--;
        return val;
    }
    public static int search(int key){
        Node temp = head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    // Recursion search
    //------------------------
    public static int helper(Node head, int key){
            if(head==null){
                return -1;
            }
            if(head.data ==key){
                return 0;
            }
            int idx = helper(head.next, key);
            if(idx==-1){
                return -1;
            }
            return  idx+1;
        }
        public static int recSearch(int key){
            return helper(head, key);
    }
    //-----------------------------
    //Reverse a linked list
    public void reverse(){
            Node prev = null;
            Node curr =tail=head;
            Node next;
            while(curr !=null){
                next =curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
        }
        public static void main(String[] args) {
            BasicLinkedList ll=new BasicLinkedList();
            ll.print();
            ll.addFirst(1);
            ll.addFirst(2);
            ll.addFirst(3);
            ll.addFirst(4);
            ll.addFirst(5);
            ll.print();
            ll.removeFirst();
            ll.add(3, 11);
            ll.addLast(7);
            ll.addLast(8);
            ll.addLast(9);
            ll.addLast(10);
            ll.print();
            System.out.println(ll.size);
            ll.removeLast();
            System.out.println(ll.size);
            System.out.println(search(11));
            System.out.println(recSearch(1));
            ll.reverse();
            ll.print();
    }
}
