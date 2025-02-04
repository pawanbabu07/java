package example;

public class p1 {
    
public class PrimeNumbers {
    public static void main(String[] args) {
        int l = 100;
        System.out.println("Prime numbers up to " + l + ":");
               for (int num = 2; num <= l; num++) {
            boolean isPrime = true;
                for ( int i = 2; i< = Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}

}
