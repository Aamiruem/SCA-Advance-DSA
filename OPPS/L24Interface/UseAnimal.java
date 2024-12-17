package OPPS.L24Interface;

public class UseAnimal {
    public static void main(String[] args) {

        Animal a;
        a = new Lion();
        a.makeSound();
        a.eat();

        a = new Elephant();
        a.makeSound();
        a.eat();

System.out.println();

        //this is a different from above
        a = new Lion();
        a.makeSound();
        a.eat();

    }
}
