
public class Animal {
	
	int noOfLegs;
	String commonName;
	String color;
	int averageWeight;
	double averageHeight;
	
	public Animal(String commonName, int noOfLegs, double averageHeight, int averageWeight, String color) {
		this.commonName = commonName;
		this.noOfLegs = noOfLegs;
		this.averageHeight = averageHeight;
		this.averageWeight = averageWeight;
		this.color = color;
	}
	
	public void move() {
		System.out.println("I, " + commonName + " am moving from A to B.");
	}
	
	public void speak() {
		System.out.println("I, " + commonName + " am speaking in whatever my species is supposed to speak");
		System.out.println("I, " + commonName + " have " + noOfLegs + "legs.");
		System.out.println("I, " + commonName + " usually have an average height of " + averageHeight + " metres");
		System.out.println("I, " + commonName + " usually have an average weight of " + averageWeight + " kg.");
		System.out.println("I, " + commonName + " am " + color);
	}
}
