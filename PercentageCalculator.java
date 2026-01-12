import java.util.Scanner;
public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter Obtained Marks: ");
        double om = read.nextDouble();
        System.out.println("Enter Maximum Marks: ");
        double mm = read.nextDouble();
        double p = om/mm * 100;
        System.out.println("Percentage = " +p+ "%");
    }
}