package Stack;

import java.util.Stack;
public class ValidParentheses {
    public static boolean isValid(String s){
        Stack<Character> c= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                c.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                if( c.peek()=='('&& ch== ')'
                || c.peek()=='{'&& ch== '}'
                || c.peek()=='['&& ch== ']'){
                    c.pop();
                }else{
                    return false;
                }
            }
        }
        if(c.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String s= "[]{{[()]()}{[]}}";
        System.out.println(isValid(s));
    }
}
