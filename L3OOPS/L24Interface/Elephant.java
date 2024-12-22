package OPPS.L24Interface;

public class Elephant implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Elephant is making trumpet sound");
    }

    @Override
    public void eat() {
       System.out.println("Elephant eats grass and leaves ");
    }
    
}
