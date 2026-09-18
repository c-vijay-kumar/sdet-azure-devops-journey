package Day06;
import java.util.*;
public class throwagevalidator {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    int age=sc.nextInt();
    if(age<0){
        throw new ArithmeticException("Age cannot be negative");
    } else {
        System.out.println("Valid age: " + age);
    }
}
}
