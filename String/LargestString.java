package String;

public class LargestString {
    public static void main(String[] args){
        String str1 = "mango";
        String str2 = "apple";
       
        System.out.println( str1.compareTo(str2));
        String str[] ={"apple","mango","banana","papaya"};
        String st= str[0];
        for(int i=0; i<str.length;i++){
            if(st.compareTo(str[i])<0){
                st=str[i];
            }
        }
        System.out.println(st);
        String st1="apple";
        String st2="APPLA";
        //camareToIgnoreCase ignore the upper and lower case of englidh alphbate
        System.out.println(st1.compareToIgnoreCase(st2));
    }
}
