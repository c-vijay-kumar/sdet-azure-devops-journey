import java.util.*;
public class nonrepated {
    public static void main(String[] args){
        String s="kiss";
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
                }else{
                    map.put(ch,1);
                }

            }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;  //this makes to print only first non repeated character
            }
        }
    }
}
