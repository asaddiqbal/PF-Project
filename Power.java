import java.util.Scanner;
public class Power {
	public static void main(String[] args) {
	   Scanner read = new Scanner(System.in);
	   System.out.println("Enter Voltage (V): ");
	   double volt = read.nextDouble();
	   System.out.println("Enter Current (I): ");
	   double amp = read.nextDouble();
	   double pow = volt * amp;
	   System.out.println("Power (P) is: " + pow +" Watts");
	}
}