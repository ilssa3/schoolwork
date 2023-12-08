package Lekar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	/*	Да се реализира абстрактен клас Patient, който съдържа информация за пациент: име, адрес и ЕГН. За този клас да се реализират функции за 
	 въвеждане и извеждане, както и подходящи конструктори. Дефинирайте абстрактен метод cure(). 
	Създайте производен клас SickPatient, който съдържа допълнителна информация за болен пациент: епикриза
	 (в нея се записва от каква болест е болен човека и какви лекарства е приемал), текущ статус (болен или здрав) и 
	 ден на заболяване от началото на годината (число от 1 до 366). Реализирайте метод cure, на който по подаден String “име на лекарство“ и 
	 подадено число (количество, т.е. доза) се добавя информация в края на епикризата, че лекарството е прието в съответната доза.
*/
	System.out.println("Wuwedete broi pacienti :");
	
	int n = Integer.parseInt(sc.nextLine());
	
	SickPatient [] arr = new SickPatient[n];
	for ( int i = 0 ; i < n ; i++)
	{
		arr[i] = new SickPatient (sc.nextLine(),sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(),Float.parseFloat(sc.nextLine()));
		
		}
	
	for ( int i = 0 ; i < n ; i++){
		System.out.println(arr[i].toString());
		arr[i].cure();
			}
		}
	}


