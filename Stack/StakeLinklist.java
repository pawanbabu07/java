package Stack;

import example.LLQ1;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class list{
   Node head =null;
   boolean isEmpty(){
    return head == null;
   }  
   //push
   void push(int data){
    Node newNode = new Node(data);
    if(isEmpty()){
        head = newNode;
        return;
    }
    newNode.next = head;
    head = newNode;
   } 
   //pop
   int pop(){
    if(isEmpty()){
        return -1;
    }
    int top=head.data;
    head= head.next;
    return top;
   }
   // peek
   int peek(){
    if(isEmpty()){
        return  -1;
    }
    return head.data;
   }
}
public class StakeLinklist {
    public static void main(String[] args) {
        list s = new list();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        System.out.println(s.peek());
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println(s.peek());
    }
}
