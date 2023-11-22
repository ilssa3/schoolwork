package Lol;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainStudent {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		Student[] arrS = new Student [n];
		
		for (int i = 0 ; i < n ; i++) {
			arrS[i] = new Student (sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), 
					Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
		}
		
		for (int i = 0 ; i < n ; i++) {
			String output = arrS[i].getName()+" "
					+arrS[i].getSurName()+" " + arrS[i].getGrade()+" "
					+arrS[i].getAverageGrade()+" "+arrS[i].getAbs()+" ";
			
			saveToFile("C:\\Users\\XI_A\\Desktop\\Plochki.txt", output , true);
		}
	}
	
	public static void saveToFile(String filename, String text, boolean save) {
		
		try {
			File f = new File (filename);
			FileWriter fw = new FileWriter(f,save);
			PrintWriter pw = new PrintWriter (fw);
			
			pw.close();
			fw.close();
			
		} catch (IOException e) {
			System.out.println("Error occured! ");
			e.printStackTrace();
		}
		
	}
}
