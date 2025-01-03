package OOPs;

public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        //h.eat();
        Hen he = new Hen();
        he.walk();
        he.eat();
    }
}
//Abstraction on java ........
abstract class Animal{
    void eat(){
        System.out.println("eat food");
    }
    abstract void walk();
}
class Horse extends Animal{
       void walk(){
            System.out.println("wolk on four lage");
       } 
}
class Hen extends Animal{
    void walk(){
        System.out.println("walk on 2 lages");
    }
}