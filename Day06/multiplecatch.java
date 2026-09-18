package Day06;
import java.util.*;
public class multiplecatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
        int a=sc.nextInt(); 
        int b=sc.nextInt();
        
            int result=a/b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter integers only.");
        }
    
    }
}
