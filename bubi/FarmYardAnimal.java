package bubi;

public abstract class FarmYardAnimal {
protected int posX;
protected int posY;

	public void move (int newX,int newY) {
		posX=newX;
		posY=newY;
		
	}
	public abstract void MakeNoise();
}
