package uchilishit;

public class Student {
	
	public String name;
	public String school;
	public String clas;
	public String averageGrade;
	
	public Student(String name, String school, String clas, String averageGrade) {

		this.name = name;
		this.school = school;
		this.clas = clas;
		this.averageGrade = averageGrade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public String getAverageGrade() {
		return averageGrade;
	}

	public void setAverageGrade(String averageGrade) {
		this.averageGrade = averageGrade;
	}
	
}
