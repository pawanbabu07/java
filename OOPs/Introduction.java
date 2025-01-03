package OOPs;
import java.util.Scanner;
public class Introduction {
    public static void main(String[] args){
        // Pain pa =new Pain();
        // pa.SetColor("Green");
        // pa.SetColor("Red");
        // System.out.println(pa.color);
        Scanner sc = new Scanner(System.in);
        Account ac= new Account();
        long pass=sc.nextLong();
        ac.setPassword(pass);
        System.out.println(ac.getPassword());
    }
}
class Account{
    String username;
    private long password;
    void setPassword(long password){
        this.password=password;
    }
    long getPassword(){
        return this.password;
    }
}
class Pain{
    String color;
    int tip;
    void SetColor(String colorSet){
         color=colorSet;
    }
    void setTip(int tipSet){
         tip=tipSet;
    }
}