package RegExes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zad4 {

	public static void main(String[] args) {
/*4_Задача: Създайте регулярен израз който извършва валидиране(дали съществува според зададените правила) на e-mail.
 *  Проверката на имейл се изисква в почти всяко приложение, което има регистрация на потребител.
Имейл адресът е разделен на три основни части: локална част, символ @ и домейн. Например, ако „username@domain.com“ е имейл, тогава:
локална част = потребителско име
@ = @
домейн = domain.com

*/
Scanner dudi = new Scanner(System.in);
		
		String fromConsolePath = "[\\w]+@+domain.com";
		
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
