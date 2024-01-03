package Klsja;

public class Figure {
	static void printSides(Figure fig)
	{
		if (fig instanceof Triangle ) {
			((Triangle )fig).printSides();
		}
		else if (fig instanceof Circle ) {
			((Circle )fig).printSides();
		}
	}
}
