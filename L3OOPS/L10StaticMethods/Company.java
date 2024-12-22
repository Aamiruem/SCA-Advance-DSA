package OPPS.L10StaticMethods;

class Emp {
    private int age;
    private String name;
    private static String company = "Amazon";

    public Emp(int i, String string) {
        age = i;
        name = string;
        // this.company = company; // This will not compile as 'company' is a static variable.
    }
    

    // public void Emp(int a, String n) {
    //     age = a;
    //     name = n;
    // }

    public void display() {
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Company: " + company);
    }

    public static void showCompany() {
        System.out.println("Company Name: " + company);
    }
}

public class Company {
    public static void main(String[] args) {
        Emp.showCompany();
        Emp e1 = new Emp(22, "Afroz");
        Emp e2 = new Emp(30, "Jane");
        Emp e3 = new Emp(22, "kamran");

        e1.display();
        e2.display();
        e3.display();

    }
}
