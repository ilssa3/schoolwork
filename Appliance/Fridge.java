package Appliance;

public class Fridge extends Apps{

	public Fridge( double wei, double le, double wid, double he) {
		super ("Refrigerator", wei, le, wid, he);
	}

	@Override
	String action() {
		// TODO Auto-generated method stub
		return "keeps food cool :p";
	}

	}


