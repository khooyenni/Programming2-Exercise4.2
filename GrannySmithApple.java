package Exercise4_2;

public class GrannySmithApple extends Apple{
	
	String placeofOrigin, colour;
	
	public GrannySmithApple() {
		super();
		placeofOrigin=" ";
		colour=" ";
	} 
	
	GrannySmithApple(String n, int p, int q, String c, String place){
		super(n,p,q);
		colour = c;
		placeofOrigin = place;
	}
	
	public String getColour() {
		return colour;
	}
	
	public String getPlaceofOrigin() {
		return placeofOrigin;
	}
	
	public String toString() {
		return super.toString() + "\nColour\t\t: " + getColour() + "\nPlace of Origin\t: " + getPlaceofOrigin();
	}

}
