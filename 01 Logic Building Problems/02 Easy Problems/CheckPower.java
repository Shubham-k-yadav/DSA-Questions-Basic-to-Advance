import java.util.Scanner;

public class CheckPower {
    static boolean ispower(int x,long y)
    {
        if(x==1)
        {
            return (y==1);
        }

        long pow = 1;
        while (pow<y) {
            pow = pow*x;
        }
        return (pow==y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(ispower(x, y));

        sc.close();
    }
}
