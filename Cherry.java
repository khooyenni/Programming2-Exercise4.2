package Exercise4_2;

public class Cherry extends Fruits{
	
	private int price;
	private double weight;
	private String nutrien;
	
	public Cherry() { //constructor without arguments
		super();
		weight = 0;
		price = 0;
		nutrien = " ";
	}
	
	public Cherry(String n, double w, int p, String nu) {//constructor with 4 arguments
		super(n);
		weight = w;
		price = p;
		nutrien = nu;
		
		setDetails(n,w,p,nu);

	}
	
	public void setDetails(String n, double w, int p, String nu) {
		if (w>=0)
			weight = w;
		else
			weight = 0;
		
		if (w>=0)
			price = p;
		else
			price = 0;
		
	}
	
	public int getPrice() {
		return price;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public String getNutrien() {
		return nutrien;
	}
	
	public double TotalPrice() {
		return weight * price;
	}
	
	public double TotalCalories() {
		return this.weight*500;
	}
	
	public String toString() {
		return super.toString()+ "\nPrice\t\t: RM" + price + "\nWeight(in kg)\t: " + weight + "\nNutrien\t\t: " + nutrien + "\nTotal price\t: RM" + TotalPrice() +"\nTotal calories\t: " + TotalCalories();
	}

}
