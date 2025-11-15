import java.util.Scanner;

public class SwapTwoNumbers {
    static void usingThirdVariable(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a + " b = " + b);
    }

    static void usingTwoVariable(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number ");
        int b = sc.nextInt();
        System.out.println("Using third Variable ");
        usingThirdVariable(a, b);
        System.out.println("Using two Variable ");
        usingTwoVariable(a, b);
        sc.close();
    }
}
