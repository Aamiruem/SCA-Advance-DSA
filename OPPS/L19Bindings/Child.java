package OPPS.L19Bindings;

public class Child extends Parent{
    public static void show(){
        System.out.println("In show of child class.....");
    }
    @Override
    public void display(){
        System.out.println("In display of child class.....");
    }
}
