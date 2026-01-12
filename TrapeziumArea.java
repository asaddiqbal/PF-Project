import java.util.Scanner;
public class TrapeziumArea {
	public static void main(String[] args) {
	   Scanner read = new Scanner(System.in);
	   System.out.println("Enter Length of the top Parallel side (a): ");
	   double a = read.nextDouble();
	   System.out.println("Enter Lenght of the bottom Parallel side (b): ");
	   double b = read.nextDouble();
	   System.out.println("Enter Perpendicular Distance between Parallel sides (h): ");
	   double h = read.nextDouble();
	   double area = (a + b) * h/2;
	   System.out.println("Area is: " + area  +" square units");
	}
}