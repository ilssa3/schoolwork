package Student;

public class Studs extends School {
protected String name;
protected int klas;
protected double mat;
protected double hist;
protected double avGrade;
protected double abs;

public Studs(String schoolName, String paralelka, String name, int klas, double mat, double hist, double avGrade,
		double abs) {
	super(schoolName, paralelka);
	this.name = name;
	this.klas = klas;
	this.mat = mat;
	this.hist = hist;
	this.avGrade = avGrade;
	this.abs = abs;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getKlas() {
	return klas;
}

public void setKlas(int klas) {
	this.klas = klas;
}

public double getMat() {
	return mat;
}

public void setMat(double mat) {
	this.mat = mat;
}

public double getHist() {
	return hist;
}

public void setHist(double hist) {
	this.hist = hist;
}

public double getAvGrade() {
	return avGrade;
}

public void setAvGrade(double avGrade) {
	this.avGrade = avGrade;
}

public double getAbs() {
	return abs;
}

public void setAbs(int abs) {
	this.abs = abs;
}

@Override
public String toString() {
	return "Studs [name=" + name + ", klas=" + klas + ", mat=" + mat + ", hist=" + hist + ", avGrade=" + avGrade
			+ ", abs=" + abs + "]";
}









}
