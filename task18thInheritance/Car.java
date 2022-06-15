package task18thInheritance;

/*
  class Maruti extends Car and class Benz extends Maruti. 
With the help of this setup, 
our Benz class is able to use all the methods of both classes (Car and Maruti).

Methods in Car class
- Car() - in this constructor print "Class Car"
- vehicleType() - in this method print "Vehicle Type: Car"

Methods in Maruti class 
- Maruti() - in this constructor print "Class Maruti"
- brand() - in this method print "Brand: Maruti"
- speed() - in this method print "Maximum speed: 90Kmph"

Methods in Benz class
- Benz() - in this constructor print "Class Benz"
- speed() - in this method print "Maximum speed: 100Kmph"
 */
public class Car {
	public Car() {
		// TODO Auto-generated constructor stub
		System.out.println("Class Car");
	}

	void vehicleType() {
		System.out.println("Vehicle Type: Car");
	}
}
