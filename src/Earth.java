
public class Earth {
	
	public static void main(String ags[]) {
		
		// syntax for creating a new human:
		Human tom;
		tom = new Human();
		
		// assign 'tom' some characteristics:
		tom.name = "Kamau";
		tom.age = 25;
		tom.eyeColor = "red";
		tom.heightInInches = 100;
		
		// let us make 'tom' speak:
		tom.speak();
		
		// create a new Human, 'joe'
		Human joe = new Human();
		
		joe.name = "Jehovah";
		joe.age = 27;
		joe.eyeColor = "brown";
		joe.heightInInches = 245;
		
		// make 'joe' speak:
		joe.speak();
		
	}
	
}
