package Day03;

public class stringbuilder {
    public static void main(String[] args){
        StringBuilder s= new StringBuilder();
        System.out.println(s.append("vijay"));
        System.out.println(s.insert(0, "t"));
        System.out.println(s.delete(0, 1));
        System.out.println(s.reverse());
        System.out.println(s.toString());
    }
}
