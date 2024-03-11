package Mnojestva;

import java.util.HashSet;
import java.util.Set;

public class SEchenie {

	public static void main(String[] args) {
		
		Set<String> It1 = new HashSet<String>();
		Set<String> It2 = new HashSet<String>();
		Set<String> Bel = new HashSet<String>();
		Set<String> Mat = new HashSet<String>();

		
It1.add("Pavel");
It1.add("Georgi");
It1.add("Iva");
It1.add("Atanas");
It1.add("Spas");
System.out.println("It grupa 1: "+ It1);
It2.add("Stoqn");
It2.add("Ivanina");
It2.add("Stanimir");
It2.add("Katq");
It2.add("SiYana");
System.out.println("It grupa 2: "+ It2);
Bel.add("Marieta");
Bel.add("Nikola");
Bel.add("Starnimir");
Bel.addAll(It1);

Mat.addAll(union(It1,It2));
System.out.println("Matematika(obedinenie na 2te grupi) : "+ union(It1,It2));
System.out.println("Literatura(sechenie na Mat i BE ): "+ intersect(Bel,Mat));

	}

	public static <String> Set<String> intersect(Set<String> set1,Set<String> set2 ) {
		Set<String> union=new HashSet<String>();
		//метод addALL() добавя всички е-ти от множеството 
		union.addAll(set1);
		union.retainAll(set2);
		return union;

		
	}

	public static <String> Set<String> union (Set<String> it1, Set<String> it2) {
		Set <String> uni = new HashSet<String>();
		uni.addAll(it1);
		uni.addAll(it2);
		return uni;
	}

}
