package String;

public class ShortestPath {
    public static void path(String str){
        int x=0 ,y=0;
        for(int i=0; i<str.length();i++){
            if(str.length()=='N'){
                x+=1;
            }
            else if(str.length()=='E'){
                y+=1;
            }
            else if(str.length()=='W'){
                y-=1;
            }else{
                x-=1;
            }
        }
        double s= Math.sqrt(Math.pow((y-0),2)+Math.pow((x-0),2));
        System.out.println(s);
    }
    public static void main(String[] args){
        String str="NNEESSEWNE";
        path(str);
    }
}
