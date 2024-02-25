package StekOpashkaList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class zad2 {

	
/*	Да се състави програма, чрез която се въвежда есествено число N от интервала [10..101].
Да е генерират N броя псевдослучайни естествени числа от интервала [10..10001].
Числата се въвеждат в опашка - по реда на въвеждането си.
Да се илюстрира основната разлика между опашка и стек - въведените числа в опашката се въвеждат в стек и се извеждат от него.
Пример: 5; 12, 18, 32, 7, 10
опашка 5; 12, 18, 32, 7, 10
стек 10, 7, 32, 18,12, 5
*/
		public static void main(String[] args) {
		Scanner p = new Scanner (System.in);
		
		 Queue<Integer> giros = new LinkedList<>();
		 Stack<Integer> duner = new Stack<Integer>(); 

		 System.out.println("How many num do u want in your queue/stack ? ");
		 int count = p.nextInt();
		 int num  ;
		 Random rand = new Random();
		 
		 if (count > 10&&count>101)System.out.println("pls insert a lower num ! ");
		 else {
			 for (int i = 0 ; i < count ; i++) {

				 num =rand.nextInt(10001);
				 giros.add(num);
				 }
			 duner.addAll(giros);
		 }
		 
		 
		 System.out.println("queue : "+giros);
		 System.out.println("stack : "+duner);
	}

}
