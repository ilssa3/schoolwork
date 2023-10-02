package uchilishit;

public class Student {
	
	public String name;
	public String school;
	public String clas;
	public Double averageGrade;
	
	public Student(String name, String school, String clas, Double averageGrade) {

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

	public Double getAverageGrade() {
		return averageGrade;
	}

	public void setAverageGrade(Double averageGrade) {
		this.averageGrade = averageGrade;
	}
	
	public void print() {
		System.out.println("Ime na uchenika: "+this.getName());
		System.out.println("Uchilishte : "+this.school);
		System.out.println("Klas : "+this.clas);
		System.out.println("Sredna ocenka :"+this.averageGrade);
		System.out.println("--------------------");
	}
	
	
}
