package out.OPPS.L7Constructors;

public class Account {
    private int accId;
    private String name;
    private double balance;

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
