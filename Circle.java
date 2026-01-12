import java.util.Scanner;
public class Circle {
	public static void main(String[] args) {
	   double r,a,c;
	   Scanner read = new Scanner(System.in);
	   System.out.println("Enter Radius of Circle to Calculate its Area and Circumference: ");
	   r = read.nextDouble();
	   a = Math.PI * r * r;
	   c = 2 * Math.PI * r;
	   System.out.println("The Area of Circle is: "+a);
	   System.out.println("The Circumference of Circle is: "+c);
	}
}