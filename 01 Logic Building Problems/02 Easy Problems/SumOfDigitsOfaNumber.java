import java.util.Scanner;

class SumOfDigitsOfaNumber {
    static int SumOfDigits(int n) {
        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    static int UsingRecursion(int n)
    {
        if(n==0)
        {
            return 0;
        }

        return (n%10) +UsingRecursion(n/10);
    }

    static int UsingStringConversion(int n)
    {
        String s = Integer.toString(n);
        int sum = 0;

        for(char ch : s.toCharArray())
        {
            sum  = sum+ch-'0';
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println("Sum of digits is = " + SumOfDigits(num));
        System.out.println("Sum of digits is (Recursion) = " + UsingRecursion(num));
        System.out.println("Sum of digits is (String Conversion) = " + UsingStringConversion(num));
        sc.close();
    }
}
