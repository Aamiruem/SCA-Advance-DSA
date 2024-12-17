package OPPS.L13Inheritance;

public class UseVehicle {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle();

        Car audi = new Car();
        audi.start();
        audi.accelerate();
        audi.reverse();
        audi.turnLeft();
        audi.turnRight();
        audi.brake();

    }
}
