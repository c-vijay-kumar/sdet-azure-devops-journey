package Day05;
import java.util.*;
class Animal {
    public void eat(){
        System.out.println("Animal eating");
    }
    void sound(){
        System.out.println("animals makes sound");
    }
}
class Dog extends Animal{
    @Override 
    void sound(){
        System.out.println("dak barks");
    }
}
class Cat extends Dog{
    @Override 
    void sound(){
        System.out.println("meows");
    }
}
public class Main {
    public static void main(String[] args){
        Animal a=new Animal();
        a.eat();
        a.sound();
        Dog d=new Dog();
        d.eat();
        d.sound();
        Cat c=new Cat();
        c.eat();
        c.sound();
    }
}
