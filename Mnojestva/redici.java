package Mnojestva;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class redici {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		Set<Integer> f1 = new HashSet<Integer>();
		Set<Integer> f2 = new HashSet<Integer>();
		Set<Integer> f3 = new HashSet<Integer>();
		
		System.out.println("Enter num of elements : ");
				int n = sc.nextInt();
				
		int p1 = 1 ;f1.add(p1);
		//f1
		for (int i = 0 ; i < n-1 ; i++) {
			p1 = 2*p1 + 3;
				f1.add(p1);
		}
		
System.out.println("f1| = "+f1);
		//f2
		int p2 = 2;f2.add(p2);
		for (int i = 0 ; i < n-1 ; i++) {
			p2 = 3*p2 + 1;
				f2.add(p2);
		}
System.out.println("f2| = "+f2);
	int p3 = 2;f3.add(p3);
	for (int i = 0 ; i < n-1 ; i++) {
		p3 = 2*p3 - 1;
			f3.add(p3);
}
System.out.println("f3| = "+f3);
System.out.println("  | ");

//f1 * f2; f1 * f3; f2 * f3; f1 * f2 * f3
//f1 + f2; f1 + f3; f2 + f3; f1 + f2 + f3
//+ и * означаваме съответно обединение и сечение 
System.out.println("  | f1 * f2 = " + union(f1,f2));
System.out.println("  | f1 * f3 = " + union(f2,f3));
System.out.println("  | f2 * f3 = " + union(f3,f2));
System.out.println("  | f1 * f2 * f3 = " + union(f1,union(f2,f3)));
System.out.println("  | ");
System.out.println("  | f1 + f2 = " + intersect(f1,f2));
System.out.println("  | f1 * f3 = " + intersect(f1,f3));
System.out.println("  | f2 + f3 = " + intersect(f3,f2));
System.out.println("  | f1 + f2 + f3 = " + intersect(f1,intersect(f2,f3)));


	}
	public static <String> Set<String> intersect(Set<String> set1,Set<String> set2 ) {
		Set<String> intersect=new HashSet<String>();
		intersect.addAll(set1);
		intersect.retainAll(set2);
		return intersect;	
	}

	public static <String> Set<String> union (Set<String> set1, Set<String> set2) {
		Set <String> uni = new HashSet<String>();
		uni.addAll(set1);
		uni.addAll(set2);
		return uni;
	}

}
