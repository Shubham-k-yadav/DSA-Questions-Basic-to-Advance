import java.util.Scanner;

public class FindClosestTonAndDivisibleBym {
    static int closestNumber(int n,int m)
    {
        int lower = (int)Math.floor((double)n/m)*m;
        int upper = (int)Math.ceil((double)n/m)*m;

        int distLower = Math.abs(n-lower);
        int distUpper = Math.abs(n-upper);

        if(distLower<distUpper)
        {
            return lower;
        }
        else if (distUpper<distLower) {
            return upper;
        }
        else
        {
            return Math.abs(lower)>=Math.abs(upper)?lower:upper;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(closestNumber(n, m));
        sc.close();
    }
    
}
