package permcomb;

import java.util.Arrays;
import java.util.Scanner;

public class VariaciiPermutacii {

	 public void permutation(String s) {
		 //inputvam s za da go convertna v charArray
	        char[] original = s.toCharArray();
	        Arrays.sort(original);
	        //sortiram i inicializiram v dva masiva
	        //clone - store-va permutaciqta koqto e genrirana v momenta
	        //mark - markira char izpolzvani veche v perm
	        char[] clone = new char[s.length()];
	        boolean[] mark = new boolean[s.length()];
	        Arrays.fill(mark, false);
	        permute(original, clone, mark, 0, s.length());
	    }

	    private void permute(char[] original, char[] clone, boolean[] mark, int length, int n) {
	    	//rekursivniq metod generirasht permutaciqta
	    	//original - char array za originalniq string
	    	//clone - char array za segashen generiran string
	    	//mark - za izpolzvani veche char
	    	//length - za duljinata na vmomentashnata permutaciq
	    	//n - krainata duljina na string-a
	        if (length == n) {
	        	//proverqva dali generirashtiq se string e s duljinata na finalniq
	        	//ako e true => che e zavurshen; printira permutaciqta 
	            System.out.println(clone);
	            return;
	        }
//inache s bool mark - markira char koito obhojda za izpolzvan 
	        
	        for (int i = 0; i < n; i++) {
	            if (mark[i] == true) continue;
	           //dobavq go v permutaciqta i generira rekursivno ot ostanalite char 
		       //ostanalite vuzmojnosti
	            if (i > 0 && original[i] == original[i-1] && mark[i-1] == false) continue;
	            mark[i] = true;
	            clone[length] = original[i];
	            permute(original, clone, mark, length+1, n);//recursivno 
	            mark[i] = false;
	        }

	    }

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner (System.in);
	        VariaciiPermutacii p = new VariaciiPermutacii();
	        String TakenFromConsole = sc.nextLine();
	        p.permutation(TakenFromConsole );
	    }
	}
