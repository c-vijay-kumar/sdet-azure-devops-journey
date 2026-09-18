package Day05;

class Person{
    Person(){
        System.out.println("person's class constructor");
    }
}
class Employee extends Person{
    Employee(){
        super();
        System.out.println("Employee's class constructor");
    }
}
class developer extends Employee{
    developer(){
        super();
        System.out.println("developer's class constructor");
    }
}
public class constchaining {
    public static void main(String[] args){
        developer d=new developer();
    }
}
