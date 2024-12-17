package OPPS.L11StaticBlock;

public class userAccount {
    public static void main(String[] args) {

        Account a = new Account(1, "kamran", 15000000.0); // obj first

        Account a1 = new Account(2, "Afroz", 10009800.0); // obj second

        a.showAccount();

        System.out.println();
        a1.showAccount();

    }
}
