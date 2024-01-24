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
		int klas = Integer.parseInt(sc.next());
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
	System.out.println("bubble sort : ");
	for(int i = 0;i<stud.size();i++) {
		for (int k = 1;k<stud.size()-2;k++) {
			if (stud.get(k-1).getKlas()>stud.get(k).getKlas()) {
					Studs swap = stud.get(k-1);
					stud.set(k-1, stud.get(k));
					stud.set(k, swap);
		
			}
		}
	}for(int i = 0;i<stud.size();i++) {
		System.out.println(stud.get(i));
	}
	}

}
