package BankAcc;
import java.util.Scanner;
public class MainAccount {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int f ;
		double trans ;
		
		account [] Acc = new account [1];
		
		for (int i  = 0 ; i < 1 ; i++){
			
		Acc[i] = new account (sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
		
		if (Acc[i].name.length()<=23&&Acc[i].num.length()==15){
			System.out.println("Enter service num : ");
			System.out.println("Click 1 : Card holder and bank acc.number ->");
			System.out.println("Click 2 : Account balance -> " );
			System.out.println("Click 3 : (+)Transaction and new balance ->");
			System.out.println("Click 4 : (-)Transaction and new balance ->");
			System.out.println("Click 5 : Exit ->");
			
			for (int j = 0 ; j<99999999;j++){
				
			f=Integer.parseInt(sc.nextLine());
			System.out.print(" ");
			
			switch (f) {
			case 1:  System.out.println(Acc[i].toString1());break;
			case 2 : System.out.println(Acc[i].toString2());break;
			case 3 : { trans = Double.parseDouble(sc.nextLine());
			Acc[i].suma = Acc[i].suma +trans ;
			System.out.println(Acc[i].toString3());}break;
			case 4: { trans = Double.parseDouble(sc.nextLine());
			Acc[i].suma = Acc[i].suma -trans ;
			System.out.println(Acc[i].toString4());}break;
			case 5 : System.exit(0);break;
			default: System.out.println("Error!");
				}
		}	
}	
		else System.out.println("Error!");
		}
	}
}
