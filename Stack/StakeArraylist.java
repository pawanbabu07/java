package Stack;
import java.util.ArrayList;
class list{
    ArrayList<Integer>list=new ArrayList<>();
    //chake empty
    boolean isEmpty(){
        return list.size()==0;
    }
    //push
    void push(int data){
        list.add(data);
    }
    //pop
    int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    //peek
    int peek(){
        if(isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
    }
}
public class StakeArraylist {
    public static void main(String[] args) {
        list s = new list();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
