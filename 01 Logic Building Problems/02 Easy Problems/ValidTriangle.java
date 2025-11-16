import java.util.Scanner;

public class ValidTriangle {
    static boolean isValid(double a,double b,double c)
    {
        if(((a+b)>c)&&((a+c)>b)&&((b+c)>a))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first side of triangel ");
        double a = sc.nextDouble();
        System.out.println("Enter the Second side of triangel ");
        double b = sc.nextDouble();
        System.out.println("Enter the Third side of triangel ");
        double c = sc.nextDouble();

        System.out.println("Is avalid triangle = "+isValid(a, b, c));

        sc.close();
    }

}
