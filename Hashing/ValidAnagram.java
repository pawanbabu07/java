package Hashing;

import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagramt(String s, String t){

        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(map.get(ch)!=null){
                if(map.get(ch)==1){
                    map.remove(ch);
                }else{
                    map.put(ch, map.getOrDefault(ch, map.get(ch))-1);
                }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
        String s="adrrsarde";
        String t="adrrsard";
        System.out.println(isAnagramt(s, t));
    }
}
