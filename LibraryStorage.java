package Library;

import java.util.Scanner;

public class LibraryStorage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Book b = null;
		
		int num = Integer.parseInt(sc.nextLine());
		
		for (int i =0;i<num;i++) {
			System.out.println("Enter " +(i+1)+ "book's title, autor and pages : ");
			
			b= new Book (sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));

			System.out.println("a)");
			System.out.println("Book Title : "+b.getTitle().toString());
						
			System.out.println("b)");
			System.out.println("Autor : "+b.getAutor().toString()+" ; Book Title : "+b.getTitle().toString());
		
			System.out.println("c)");
			System.out.println("Autor : "+b.getAutor().toString()+" ; Book Title : "+b.getTitle().toString()+" ; Pages "+b.getPages());
			System.out.println("");
			
		}
	}

}
