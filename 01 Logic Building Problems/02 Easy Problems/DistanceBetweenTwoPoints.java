import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    static double distance(double x1,double x2,double y1,double y2)
    {
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x side ");
        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        System.out.println("Enter y side ");
        double y1 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.println("Distance = " + distance(x1, x2, y1, y2));
        sc.close();
    }
}
