package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class MAin {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.println("Enter num of students : ");
int n = sc.nextInt();

ArrayList<Studs>stud=new ArrayList<Studs>();
	for (int i = 0 ; i<n ; i++) {
		System.out.println("School: ");
		String sch = sc.next();
		System.out.println("Paralelka: ");
		String par = sc.next();
		System.out.println("name: ");
		String name = sc.next();
		System.out.println("class: ");
		String klas = sc.next();
		System.out.println("Math grade : ");
		double mat  = Double.parseDouble(sc.next());
		System.out.println("History grade : ");
		double histori = Double.parseDouble(sc.next());
		System.out.println("Average grade : ");
		double avg  = Double.parseDouble(sc.next());
		System.out.println("Abc : ");
		double abs = Double.parseDouble(sc.next());
		stud.add(new Studs(sch,par,name,klas,mat,histori,avg,abs));
		
	}
	for(int i = 0;i<stud.size();i++) {
		System.out.println(stud.get(i));
	}
	System.out.println("С успех над 5: ");
	for(int i = 0;i<stud.size();i++) {
		if (stud.get(i).getAvGrade()>4.5){
			System.out.println(stud.get(i));
			
		}
		
	}
	
	}

}
