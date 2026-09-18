package Day05;
import java.util.*;

abstract class Employee{
    String name;
    int salary ;
    Employee(String name, int salary){
        this.name=name;
        this.salary=salary;
    }
    String displayDetails(){
        return name + " " + salary;
    }
    abstract int calculateBonus();
}

class Devloper extends Employee{
    
    Devloper(String name, int salary){
        super(name, salary);
    }
    @Override 
    int calculateBonus(){
        return salary*10/100;
    }
}
class Tester extends Employee{
    Tester(String name, int salary){
        super(name, salary);
    }
    @Override 
    int calculateBonus(){
        return salary*5/100;
    }
}
public class abstractcls{
    public static void main(String[] args){
        Tester t=new Tester("vijay", 10000);
        Devloper d=new Devloper("kumar", 20000);
        System.out.println(t.displayDetails() + " " + t.calculateBonus());
        System.out.println(d.displayDetails() + " " + d.calculateBonus());

    }
}
