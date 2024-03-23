package RegExes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zad2 {

	public static void main(String[] args) {
		
/*2_Задача: Създаване на регулярен израз, който приема само буквено-цифрови знаци.
Дължината му трябва да бъде само шест знака.*/
		
		Scanner dudi = new Scanner(System.in);
		
		String fromConsolePath = "[\\w]{6}";
		
		System.out.println("Enter text: ");
		String fromConsoleText = dudi.nextLine();
		
		Pattern pate = Pattern.compile(fromConsolePath, Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pate.matcher(fromConsoleText);
	    boolean matchFound = matcher.find();
	    	    
	    if(matchFound==true) {
	    	System.out.println("Match found");
	        System.out.println("-----------");
	        do  {
		        System.out.println("Found: " + matcher.group());
	        }while (matcher.find());
	      }
	        else {
	        System.out.println("Match not found");
	      }
	}

}
