package OOPs;

public class SalloAndDeep {
    public static void main(String[] args){
        Child s1=new Child();
        s1.name="pawan";
        s1.rollNo=24120129;
        s1.marks[0]=15;
        s1.marks[1]=19;
        s1.marks[2]=21;
        Child s2=new Child(s1);
        s2.name="babu";
        System.out.println(s2.name+"\n"+s1.rollNo);
        s1.marks[2]=100;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Child{
    String name;
    int rollNo;
    int marks[];
    Child(){
        marks=new int[3];
    }
    //Sallo
   /*  Child(Child s1){
        this.marks=new int[3];
        this.name=s1.name;
        
    }*/
    //Deep
    Child(Child s1){
        marks=new int[3];
        this.name=s1.name;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }
};
