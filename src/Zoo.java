
public class Zoo {
	
	public static void main(String args[]) {
		
		Animal a1 = new Animal("dog", 4, 1, 50, "black");
		Animal a2 = new Animal("lion", 4, 1.5, 180, "beige");
		Animal a3 = new Animal("monkey", 2, 0.8, 50, "black and white");
		
		a1.move();
		a2.speak();
		a3.speak();
		
		a1.fly();
		
		Bird b1 = new Bird("eagle", 2, 0.8, 40, "Gold");
		b1.fly();
		b1.move();
		b1.speak();
		
		Fish f1 = new Fish("Shark", 0, 0.6, 80, "Gray");
		f1.swim();
		f1.move();
		f1.speak();
	}	
}
