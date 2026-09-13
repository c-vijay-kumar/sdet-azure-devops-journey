package Day04;
class methods {
    private String name;
    private int age;

    static String company = "CGI";

    methods(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public void displayDetails() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Company: " + company);
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {

        if(age > 0) {
            this.age = age;
        }
    }
}
public class Main{
    public static void main(String[] args){
        methods m=new methods("vijay",24);
        m.displayDetails();
        m.setAge(24);
        m.getName();
        
    }
}