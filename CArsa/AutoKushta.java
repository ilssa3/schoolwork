package CArsa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class AutoKushta {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter num of cars : ");
		int n = Integer.parseInt(sc.nextLine());
		
		ArrayList<Cars>cars=new ArrayList<Cars>();
		for (int i = 0 ; i<n ; i++) {
			System.out.println("Car brand: ");
			String m = sc.nextLine();
			System.out.println("Car colour: ");
			String c = sc.nextLine();
			System.out.println("Car price / per day/: ");
			double cn= Double.parseDouble(sc.nextLine());
			System.out.println("Car num: ");
			String Num= sc.nextLine();
			String nomer = "";
			switch (Num.charAt(0)) {//1 – Франция, 2 – Италия, 3 – Австрия, 4 – Германия, 5 – Испания, 6 – Англия
			case '1': nomer=nomer + "France ,";break;
			case '2': nomer=nomer + "Italy ,";break;
			case '3': nomer=nomer + "Austria ,";break;
			case '4': nomer=nomer + "Germany ,";break;
			case '5': nomer=nomer + "Spain ,";break;
			case '6': nomer=nomer + "England ,";break;
			default : nomer = nomer + "Error!";break;
			}
			System.out.println("");
			switch (Num.charAt(1)) {//1 – малка, 2 – компактна, 3 – средна, 4 – ван, 5 – джип
			case '1': nomer=nomer + " small ,";
			case '2': nomer=nomer + " compact ,";break;
			case '3': nomer=nomer + "  mid ,";break;
			case '4': nomer=nomer + " van ,";break;
			case '5': nomer=nomer + " jeep ,";break;
			default : nomer = nomer + "Error!";break;
			
			}
			
			nomer +=Num.charAt(2)+""+Num.charAt(3)+"."+Num.charAt(4)+Num.charAt(5)+"."+Num.charAt(6)+Num.charAt(7);	
				cars.add(new Cars(m,c,cn,nomer))	;
		}
		
		System.out.println("✎ Registered cars :");
		for(int i = 0;i<cars.size();i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("");
		String type = sc.nextLine();
		System.out.println("Enter to delete all cars except "+ type +" : ");
	
	for(int i = 0;i<cars.size();i++) {
		if (cars.get(i).getMarka().equals(type)) {
			System.out.println(cars.get(i));
		}else System.out.println("𝒅𝒆𝒍𝒆𝒕𝒆𝒅 𝒓𝒐𝒘\r\n"
				+ "");
		
	}
	

	}

}
