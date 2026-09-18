package Day06;
import java.util.*;
public class arrayexception {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] n={1,2,3,4,5};
        System.out.print("Enter an index to access the array: ");
        try{
            for(int i=0;i<10;i++){
                System.out.println("Element at index " + i + ": " + n[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds.");
        }
    }
}
