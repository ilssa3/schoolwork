import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VAriaciiOtDsk {
	
	public static List<Integer> findPos(String input){
		List<Integer> findPos = new ArrayList<Integer>();
		int lastPos = -1;
		while ((lastPos = input.indexOf('0',lastPos+1))!=-1) {
			findPos.add(lastPos);
		}
		return findPos;
	
	}
	
	public static List<String> permPos (List <String> partialPerm , int pos){
	List<String> result = new ArrayList<>();
	char[]replacement = {'1','2','3'};
	for (int i = 0 ; i < replacement.length ; i++)
	{
		String output = replaceCharAt(pos,replacement[i]);
		result .add(output);
	}
	return result;
	}
	
	private static String replaceCharAt(int pos, char c) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter 5 ch. lenght String :");
		String input = sc.next();
		
		//find the position of the 0
		
	/*	for (int i = 0 ; i <= input.length() ;  i++ ) {
			if (input.valueOf(i).equals("0")) {
				
			}
		}*/
		
	}

}
