package JAVA_OOP;

public class CLass_Object {
    public static void main(String[] args) {

        Person p1=new Person();
        p1.age= 24;
        p1.name= "ZIDAN";


        Person p2=new Person();
        p2.age= 34;
        p2.name= "ZIDANUU";

        System.out.println(p1.name +" "+ p1.age);
        System.out.println(p2.name +" "+ p2.age);
        p1.walk();
        p1.walk(30);
        p2.eat();
    }

}
class Person{
    String name;
    int age;

    void walk(){
        System.out.println(name +" "+"is walking.");
    }
    void eat(){

        System.out.println(name + " "+"is eating.");
    }

    void walk(int steps){   //polymorphijom
        System.out.println(name + " "+"walked"+steps);


        // Constructors-----



    }
}
