package com.in28minutes.oops.level2;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Manufacturer1", 0.34567, "green");
		//fan.isOn(true);
		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed((byte) 3);
		System.out.println(fan); // without toString() method --> com.in28minutes.oops.level2.Fan@e580929
		fan.switchOff();			// it's printing the package name and the hashCode of it from memory
		System.out.println(fan);		// whenever I try to do a System.out.println(fan) as long as I have
	} 									// public String toString() method, this would be automatically called
										// and the output from the method is printed

}
