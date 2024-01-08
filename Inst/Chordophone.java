package Inst;

public class Chordophone extends Instrument{

	public Chordophone(String name, String kind, double lowest, double highest) {
		super(name, null, lowest, highest);
		
	}

	@Override
	public String toString() {
		return "Chordophone []";
	}

}
