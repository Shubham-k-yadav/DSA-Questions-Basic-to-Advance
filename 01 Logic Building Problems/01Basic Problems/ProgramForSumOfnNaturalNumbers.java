import java.util.Scanner;
public class ProgramForSumOfnNaturalNumbers {
    static int usingSimpleMethod(int n)
    {
        
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum = i+sum;
        }
        return sum;
    }

    static int usingRecursiveFunction(int n)
    {
        
        if(n==1)
        {
            return 1;
        }

        return n+usingRecursiveFunction(n-1);
    }

    static int usingFormula(int n)
    {
        return n*(n+1)/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many number you want to sum");
        int num = sc.nextInt();
        System.out.println("Using Simple method");
        System.out.println(usingSimpleMethod(num));
        System.out.println("Using Recursive Method");
        System.out.println(usingRecursiveFunction(num));
        System.out.println("Using Formula");
        System.out.println(usingFormula(num));
        sc.close();
    }
}
