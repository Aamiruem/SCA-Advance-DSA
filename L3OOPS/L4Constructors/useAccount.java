package OPPS.L4Constructors;
// import java.util.*;

public class useAccount {
    public static void main(String[] args) {

        Account a = new Account(1, "kamran", 1000000000.0);// Account is a method but a is the reference
        Account a1 = new Account(2, "Afroz", 10009800.0);
        
        a.showAccount();
        System.out.println();
        a1.showAccount();
    }
}
