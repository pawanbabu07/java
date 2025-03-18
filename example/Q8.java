package example;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s=new String[4];
        System.out.println("Ente string:");
        for (int i = 0; i < s.length; i++) {
            s[i]=sc.nextLine();
        }
        for (int i = s.length-1; i>=0; i--) {
            System.out.println(s[i]);
        }
    }
}
