package String;
import java.lang.StringBuilder;
public class CompressString {
    public static void compressed(String st){
        StringBuilder nst = new StringBuilder("");
        
        for(int i=0;i<st.length();i++){
            Integer tamp=1;
            while(i<st.length()-1 && st.charAt(i)==st.charAt(i+1)){
                tamp++;
                i++;
            }
            if(tamp==1){
                nst.append(st.charAt(i-1));
               
            }
            else{
                nst.append(st.charAt(i-1));
                nst.append(tamp.toString());
            }
        }
        System.out.println(nst);
    }
    public static void compressed2(String st){
        String nst="";
        for(int i=0;i<st.length();i++){
            Integer count=1;
            while(i<st.length()-1 && st.charAt(i)==st.charAt(i+1)){
                count++;
                i++;
            }
            nst+=st.charAt(i);
            if(count>1){
                nst +=count.toString();
            }
        }
        System.out.println(nst);
    }
    public static void main(String[] args){
        String st="aabbcdddcdddddeeeeeeeeeeeefff";
        compressed(st);
        compressed2(st);
    }
}
