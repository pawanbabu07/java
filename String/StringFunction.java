package String;


public class StringFunction {
    public static void main(String[] args){
        String s1="pawan";
        String s2="pawan";
        String s3=new String("pawan");
        if(s1==s2){
            System.out.println("equal");
        }else{
            System.out.println("not");
        }
        if(s1==s3){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
        if(s1.equals(s3)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }	       
}
