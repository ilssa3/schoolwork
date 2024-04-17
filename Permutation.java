import java.util.ArrayList;
import java.util.Scanner;

public class permuteaciiWritingList {
	static void  printArrayList(ArrayList<String> combo) {
		combo.remove("");
		for (int i=0;i<combo.size();i++) {
			System.out.println(combo.get(i));
		}
	}

public static ArrayList<String> generatePerm(String str){
	if( str.length()==0) {
		ArrayList<String> empty = new ArrayList<String>();
		empty.add("");
		return empty;
		}
	char ch = str.charAt(0);
	String subStr = str.substring(1);
	ArrayList<String> lastCombo = generatePerm(subStr);
	ArrayList<String> newCombo = new ArrayList<String>();
	for (String v: lastCombo) {
		for (int i = 0; i<=v.length();i++) {
			newCombo.add(v.substring(0,i)+ch+v.substring(i));
		}
	}
	return newCombo;
}
	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			String text = sc.nextLine();
			System.out.println("String permutation : ");
			printArrayList(generatePerm(text));
			
	}

}
