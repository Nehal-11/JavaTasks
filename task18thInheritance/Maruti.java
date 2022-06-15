package task18thInheritance;

public class Maruti  {
	public Maruti() {
		// TODO Auto-generated constructor stub
		System.out.println("Class Maruti");
	}

	void brand() {
		System.out.println("Brand : Maruti");

	}

	void speed() {
		System.out.println("Max speed: 90kmph");
	}
	void vehicleType() {
		Car oCar= new Car();
		oCar.vehicleType();
		System.out.println("Vehicle Type: Maruti");
	}
	
	
}
