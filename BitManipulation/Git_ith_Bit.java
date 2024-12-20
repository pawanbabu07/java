package BitManipulation;

public class Git_ith_Bit {
    public static void GitithBit(int bit, int i){
        int markBit=1<<i;
        if((bit& markBit)==0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
    public static int Set_ith_Bit(int bit, int i){
        int makeBit=1<<i;
        return (bit | makeBit);
    }
    public static int Clear_ith_Bit(int bit, int i){
        int makeBit=~(1<<i);
        return (bit& makeBit);
    }
    public static int Update_ith_Bit(int bit, int i, int j){
        // if(j==0){
        //     return Clear_ith_Bit(bit, i);
        // }
        // else{
        //     return Set_ith_Bit(bit, i);
        // }
        //other way
        bit=Clear_ith_Bit(bit, i);
        int makeBit=j<<i;
        return bit|makeBit;
    }
    public static int Clear_list(int bit, int i){
        int makeBit=-1<<i;
        return bit&makeBit;
    }
    public static int Cleat_intravel(int bit, int i,int j){
        int n=(1<<i)-1;
        int m=(~0)<<(j+1);
        int makeBit=(n|m);
        return bit& makeBit;
    }
    public static Boolean PowerOf2(int n){
        //int p=n&(n-1);
        return (n&(n-1))==0;
        
    }
    public static int CountBit(int bit){
        int count=0;
        while(bit>0){
            if((bit&1)==0){
            count++;
            }
            bit=bit>>1;
        }
        return count;
    }
    public static void PowerOfnumber(int n, int m){
        int a=1;
        while(m>0){
            if((m&1)!=0){
                a*=n;
            }
            n*=n;
            m=m>>1;
        }
        System.out.println(a);
    }
    public static void main(String[] args){
        //GitithBit(11111111, 3);
        //System.out.println(Set_ith_Bit(10, 2));
        //System.out.println(Clear_ith_Bit(10,1));
        //System.out.println(Update_ith_Bit(10,2, 1));
        //System.out.println(Clear_list(15,2));
        //System.out.println(Cleat_intravel(10, 2, 4));
        //System.out.println(PowerOf2(4));
        //System.out.println(CountBit(8));
        PowerOfnumber(2, 5);
    }
}
