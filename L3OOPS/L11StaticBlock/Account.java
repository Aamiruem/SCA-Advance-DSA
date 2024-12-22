package OPPS.L11StaticBlock;
import java.util.Scanner;
public class Account {
    private int accId;
    private String name;
    private double balance;
    @SuppressWarnings("unused")
    private static double rateOfInterest = 10.5;

    static{
        System.out.println("Enter rate of Interest: ");
        Scanner sc = new Scanner(System.in);
        rateOfInterest = sc.nextDouble();
        sc.close();
    }
    public Account(int id, String n, double bal){ //this is called parametrize constructors
        

        accId = id;
        name = n;
        balance = bal;
        System.out.println();
        System.out.println("Constructors is called...........");
        
    }

    public void showAccount() {
        System.out.println("id =  " + accId);
        System.out.println("name = " + name);
        System.out.println("balance = " + balance);
    }
}
