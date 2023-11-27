package bbububububu;

package bbububububu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import Lol.Student;

public class School {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		
		final String fileName = "data1.txt";
		final String fileName1 = "verywell.txt";
		final String fileName2 = "sorted.txt";
		
		
		/*3
		Az
		fgd
		6
		6
		6
		6
		6
		3
		Ti
		KHUJHk
		11
		5
		6
		5
		4
		5
		KJsaj
		sa
		5
		4
		3
		2
		5
		4*/
	System.out.println("n = ");int n = Integer.parseInt(sc.nextLine());
	
	Stud [] arS = new Stud[n];
	
	for (int i = 0 ; i < n ; i++) {
		arS[i] = new Stud(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), 
				Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()),
				Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
		
	}
	//b)
	toFile(fileName,arS);
	//v)
	veryWell(fileName1,arS);
	//g)
	
	}
	public static void toFile(String filename, Stud []arS) {
		try {
			FileWriter fw = new FileWriter(filename);
			PrintWriter pw = new PrintWriter (fw);
			String ramka;ramka ="----------------------------------------"+"\n";
			System.out.println("────────────────────────────────── ⋆⋅☆⋅⋆ ───────────────────────────────────");
			System.out.printf(" %s %s %s %s %s %s %s %s","name |","surName :","grade :","averageGrade :",
					"bel :","mat :","inf : ","abs :"+"\n");
			System.out.println("────────────────────────────────── ⋆⋅☆⋅⋆ ───────────────────────────────────");

			for (int i = 0 ; i < arS.length; i++) {
				String text = arS[i].getName()+" | "+arS[i].getSurName()+" | "+arS[i].getGrade()+" | "+arS[i].getAverageGrade()
						+" | "+arS[i].getBel()+" | "+arS[i].getMat()+" | "+arS[i].getInf();
System.out.println();
fw.write(ramka);
fw.write(text);
pw.println();
			}pw.close();
			fw.close();
		}
		
		catch(IOException e ) {
			System.out.println("error!");
			e.printStackTrace();
		}
	}

	public static void veryWell(String filename, Stud []arS) {
		try {
			FileWriter fw = new FileWriter(filename);
			PrintWriter pw = new PrintWriter (fw);
			String ramka;ramka ="─────────────── ⋆⋅☆⋅⋆ ─────────────────"+"\n";
			System.out.println("────────────────────────────────── ⋆⋅☆⋅⋆ ───────────────────────────────────");
			System.out.printf(" %s %s %s %s %s %s %s %s","name |","surName :","grade :","averageGrade :",
					"bel :","mat :","inf : ","abs :"+"\n");
			System.out.println("────────────────────────────────── ⋆⋅☆⋅⋆ ───────────────────────────────────");

			for (int i = 0 ; i < arS.length; i++) {
				if(arS[i].getAverageGrade()>=5)
				{
				String text = arS[i].getName()+" | "+arS[i].getSurName()+" | "+arS[i].getGrade()+" | "+arS[i].getAverageGrade()
						+" | "+arS[i].getBel()+" | "+arS[i].getMat()+" | "+arS[i].getInf();
System.out.println();
fw.write(ramka);
fw.write(text);
pw.println();
			}}
			pw.close();
			fw.close();
		}
		
		catch(IOException e ) {
			System.out.println("error!");
			e.printStackTrace();
		}
	}
	
	 public static void sortArr(String filename, Stud []arS)
	    {
		 for (int i = 0 ; i < arS.length; i++) {
				String text = arS[i].getName()+" | "+arS[i].getSurName()+" | "+arS[i].getGrade()+" | "+arS[i].getAverageGrade()
						+" | "+arS[i].getBel()+" | "+arS[i].getMat()+" | "+arS[i].getInf();}
		         }
	 
	
	
}
