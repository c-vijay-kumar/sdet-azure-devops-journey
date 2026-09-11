import java.util.*;
public class duplicates {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,3};
        Set<Integer> order=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            order.add(arr[i]);
        }
        System.out.println(order);
    }
}