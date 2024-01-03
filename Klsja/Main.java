package Klsja;

public class Main {

	public static void main(String[] args) {
		Integer [ ] arr = {10,2,3};
		Figure triangle = new Triangle (arr);
		Figure krugche = new Circle(1.0);
		Figure.printSides(triangle);
		Figure.printSides(krugche);

	}

}
