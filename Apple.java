package Exercise4_2;

public class Apple extends Fruits{
	
	private int quantity, price;
	
	public Apple() {//constructor without arguments
		super();
		quantity = 0;
		price = 0;
		
	}
	
	public Apple(String n, int q, int p) {//constructor with 3 arguments
		super(n);
		this.quantity = q;
		this.price = p;
		
		setDetails(n,q,p);
		
	}
	
	public void setDetails(String n, int q, int p) {
		if (q>=0)
			quantity=q;
		else
			quantity=0;
		
		if (p>=0)
			price=p;
		else
			price=0;
		
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public int TotalPrice() {
		return quantity * price;
	}
	
	public String toString() {
		return super.toString()+ "\nPrice\t\t: RM" + price + "\nQuantity\t: " + quantity+ "\nTotal price\t: RM" + TotalPrice();
	}

}
