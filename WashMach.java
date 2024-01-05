package Appliance;

public class WashMach extends Apps{

	public WashMach( double wei, double le, double wid, double he) {
		super ("Washing Machine", wei, le, wid, he);
	}

	@Override
	String action() {
		// TODO Auto-generated method stub
		return "washes your clothes :p";
	}

	}
