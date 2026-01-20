package OOPs.Inheritance.Project1;

public class owner extends Person{
    String  sector;

    public owner(){
        System.out.println("owner default constructor");
    }

    public owner(String name,String sector){
        super(name);
        System.out.println("owner parameterized constructor");
        this.sector=sector;
    }
}
