import java.util.LinkedList;

public class Variacii {

	public static void main(String[] args) {
		LinkedList<String[]> items = new LinkedList<String[]>();
        String[] item = new String[4];
        int fi = 0;
        int sec =0;
        String f1 = String.valueOf(fi);
        String s2 = String.valueOf(sec);
        String[] input = {"AB",f1,"C",s2};
        rep(items, input, item, 0);


        for (String[] rep : items) {
            System.out.println(rep.toString());
        }
    }

    private static void rep(LinkedList<String[]> reps, String[] input, String[] item, int count){
        if (count < item.length){
            for (int i = 0; i < input.length; i++) {
                item[count] = input[i];
                rep(reps, input, item, count+1);
            }
        }else{
            reps.add(item.clone());
        }
    }

}