package Day04;

public class consoverloading {
    private int a=20;
    private int b=20;
    consoverloading(int a,int b){
        this.a=a;
        this.b=b;
    }
    consoverloading(int a){
        this.a=a;
    }
    public static void main(String[] args) {
        consoverloading obj1=new consoverloading(10,20);
        consoverloading obj2=new consoverloading(15);
        System.out.println("Value of a in obj1: " + obj1.a);
        System.out.println("Value of b in obj1: " + obj1.b);
        System.out.println("Value of a in obj2: " + obj2.a);
    }
}
