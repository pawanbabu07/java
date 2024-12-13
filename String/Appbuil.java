package String;
import java.lang.StringBuilder;
public class Appbuil {
    public static void main(String args[]) {
        StringBuilder st = new StringBuilder("");
        // a char addad in last of word
        for(char ch='a'; ch<='z'; ch++){
            st.append(ch);
        }
       System.out.println(st);
    }
}
