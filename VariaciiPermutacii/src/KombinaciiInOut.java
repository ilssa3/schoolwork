
	import java.awt.List;
	import java.util.ArrayList;
	import java.util.Scanner;

	public class KombinaciiInOut {

		public static void main(String[] args) throws Exception {
		/**	Scanner inp=new Scanner(System.in);
			
	        String a = inp.next();
	        
	        ArrayList<String> variacii=gvariacii(a);
	        for (String variacia : variacii) {
	            System.out.println(variacia);
	        }
	    }

	    public static ArrayList<String> gvariacii(String a) {
	        ArrayList<String> variacii = new ArrayList<>();
	      
	        for (int i = 1; i <= 3; i++) {
	            for (int j = 1; j <= 3; j++) {
	String variacia = a.replaceFirst("0", Integer.toString(i)).replaceFirst("0", Integer.toString(j));
	                variacii.add(variacia);
	            }
	        }
	        return variacii;**/

		        Scanner pp = new Scanner(System.in);
		        String line = pp.nextLine();
		        if (line.length() != 5) throw new Exception("Error in input");

		        ArrayList<String> variations = generateVariations(line);
		        for (String variation : variations) {
		            System.out.println(variation);
		        }
		    }

		    public static ArrayList<String> generateVariations(String line) throws Exception {
		        ArrayList<String> variations = new ArrayList<>();
		        int count = 0;
		        char[] chars = line.toCharArray();

		        for (char c : chars) {
		            if (c == '0') count++;
		        }

		        if (count != 2) throw new Exception("Error in inputs");

		        int[] numbers = {1, 2, 3};

		        for (int i : numbers) {
		            for (int j : numbers) {
		                String variation = line.replaceFirst("0", String.valueOf(i))
		                                       .replaceFirst("0", String.valueOf(j));
		                variations.add(variation);
		            }
		        }

		        return variations;
		    }
		}