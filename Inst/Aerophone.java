package Inst;

public class Aerophone extends Instrument {
	
	protected String subKind = "aerophone";
	public Aerophone(String nm, String k, double low, double high, String subKind) {
		super(nm , null, low, high);
		this.subKind = "aerophone";
	
	}
	@Override
	public String toString() {
		return "Aerophone [subKind=" + subKind + "]";
	}
	

}
