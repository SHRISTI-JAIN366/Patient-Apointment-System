package OOPs.Inheritance.Project1;

public class manager extends Employee {
    int mngid;

    public manager(){
        System.out.println("manager default constructor");
    }

    public manager(String name,int Employee,int mngid){
        super(name,Employee);
        System.out.println("manager parameterized constructor");
        this.mngid=mngid;
    }
}
