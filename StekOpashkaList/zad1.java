package StekOpashkaList;

import java.util.Scanner;

import java.util.LinkedList;
import java.util.Queue;

public class zad1 {
	
	/*Да се състави програма, чрез която се въвеждат N броя естествени числа от интервала [1..101].
Броят на въведените числа не се знае предварително - определя се от потребителя.
Чрез използване на структура от тип опашка да се изведе въведената редица естествени числа като:
а) първо се извеждат всички нечетни числа;
б) след тях се извеждат всички четни числа;
в) извеждането на числата съответства на реда на въвеждането им.
Пример: 11, 12, 15, 17, 19, 21, 23, 9, 10, 16, 18, 20
Изход: 11, 15, 17, 19, 21, 23, 9, 12, 10, 16, 18, 20
*/

	public static void main(String[] args) {
		Scanner p = new Scanner (System.in);
		
		 Queue<Integer> giros = new LinkedList<>();
		 System.out.println("How many num do u want in your queue? ");
		 int count = p.nextInt();
		 int num ;
		 
		 Queue<Integer> odds = new LinkedList<>();//nechetni
		 Queue<Integer> even = new LinkedList<>();//chetni
		 
		 if (count>101)System.out.println("pls insert a lower num ! ");
		 else {
			 for (int i = 0 ; i < count ; i++) {
				 System.out.println("insert num : ");
				 num = p.nextInt();
				 if (num%2==0) {even.add(num);}
				 else odds.add(num);
				 
			 }
		 }
		 giros.addAll(odds);
		 giros.addAll(even);
		 
		System.out.println(giros);
	}

}
