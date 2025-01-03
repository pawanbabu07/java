package OOPs;

public class Superkeyword {
    public static void main(String[] args){
        Horse h1=new Horse();
        
    }
}
class Animal{
    Animal(){
        System.out.println("Love every animals.");
    }
}
class Horse extends Animal{

    Horse(){
        super();
        System.out.println("horse comstructor id called");
    }
}