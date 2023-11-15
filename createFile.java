package pruci;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class edinDrugKlas {

	public static void main(String[] args) throws IOException {
		
		//create file nikola06.txt
		
		File sJp = new File("nikola.06.txt");

		//create if statement to show the condition of the newly created file
		
		if (sJp.createNewFile())System.out.println("Created succsefully!");
			else System.out.println("Already exists!");
		
		//creating scanner to create the file
		
		Scanner createFile= new Scanner (sJp);
		
		createFile.close();
			}

}
