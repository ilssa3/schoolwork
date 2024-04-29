import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class EgnName {

	public static void main(String[] args) {

		HashMap<String,String>data = new HashMap<>();
		data.put("0646257569","Nikola Kirilov - Marmalada");
		data.put("0343568521", "Sisi Krusteva ");
		data.put("0641277546", "Vulcho Glushkov");
		System.out.println(data);
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter month : ");
		int month  = sc.nextInt();
		System.out.println("Born in "+month + " : ");
		
		for (String egn : data.keySet())	{
		int birthMonth =Integer.parseInt (egn.substring(2,4));
			if ((birthMonth-40)==month)System.out.println(data.get(egn));
		}
	}

}
