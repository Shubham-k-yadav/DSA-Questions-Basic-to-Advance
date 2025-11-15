import java.util.Scanner;

public class TheDiceProblem {
    static int usingIfElse(int n)
    {
        if(n==1)
        {
            return 6;
        }
        else if(n==2)
        {
            return 5;
        }
        else if(n==3)
        {
            return 4;
        }
        else if(n==4)
        {
            return 3;
        }
        else if(n==5)
        {
            return 2;
        }
        else if(n==6)
        {
            return 1;
        }
        else 
        {
            return -1;
        }
    }

    static int usingSumOfNumber(int n)
    {
        if(n>0&&n<7)
        {
            return 7-n;
        }
        else
        {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("Using if else ");
        System.out.println(usingIfElse(num));
        System.out.println("Using Sum of number ");
        System.out.println(usingSumOfNumber(num));
        sc.close();
    }
}
