package Day03;
import java.util.*;
public class charfreq {
    public static void main (String[] args){
        Map<Character,Integer> map=new HashMap<>();
        String s="automation";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            } else {
                map.put(ch,1);
            }
        }
        System.out.println("Character frequencies in the string: " + map);
        
    }
}
