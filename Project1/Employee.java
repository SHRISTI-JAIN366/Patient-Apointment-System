package OOPs.Inheritance.Project1;

public class Employee extends Person {
    int empid;

    public Employee(){
        System.out.println("employee default constructor");
    }

    public Employee(String name,int empid){
        super(name);
        System.out.println("employee parameterized constructor");
        this.empid=empid;
    }
}
