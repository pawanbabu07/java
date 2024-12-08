package example;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if (n > 2) {
            System.out.println(2);
            for (int i = 2; i <= n; i++) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        break;
                    } else {
                        System.out.println(i);
                        break;
                    }
                }
            }
        } else {
            System.out.println(2);
        }
    }
}
