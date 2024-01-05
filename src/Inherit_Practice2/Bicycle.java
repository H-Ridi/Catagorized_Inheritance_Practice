package Inherit_Practice2;

public class Bicycle {

	public Bicycle() {
		
	}
	
	public int gear;
	public int speed;
	
	public Bicycle(int gear, int speed) {
		super();
		this.gear = gear;
		this.speed = speed;
	}
	
	public void applyBrake(int decrement) {
		speed = decrement;
	}
	
	public void speedup(int increment) {
		speed+=increment;
	}

	public void parentClass() {
		System.out.println("This is a parent class");
	}
	
	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}

	
	
	
}
