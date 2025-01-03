package OOPs;
import java.util.*;
public class Constructors {
    public static void main(String[] args){
        Student s1 =new Student();
        //s1.Student("pawan");
        Student s2=new Student(123);
        System.out.println(s2.rollNo);
        System.out.println(s1.name);
    }
}
class Student{
    String name;
    int rollNo;
    //non-paramaterized constructors
    Student(){
        Scanner sc=new Scanner(System.in);
        this.name=sc.nextLine();
    }
    //parammaterized condtructors
    Student(int rollNo){
        this.rollNo=rollNo;
    }
}
