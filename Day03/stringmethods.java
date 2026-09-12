package Day03;
import java.util.*;
public class stringmethods {
    public static void main(String[] args) {
        String s="automation";
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println(s.indexOf('t'));
        System.out.println(s.lastIndexOf('t'));
        System.out.println(s.substring(2,5));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.replace('a','A'));
        System.out.println(s.contains("auto"));
        System.out.println(s.startsWith("auto"));
        System.out.println(s.endsWith("tion"));
        System.out.println(s.isEmpty());
    
        System.out.println(Arrays.toString(s.split("t")));
    }
}