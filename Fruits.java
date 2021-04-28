package Exercise4_2;

public class Fruits {
	
	private String name;
	
	public Fruits() { 
		name=" ";
	}
	
	public Fruits(String n) {
		name = n;
		setDetails(n);
	}
	
	public void setDetails(String name) {
		name=" ";
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name + " constructor is invoked" + "\nFruits\t\t: " + getName();
	}
	
}
