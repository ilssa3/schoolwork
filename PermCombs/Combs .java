package permcomb;

import java.util.Scanner;

public class Combs {
    static int permutation(int n) {
        int f=1;
        for(int i=1;i<=n;i++) {
            f*=i;
        }
        return f;
    }
    static int variation(int s,int k) {
        int v=1;
        for(int i=s-k+1;i<=s;i++) {
            v*=i;
        }
        return v;
    }
    public static void main(String[]args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Wywedete broj elmenti");
        int a=sc.nextInt();
        System.out.println("Wywedete klas na kombinaciqta");
        int b=sc.nextInt();
        int p=variation(a,b)/permutation(b);
        System.out.println("Result");
        System.out.println(p);
    }
}
