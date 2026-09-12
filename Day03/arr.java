package Day03;
import java.util.*;
// public class arr{
// 
    //Pattern 1 — Find largest number
    // public static void main(String[] args){
        // int[] s={2,5,3,6,2,6,7};
        // int temp=0;
        // for(int i=0;i<s.length;i++){
            // if(s[i]>temp){
                // temp=s[i];
            // }
        // }
        // System.out.println("Largest number: " + temp);
    // }
// }
// 
// Find smallest number
public class arr{
    public static void main(String[] args){
    int[] n={1,4,1,6,89,0};
    int temp=n[0];
    for(int i=0;i<n.length;i++){
        if(n[i]<temp){
            temp=n[i];
        }
    }
    System.out.println("Smallest number: " + temp);
    }
}