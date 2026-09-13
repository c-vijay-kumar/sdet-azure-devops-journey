package Day04;
class cal{
    public int add(int a , int b){
        return a+b;
    }
    public int sub(int a , int b){
    return a-b;
    }
    public int mul(int a , int b){
    return a*b;
}
public int div(int a , int b){
    return a/b;
}
    public static void main(String[] args){
        cal c=new cal();
        System.out.println(c.add(10, 5));
        System.out.println(c.sub(10, 5));
        System.out.println(c.mul(10, 5));
        System.out.println(c.div(10, 5));
    }
}
