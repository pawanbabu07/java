package String;

public class SubString {
    public static void printSubstring(String str, int a1, int a2){
        for(int i=a1; i<a2; i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
    public static void main(String[] args){
        String str = "RiturajPawan";
        printSubstring(str,4,7);
        System.out.println(str.substring(4,7));
    }
}
