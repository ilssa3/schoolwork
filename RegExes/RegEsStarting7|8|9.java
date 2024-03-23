package RegExes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zad3 {

	public static void main(String[] args) {
/*3_Задача:  Създайте регулярен израз, който приема 10-цифрени цифрови знаци
  започва само със 7, 8 или 9
*/
Scanner dudi = new Scanner(System.in);
		
		String fromConsolePath = "^[7|8|9]{1}+[\\d]{9}";
		
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
