package OOPs.Inheritance.Project1;

public class service {
    public static void main(String[] args) {
        manager obj =new manager("vikas",11,22);
        System.out.println(obj.name+" "+obj.empid+" "+obj.mngid);

        Employee obj1= new Employee("vikas",22);
        System.out.println(obj1.name +" "+ obj1.empid);

        manager obj2 =new manager("boy",33,44);
        System.out.println(obj2.name+" "+obj2.empid+" "+obj2.mngid);

        owner onj3=new owner("vikas","fashion");
        System.out.println(onj3.name+" "+onj3.sector);
    }
}
