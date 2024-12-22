
// important point

// 1. we  always call a static method using class name

// 2. static method can't access non-static data member of the class

// 3.A static method can only access static data of class directly. For accessing non static data we will have to create object of the class in the static method


// Why to declare method as "static"?
// == == === == == == == == 
// 1. If we want to access only static data of the class inside the method body then we must declare the method as static

// 2.whenever we have a method in the class which only operates on its parameters, then we must declare that methods as static




package out.OPPS.L9Static;

class Emp {
    private int age;
    private String name;
    private static String company = "Amazon";

    public Emp(int a, String n) {
        age = a;
        name = n;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Company: " + company);
    }

    public static void showCompany() {
        System.out.println("Company Name: " + company);
    }
}

public class ImpPoint {
    public static void main(String[] args) {
        Emp.showCompany();
        Emp e1 = new Emp(25, "John");
        Emp e2 = new Emp(30, "Jane");
        Emp e3 = new Emp(22, "Kamran");

        e1.display();
        e2.display();
        e3.display();
    }
}
