package OOPs;

import javax.sound.sampled.SourceDataLine;

public class Polymorphism {
    public static void main(String args[]){
        // Calculator cal=new Calculator();
        // System.out.println(cal.sum(5,7));
        // System.out.println(cal.sum(5.2f,7.7f));
        // System.out.println(cal.sum("pawan","babu"));
        Animal a= new Animal();
        a.eat();
        Goat g=new Goat();
        g.eat();
    }
}
//Overloading Polymorphism.....
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    String sum(String a, String b){
        return a+b;
    }
}
//Overriding Polymorphism......
class Animal{
    void eat(){
        System.out.println("food");
    }
}
class Goat extends Animal{
    void eat(){
        System.out.println("gress");
    }
}