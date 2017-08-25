
public class Bird extends Animal {
	
	public Bird(String commonName, int noOfLegs, double averageHeight, int averageWeight, String color) {
		super(commonName, noOfLegs, averageHeight, averageWeight, color);
	}
	
	public void fly() {
		System.out.println("I am a bird and I can fly!");
	}
}
