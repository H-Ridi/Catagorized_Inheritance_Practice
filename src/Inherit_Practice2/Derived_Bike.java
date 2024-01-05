package Inherit_Practice2;

//Multi level inheritance
public class Derived_Bike extends MountainBike {

	public Derived_Bike() {
		
	}
	
	public Derived_Bike(int gear,int speed,int startHeight) {
		super(gear,speed,startHeight);
	}
	
	public void childDeriveBike() {
		System.out.println("This is a derived class");
	}
}
