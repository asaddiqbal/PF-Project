import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
	   int n;
	   Scanner read = new Scanner(System.in);
	   System.out.println("Enter an Integer to check whether it is Even or Odd: ");
	   n = read.nextInt();
	   if (n%2==0)
	   System.out.println("EVEN");
	   else
	   System.out.println("ODD");
	}
}