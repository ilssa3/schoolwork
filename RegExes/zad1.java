package RegExes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zad1 {

	public static void main(String[] args) {
/*1_Задача: Да се състави програма която намира дали въведеният шаблон 
 	низ се съдържа във въведеният в конзолата текст.
   		Програмата извежда от кой индекс започва и завършва съвпадението на подаденият низ.*/
		
		Scanner dudi = new Scanner(System.in);
		
		System.out.println("Enter pattern : ");
		String fromConsolePath = dudi.nextLine();
		
		System.out.println("Enter text: ");
		String fromConsoleText = dudi.nextLine();
		
		Pattern pate = Pattern.compile(fromConsolePath, Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pate.matcher(fromConsoleText);
	    boolean matchFound = matcher.find();
	    	    
	    if(matchFound==true) {
	        System.out.println("Match found");
	        System.out.println("-----------");
	        do  {
		        System.out.println("Start index: " + matcher.start());
		        System.out.println("End index: " + matcher.end());
		        System.out.println("Found: " + matcher.group());
	        }while (matcher.find());
	      }
	        else {
	        System.out.println("Match not found");
	      }
	  
	    
	    
	}

}
