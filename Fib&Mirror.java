package Fib;

import java.util.Scanner;

public class Nachini {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//da se nameri n! za podadeno n - chrez iteraciq
		
		int n = sc.nextInt();	
		System.out.println("Factoriel : "+fact(n));
		System.out.println("Rekursiq : "+factRec(n));
		System.out.println("S vlojen for : "+fibIr(n));
		System.out.println("AccRec : "+AccRec(n));
		RecNaTochni( n ) ;
	}
	
	public static int fact(int n ) {
		int result = 1;
		for (int i = 1; i<=n ; i++) {
			result*=i; 
		}
		return result;
		
	}
												//chrez rekursiq
	public static int factRec(int n) {
		if (n<2) return 1;
		return n*factRec(n-1);
	}
	
											//fib resh chre iteraciq
	public static int fibIr(int n) {
		int arr []= new int [n+1];
		
		for (int i=2; i <= n ; i++) {
			arr[0]=1;arr[1]=1;
			arr[i] =arr[i-1]+arr[i-2];		
			}
		return arr[n-1];

	}
	
	public static int AccRec(int n ) {
		if (n<2) return 1;
		return AccRec(n-1)+AccRec(n-2);
	}
	
												//ogledalno
	public static void  RecNaTochni(int n ) {
		for (int i = 1 ; i<=n ; i++) {
			System.out.print(i+" "); 
		}//System.out.print(n);
		for (int i = n-1 ; i>0; i--) {
			System.out.print(" "+i); }
	}
	
}
