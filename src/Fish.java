
public class Fish extends Animal {
	
	public Fish(String commonName, int noOfLegs, double averageHeight, int averageWeight, String color) {
		super(commonName, noOfLegs, averageHeight, averageWeight, color);
	}
	
	public void swim() {
		System.out.println("I am swimming ...!");
	}
}
