package OPPS.L2Abstractions;

// Define CarInterface with required methods
interface CarInterface {
    void startEngine();
    void accelerate();
    void brake();
    void changeGear(int gear);
}

// Define VehicleInterface with required methods
interface VehicleInterface {
    void move(int distance);
    void stop();
    void drive(int speed);
}

// Implement both interfaces in the Car class
class Car implements CarInterface, VehicleInterface {
    @Override
    public void startEngine() {
        System.out.println("Engine started.");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking.");
    }

    @Override
    public void changeGear(int gear) {
        System.out.println("Car gear changed to " + gear);
    }

    @Override
    public void move(int distance) {
        System.out.println("Car moved " + distance + " units.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }

    @Override
    public void drive(int speed) {
        System.out.println("Car is driving at " + speed + " km/h.");
    }
}

// Driver class
public class ExternalPart {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car car = new Car(); // create a new object of the Car class
        
        // Use the methods defined in the interfaces
        car.startEngine(); // Calls the startEngine method defined in the CarInterface
        car.accelerate(); // Calls the accelerate method defined in the CarInterface
        car.brake(); // Calls the brake method defined in the CarInterface
        car.changeGear(3); // Calls the changeGear method defined in the CarInterface

        car.move(10); // Calls the move method defined in the VehicleInterface

        car.stop(); // Calls the stop method defined in the VehicleInterface
        car.drive(50); // Calls the drive method defined in the VehicleInterface
    }
}
