package OPPS.L7Constructors;

public class DefaultConstructors {
    class Account{
        @SuppressWarnings("unused")
        private int accId;
        @SuppressWarnings("unused")
        private String name;
        @SuppressWarnings("unused")
        private double balance;
        public Account(){
            System.out.println("constructor called..........");
        }
    }
}
