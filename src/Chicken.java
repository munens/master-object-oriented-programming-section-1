
public class Chicken extends Bird {

	public Chicken(String commonName, int noOfLegs, double averageHeight, int averageWeight, String color) {
		super(commonName, noOfLegs, averageHeight, averageWeight, color);
	}
	
	public void fly() {
		System.out.println("I am a chicken and I cannot fly");
	}
}
