package OOPs;

public class Inheritance {
    public static void maim(String arg[]){
        Animal a = new Animal();
        a.color="white";
        Fish f= new Fish();
        f.color="Silver";
        f.food();
        a.food();
        f.swin();
        System.out.println(a.color+"\n"+f.color);
    }
}
class  Animal{
    String color;
    void food(){
        System.out.println("food");
    }
}
class Fish extends Animal{
    void swin(){
        System.out.println("Swins in water");
    }
}
