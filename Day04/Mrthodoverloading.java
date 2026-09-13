package Day04;

public class Mrthodoverloading {
    public void m1(int n,int v){
        System.out.println("Method with 2 int parameters");
    }
    public void m1(String s){
        System.out.println("Method with 1 String parameter");
    }
    public static void main(String[] args){
        Mrthodoverloading obj=new Mrthodoverloading();
        obj.m1(10,20);
        obj.m1("Hello");
    }
    
}
