package uchilishit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Student g = new Student (sc.nextLine(),sc.nextLine(), sc.nextLine(), sc.nextLine());
		
			System.out.println("Ime na uchenika: "+g.getName());
			System.out.println("Uchilishte : "+g.school);
			System.out.println("Klas : "+g.clas);
			System.out.println("Sredna ocenka :"+g.averageGrade);
	}

}
