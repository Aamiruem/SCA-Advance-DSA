package OPPS.L2Abstractions;

public class InternalPart {
	private void turnOnCar(){
        System.out.println("Engine is moving");
    }
	@SuppressWarnings("unused")
    private void moveBrakePads(){
		System.out.println("Brake pads are moving");
	}
	public void brake(){
        System.out.println("Car is braking");
    }
	public void accelerate(){
        System.out.println("Car is accelerating");
    }

	private void steer(){
        System.out.println("Car is steering");
    }
	public static void main(String[] args) {
		InternalPart internalPart = new InternalPart();
		internalPart.turnOnCar();
        internalPart.brake();
        internalPart.accelerate();
        internalPart.steer();
	}
}
