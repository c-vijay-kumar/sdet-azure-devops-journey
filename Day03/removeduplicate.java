package Day03;
import java.util.*;
public class removeduplicate {
    public static void main(String[] args){
        Set<Integer> uniq=new LinkedHashSet<>();
        int[] num={10, 20, 10, 30, 20, 40};
        for(int i=0;i<num.length;i++){
            uniq.add(num[i]);
        }
        System.out.println("Unique elements in the array: " + uniq);
    }
}
