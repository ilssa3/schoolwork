package Klsja;

public class Circle extends Figure {
	private Double r;
	private Double s;
	public Circle (Double rad) {
		this.r = rad;
	}
public void printSides() {
	
	s = Math.PI*this.r*this.r;
	
	System.out.println("s circle = "+s);
}


}
