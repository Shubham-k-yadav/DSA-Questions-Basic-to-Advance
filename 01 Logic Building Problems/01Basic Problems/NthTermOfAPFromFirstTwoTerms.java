import java.util.Scanner;

public class NthTermOfAPFromFirstTwoTerms {
    static int usingLoop(int a, int b, int n) {
        if (a < b) {
            int nthterm = a;
            int diff = b - a;
            for (int i = 1; i < n; i++) {
                nthterm = nthterm + diff;
            }
            return nthterm;
        } else {
            int nthterm = a;
            int diff = a - b;
            for (int i = 1; i < n; i++) {
                nthterm = nthterm - diff;
            }
            return nthterm;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first term ");
        int a = sc.nextInt();
        System.out.println("Enter Second term ");
        int b = sc.nextInt();
        System.out.println("Enter which place of number you want");
        int n = sc.nextInt();
        System.out.println(usingLoop(a, b, n));
        sc.close();
    }
}
