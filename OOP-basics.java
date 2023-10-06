package otUroka;

public class First {

	public int a, b;
	
public First (int a , int b) {
	this.a = a;
	this.b = b;
	
	
}

public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

public int getB() {
	return b;
}

public void setB(int b) {
	this.b = b;
}

public void Suma () {
	System.out.println("sumichka: "+(a+b));
}
//secnd
}
package otUroka;

public class Second extends First {

	public int c,d;

public Second(int a, int b, int c, int d ) {
	super(a,b);//inheritance na a i b ot parenting class First
	this.c = c;
	this.d = d;
	}

public void Multiplication() {
	System.out.println("multi : "+(a*b*c*d));
}

}

//main

package otUroka;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);	
		
		First f = new First(Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));//ot conzola
		Second s = new Second (Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
		
		System.out.println(f.getA()+" "+f.getB());//wzema stoinosti
		f.Suma();
		s.Multiplication();
		//promqqna na stoinost
		f.setA(10);f.setB(80);
		System.out.print("setNata suma : ");f.Suma();
	}

}
