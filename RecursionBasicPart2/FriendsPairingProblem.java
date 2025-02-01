/*Given n friends, each one can remain single or can be paired up with some other friend.
 Each friend can be paired only once. Find out the total number of ways in friends 
 can remain single or can be paired up. */
package RecursionBasicPart2;

public class FriendsPairingProblem {

    public static int pairing(int n){
        if(n==1||n==2){
            return n;
        }
        
        return pairing(n-1)+(n-1)*pairing(n-2);
    }
    public static void main(String args[]){
    System.out.println(pairing(3));           
    }
}
