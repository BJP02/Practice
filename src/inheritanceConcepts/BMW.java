package inheritanceConcepts;
//BMW is Child class

public class BMW extends Car{

	@Override//  I can override only  child method on parent
	public void startCar() {// This is method overriding where method is same but implementation is diff
		System.out.println("BMW---->Start a Car");
	System.out.println("BMW---->Automatic start without Key");
	}
	
	public void laneDeparture() {
		System.out.println("BMW---->lane Departure");
	}
	
/*	@Override
	public static  void stopCar() {
		System.out.println("BMW---->Stop  Car");
	}*/ // we can not override static methods in java so whenever we want to override method we have write only void 
	
	
	
	
}
