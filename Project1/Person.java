package OOPs.Inheritance.Project1;

public class Person {
    String name;

    public Person(){
        System.out.println("person default constructor");
    }

    public Person(String name){
        System.out.println("person parameterized constructor");
        this.name=name;
    }


}
