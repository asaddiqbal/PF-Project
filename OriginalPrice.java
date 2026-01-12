import java.util.Scanner;
public class OriginalPrice {
	public static void main(String[] args) {
	   double dspp, osp;
	   Scanner read = new Scanner(System.in);
	   System.out.println("Enter Discounted Selling Price: ");
	   double dsp = read.nextDouble();
	   System.out.println("Enter Discount Percentage: ");
	   double dp = read.nextDouble();
	   dspp = 100 - dp;
	   osp = dsp * 100 / dspp;
	   System.out.println("The Original Selling Price is: " + osp);
	}
}