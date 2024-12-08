package Function.Mathord;
import java.lang.Math;

public class BtoD {
    public static void dicToBin(int num){
        int n=num;
        int pow=0;
        int binNum=0;
        while(n>0){
            int y=n%2;
            binNum= binNum+(y*(int)(Math.pow(10,pow)));
            n=n/2;
            pow++;
        }
        System.out.println(binNum);
    }
    public static void binToDec(int bnNum){
       int binNum =bnNum;
        int pow=0;
        int decNum=0;
        while(binNum>0){
            int y=binNum%10;
            decNum=decNum+(y*((int)Math.pow(2,pow)));
            binNum=binNum/10;
            pow++;
        }
        System.out.println(decNum);
    }
    public static void main (String[] args){
        dicToBin(7);
        binToDec(1111);
    }
}
