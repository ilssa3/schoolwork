package Appliance;

public class DishWash extends Apps{

	public DishWash( double wei, double le, double wid, double he) {
		super ("Dishwasher", wei, le, wid, he);
	}

	@Override
	String action() {
		// TODO Auto-generated method stub
		return "washes your dishes :p";
	}

	}
