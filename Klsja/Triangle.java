package Klsja;

public class Triangle extends Figure{
private Integer s ;
private Integer []sides;
public Triangle (Integer[]arr) {
	this.sides = arr;
}

public void printSides() {
	for(int i = 0 ; i<sides.length;i++) {
		s = (sides[0]*sides[1]/2);
	}
	System.out.println("s triug = "+ s);
}
}
