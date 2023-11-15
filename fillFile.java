package pruci;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class edinTretiKlas {

	public static void main(String[] args) throws FileNotFoundException {
		//read file
		
				File file = new File("C:\\Users\\XI_A\\Desktop\\proba.txt");

				//create scanner connected to file and spec encoding 
				
				Scanner fileReader = new Scanner (file);//the scanner reads the imported thingy : put in the parentheses -> (thingy)
				int lineNumber = 0;
				while (fileReader.hasNextLine()) {
					lineNumber ++;
					System.out.printf("Line %d :%s%n",lineNumber, fileReader.nextLine());
				}
				
				PrintStream fileWriter = new PrintStream("nikola.06.txt");
				for (int i = 0 ; i <=10 ; i++ ) {
					fileWriter.print(i);
					
				}
				for (int i = 0 ; i <=10 ; i++ ) {
					fileWriter.println(i);
				}
				
				for (char i = 'a' ; i <='z' ; i++ ) {
					fileWriter.print(i);
				}
				
				for (char i = 'a' ; i <='z' ; i++ ) {
					fileWriter.println(i);
				}
				
				fileWriter.println("Damqn ivan");
				
				fileReader.close();
			}

}
