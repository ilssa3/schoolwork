package maps;

import java.util.HashMap;
import java.util.Scanner;

public class zad {
	/*Дадена е таблица, съдържаща кодове на стоки и цени.
Увеличете стойностите на стоките с четни ключове с 1.
Отпечатайте старият и актуализираният списък.*/


	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
		HashMap<Integer,Integer> codes =new HashMap<>();
		System.out.println("Enter amount of stocks : ");
		int n = sc.nextInt();
		
		for (int i = 0 ; i < n ; i++) {
			System.out.println("Enter price for stock No "+(i+1)+" :");
			int cena = sc.nextInt();
			codes.put(i,cena);
		}
		System.out.println("|");
		System.out.println("Codes : "+codes);
		
		HashMap<Integer,Integer> banan =new HashMap<>();
		
		int neW=0;
		
			
		for(Integer ke3y:codes.keySet()) {		
			
			if (ke3y%2==0) { neW = codes.get(ke3y)+ 1;}
				else neW = codes.get(ke3y);
			banan.put(ke3y,neW);
		}
		System.out.println("|");
		System.out.println("Altered prices : "+banan);
	}
}
/*Въведете брой на записите : 
8
Цена за запис 1 :
21
Цена за запис 2 :
369
Цена за запис 3 :
576
Цена за запис 4 :
19
Цена за запис 5 :
12
Цена за запис 6 :
18
Цена за запис 7 :
76
Цена за запис 8 :
69 */

