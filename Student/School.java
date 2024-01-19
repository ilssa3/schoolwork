package Student;

public class School {
protected String schoolName;
protected String Paralelka;
public School(String schoolName, String paralelka) {
	super();
	this.schoolName = schoolName;
	Paralelka = paralelka;
}
public String getSchoolName() {
	return schoolName;
}
public void setSchoolName(String schoolName) {
	this.schoolName = schoolName;
}
public String getParalelka() {
	return Paralelka;
}
public void setParalelka(String paralelka) {
	Paralelka = paralelka;
}
}
