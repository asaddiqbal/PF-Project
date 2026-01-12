import java.util.Scanner;
public class DiscountedPrice {
	public static void main(String[] args) {
	   double d, dsp;
	   Scanner read = new Scanner(System.in);
	   System.out.println("Enter Current Selling Price: ");
	   double csp = read.nextDouble();
	   System.out.println("Enter Discount Percentage: ");
	   double dp = read.nextDouble();
	   d = dp * csp / 100;
	   dsp = csp - d;
	   System.out.println("The Discounted Selling Price is: " + dsp);
	}
}