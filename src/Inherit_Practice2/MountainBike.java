package Inherit_Practice2;

public class MountainBike extends Bicycle {

	public MountainBike() {
		
	}
	
	public int seatHeight;
	
	public MountainBike(int gear, int speed, int startHeight) {
		super(gear,speed);
		
		seatHeight=startHeight;
	}
	
	public void setHeight(int newValue) {
		seatHeight=newValue;
	}

	public void MountainBikeInter() {
		System.out.println("This is intermediatary Class");
	}
	
	@Override
	public String toString() {
		return "MountainBike [seatHeight=" + seatHeight + "and \n" + super.toString();
	}
	
	
}
