package Inheritance_Practice_Driver_Class;

import Inherit_Practice2.Derived_Bike;
import Inherit_Practice2.MountainBike;
import hiararchical_Inheritance.ChildClassOne;
import hiararchical_Inheritance.ChildClassTwo;
import multiple_Inheritance.ChildClassSecond;

public class Inherit_Driver_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Single Inheritances
//		MountainBike bike = new MountainBike(3,200,10);
//		System.out.println(bike.toString());
//		//override bike value
//		bike.setHeight(12);
//		System.out.println(bike.toString());
		
		
		//Multilevel Inheritances
//		Derived_Bike bike = new Derived_Bike();
//		bike.parentClass();
//		bike.MountainBikeInter();
//		bike.childDeriveBike();
		
		
		//Hierarchical Inheritances
//		ChildClassOne classone=new ChildClassOne();
//		classone.baseClassPrint();
//		classone.ClildClassOnePrint();
//		
//		ChildClassTwo classtwo=new ChildClassTwo();
//		classtwo.baseClassPrint();
//		classtwo.ChildClassTwoPrint();
		
		
		//Multiple Inheritances
		//java does not support this type of inheritance
		//Runtime confusion
		//Only can implement by "Interface->no method body,only method name,no variable,abstract one"
		ChildClassSecond classsecond=new ChildClassSecond()	;
		classsecond.getA();
		classsecond.getParentClassOne();
		
	}

}
