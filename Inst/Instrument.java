package Inst;

abstract public class Instrument {
private String name;
private String kind;
private double lowest;
private double highest;
public Instrument(String name, String kind, double lowest, double highest) {

	this.name = name;
	this.kind = kind;
	this.lowest = lowest;
	this.highest = highest;
}
public String getName() {
	return name;
}
public String getKind() {
	return kind;
}
public double getLowest() {
	return lowest;
}

public double getHighest() {
	return highest;
}

@Override
public String toString() {
	return "Instrument [Name=" + name + ", Kind=" + kind + ", lowest=" + lowest + ", highest=" + highest + "]";
}




}
