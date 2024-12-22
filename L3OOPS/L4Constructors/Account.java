package out.OPPS.L4Constructors;

public class Account {
    private int accId;
    private String name;
    private double balance;

    // public Account(){} //default constructors

    public Account(int id, String n, double bal){ //parametrize constructors no return type
        accId = id;
        name = n;
        balance = bal;
        System.out.println("constructor called..........");
        
    }

    public void showAccount(){
        System.out.println("Id = " + accId);
        System.out.println("Name = " + name);
        System.out.println("Balance = " + balance);
    }
}
