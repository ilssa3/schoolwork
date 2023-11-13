package Fib;

import java.util.Scanner;

public class Hanoiski_kuli {

    static void towerOfHanoi(int n, char from, char to, char help) {
    	if (n==1) {System.out.println("Move disk 1 from rod "+from+" to rod "+to);return;}
    	towerOfHanoi(n-1, from, help,  to);
    	 System.out.println("Move disk " + n + " from rod " +  from + " to rod " + to);
    	 towerOfHanoi(n-1,help, to, from);
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int n = sc.nextInt(); towerOfHanoi(n,'A','C','B');
	}

}
