package Appliance;

import java.util.Arrays;
import java.util.Scanner;

public class Kitchen {
private Apps []app;
public Kitchen () {
	Scanner sc = new Scanner (System.in);
	int n , t ;
	double a ,b ,c ,d ;
	System.out.println("How many appliances: ");
	n = sc.nextInt();
	
	app = new Apps[n];
	for ( int i = 0 ; i < app.length ; i++) {
		System.out.println("Appliance #"+(i+1));
		System.out.println("Appliance type (1: dishwasher,2: refrigerator, 3:washing machine) : ");
		t = sc.nextInt();
		System.out.println("- weight : ");d = sc.nextDouble();
		System.out.println("- leng : ");c = sc.nextDouble();
		System.out.println("- width : ");b = sc.nextDouble();
		System.out.println("- height : ");a = sc.nextDouble();
		
		switch (t) {
		case 1 : app[i] = new DishWash(d,a,b,c);break;
		case 2 : app[i] = new Fridge(d,a,b,c);break;
		case 3 : app[i] = new WashMach(d,a,b,c);break;
		default : System.out.println("nema takuv appliance");
		}
		
	}
	
}
@Override
public String toString() {
	return "Kitchen [Appliance " + Arrays.toString(app) + "]";
}

}
