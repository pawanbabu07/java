package String;
/*
 Q4. For a given String convert each the first latter 
 of each word to uppercase.
 */
import java.lang.StringBuilder;
public class StringBuilderQ4 {
    public static void sBuilder(String sb){
        StringBuilder nsb = new StringBuilder("");
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)==' '&& i<sb.length()-1){
                nsb.append(sb.charAt(i));
                nsb.append(Character.toUpperCase(sb.charAt(++i)));;
            }
            else if(i==0){
                nsb.append(Character.toUpperCase(sb.charAt(0)));
            }
            else{
                nsb.append(sb.charAt(i));
            }
        }
        System.out.println(nsb);
    }
    public static void main(String args[]){
        String sb ="i love you ";
        sBuilder(sb);

    }
}
