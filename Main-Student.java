package uchilishit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Student g=null;
		int broi = Integer.parseInt(sc.nextLine());
		
	/*	for (int i =0;i<broi;i++) {
			System.out.println(" ");
		 g = new Student (sc.nextLine(),sc.nextLine(), sc.nextLine(),Double.parseDouble( sc.nextLine()));
		
			g.print();
		}
		*/
		//ili s maasiv
		Student [] stud= new Student[broi];
		for (int i =0;i<broi;i++) {
			stud[i]=new Student (sc.nextLine(),sc.nextLine(), sc.nextLine(),Double.parseDouble(
					sc.nextLine()));
				}
		for (int i =0;i<broi;i++) {	
		stud[i].print();
		}
	}
}

