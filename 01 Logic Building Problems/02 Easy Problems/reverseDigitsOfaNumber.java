import java.util.Scanner;

public class reverseDigitsOfaNumber {
    static int reverseDigits(int n)
    {
        int reverse = 0;

        while (n!=0) {
            reverse = reverse*10+(n%10);
            n = n/10;
        }
        return reverse;
    }
    static int UsingRecursion(int n,int result)
    {
        if(n==0)
        {
            return result;
        }

        return UsingRecursion(n/10,result*10+(n%10));
    }

    static int UsingStringConversion(int n)
    {
        StringBuffer s = new StringBuffer(String.valueOf(n));
        s.reverse();
        n = Integer.parseInt(s.toString());
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("Using Normal Method "+reverseDigits(num));
        System.out.println("Using Recursion " +UsingRecursion(num,0));
        System.out.println("Usig String Conversion "+ UsingStringConversion(num));
        sc.close();
    }
}
