import java.util.Scanner ;
import java.lang.Math;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st side of Triangle    : ");
        int s1 = input.nextInt();
        System.out.println("Enter 2nd side of Triangle    : ");
        int s2 = input.nextInt();
        System.out.println("Enter 3rd side of Triangle    : ");
        int s3 = input.nextInt();
        int s = (s1 + s2 + s3) / 2;
        double A;
        A = Math.sqrt(s * (s - s1) * (s * s2) * (s * s3));
        System.out.println("Area of Triangle : " + A);
    }
}