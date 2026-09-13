package Day04;

public class Employee {
    private String name="vijay";
    private int id =101;
    private int salary=10000;
    private String department="IT";
     
    Employee(String name, int id, int salary, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setDepartment(String department) {
        this.department = department;
    }   
    public String getName() {
        return name + " " + id + " " + salary + " " + department;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
    public static void main(String[] args){
        Employee e=new Employee("Vijay-Kumar",1011,100000,"CSE-IT");
        e.displayDetails();
    }
}
