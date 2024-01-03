package bookShop;

import java.util.Scanner;

public class Bookshop {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	Book b = new Book(null, 0, 0, 0, null, null, null);
	b.printInfo();
System.out.println("-----");
	Atlass a = new Atlass(null, 0, 0, 0, null, null, null, null, 0);
	a.printInfo();
System.out.println("-----");	
	Journal j = new Journal(null, 0, 0, 0, null, null, 0, null);
	j.printInfo();
System.out.println("-----");
	
	}

}

