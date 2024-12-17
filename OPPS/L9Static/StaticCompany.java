// package OPPS.L9Static;

// class Emp {
//     private int age;
//     private String name;
//     private static String company = "Amazon";

//     public Emp(int i, String string) {
//         age = i;
//         name = string;
//         // this.company = company; // This will not compile as 'company' is a static variable.
//     }
    

//     // public void Emp(int a, String n) {
//     //     age = a;
//     //     name = n;
//     // }

//     public void display() {
//         System.out.println("Age: " + age);
//         System.out.println("Name: " + name);
//         System.out.println("Company: " + company);
//     }

//     public static void showCompany() {
//         System.out.println("Company Name: " + company);
//     }
// }

// public class StaticCompany {
//     public static void main(String[] args) {
//         Emp.showCompany();
//         Emp e1 = new Emp(22, "Afroz");
//         Emp e2 = new Emp(30, "Jane");
//         Emp e3 = new Emp(22, "kamran");

//         e1.display();
//         e2.display();
//         e3.display();

//     }
// }






package out.OPPS.L9Static;

// Employee class
class Emp {
    // Private instance variables
    private int age;
    private String name;
    // Static variable shared by all instances
    private static String company = "Amazon";

    // Constructor to initialize instance variables
    public Emp(int i, String string) {
        age = i;
        name = string;
        // This will not compile as 'company' is a static variable.
        // this.company = company;
    }

    // This is not a constructor, it's a method with the same name as the class
    // public void Emp(int a, String n) {
    //     age = a;
    //     name = n;
    // }

    // Method to display instance variables
    public void display() {
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Company: " + company);
    }

    // Static method to display company name
    public static void showCompany() {
        System.out.println("Company Name: " + company);
    }
}

public class StaticCompany {
    public static void main(String[] args) {
        // Call static method to display company name
        Emp.showCompany();
        // Create instances of Emp class
        Emp e1 = new Emp(22, "Afroz");
        Emp e2 = new Emp(30, "Jane");
        Emp e3 = new Emp(22, "kamran");

        // Call display method on each instance
        e1.display();
        e2.display();
        e3.display();
    }
}
