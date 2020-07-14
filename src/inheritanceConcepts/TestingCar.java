package inheritanceConcepts;
// Method Overriding : Overriding methods child on parent
//                   :Method name is same but implementation is different
//We can not override static methods in java
// Can we overload static method in java? Yes we can .
//This method of overriding concept in java is called Runtime Polymorphism
// This is called single level inheritance where child class inherits from parent class
//Final Keyword : final methods can not be override
// Class can be final,but final class can not be  extended in other class, it will throw error message
//Variables can be final.

public class TestingCar {

	public static void main(String[] args) {
	/*	BMW b = new BMW();
		b.fuel();//From Car class
		b.startCar();//From Car and BMW class
		b.laneDeparture();//From BMW class
		b.stopCar();//From Car class
		b.engine();// From Vehicle class
		
	Car car=new Car();
	car.fuel();//Car class
	car.startCar();//Car class
	car.stopCar();//car class
	car.engine();//Vehicle class */
	
	Car c1 = new BMW();// Child class object can be referred by parent class reference variable
	c1.startCar(); //this concept in java is called Top Casting 
	c1.fuel();
	c1.stopCar();
	Vehicle v1 = new Car(); 
	v1.engine();
	
	/*BMW b1= (BMW)new Car(); // this concept is called down casting 
	b1.engine();// This concept will give ecception (error ) 
	b1.fuel();
	b1.startCar();
	b1.stopCar();*/
	}

}
