package pruci;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class bruHH {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	
		try{
			File createFile = new File ("C:\\Users\\XI_A\\Desktop\\kotka.txt");
			if (createFile.createNewFile())System.out.println("Created successfully");
			else System.out.println("Already exists!");
			
		}
		catch(IOException e) {
			System.out.println("Error occured");
			e.printStackTrace();
		}
		
		
		try{
			FileWriter fileWriter = new FileWriter("C:\\Users\\XI_A\\Desktop\\kotka.txt");
			for (int i =0; i<5;i++) {
			fileWriter.write("meow \n");}
			fileWriter.close();
			/*PrintStream fileWriter = new PrintStream("C:\\Users\\XI_A\\Desktop\\kotka.txt");
			for (int i = 0 ; i <=10 ; i++ ) {
				fileWriter.println("meow" +i);
				}
			fileWriter.close();*/
		}
		catch(IOException e) {
			System.out.println("Error occured");
			e.printStackTrace();
		}

		try{
			File createFile = new File ("C:\\Users\\XI_A\\Desktop\\kotka.txt");
			Scanner fileReader=new Scanner (createFile);
			int line = 0 ;
			while(fileReader.hasNextLine()) {
				line++;
				System.out.printf("%d: %s%n ",line, fileReader.nextLine());
				
				}fileReader.close();
			
		}
		catch(IOException e) {
			System.out.println("Error occured");
			e.printStackTrace();
		}
	}

}
