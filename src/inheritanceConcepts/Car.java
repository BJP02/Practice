package inheritanceConcepts;

//Car is a Parent class

public class Car extends Vehicle { 

	public void fuel() {
		System.out.println("Car---->Should have fuel");
	}

	public void startCar() {
		System.out.println("Car---->Start a Car");
	System.out.println("Car---->Starts Manually with Key");
	}
	
	
	public void stopCar() {
		System.out.println("Car---->Stop  Car");
	}
	
	
	
}
