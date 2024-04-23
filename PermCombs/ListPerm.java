package permcomb;
import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
 
public class permutationwitList {
 
    static void printArrayList(ArrayList<String> combo) {
          combo.remove("");
          for (int i = 0; i < combo.size(); i++)
          System.out.print(combo.get(i)+"\t");
       }
       public static ArrayList<String> generatePermutation(String str) {
          if (str.length() == 0) {
             ArrayList<String> empty = new ArrayList<>();
             empty.add("");
             return empty;
          }
          char ch = str.charAt(0);
          System.out.println("ch="+ch);
          String subStr = str.substring(1);
          ArrayList<String> lastCombination = generatePermutation(subStr);
          System.out.println(generatePermutation(subStr));
         System.out.println(lastCombination);
       ArrayList<String> newCombination = new ArrayList<>();
     for (String val : lastCombination) {
     for (int i = 0; i <= val.length(); i++) {           newCombination.add(val.substring(0, i) + ch + val.substring(i));
             }
           }
          return newCombination;
        }
       public static void main(String[] args) {
          Scanner s=new Scanner(System.in);
          String str = s.nextLine();
          System.out.println("Permutations of string are :");
          printArrayList(generatePermutation(str));
       }
    }
