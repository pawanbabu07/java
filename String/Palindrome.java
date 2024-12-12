package String;

public class Palindrome {
    public  static boolean chakePalindrom(String str){
       
        for(int i=0; i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String str="noooooooon";
        System.out.println(chakePalindrom(str));
    }
}
