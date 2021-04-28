package Exercise4_2;

public class Main {

	public static void main(String[] args) {
		
		Apple obj1 = new Apple("Apple", 3, 2);
		System.out.println("*****APPLE******");
		System.out.println(obj1);
		
		Lychee obj2 = new Lychee("Lychee", 1.3, 20, "Magnesium, copper, iron, vitamin C, manganese and folate");
		System.out.println("\n*****BANANA*****");
		System.out.println(obj2);
		
		Cherry obj3 = new Cherry("Cherry", 0.5, 30, "Vitamin C, A, K, potassium, magnesium, and calcium");
		System.out.println("\n*****Cherry*****");
		System.out.println(obj3);
		
		GrannySmithApple obj4 = new GrannySmithApple("Granny Smith Apple", 4, 3, "Green", "Australia");
		System.out.println("\n*****Granny Smith Apple*****");
		System.out.println(obj4);
		
		FujiApple obj5 = new FujiApple("Fuji Apple", 8, 2, "Red", "China");
		System.out.println("\n*****Fuji Apple*****");
		System.out.println(obj5);
		
	}
	

}
