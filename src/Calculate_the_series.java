import java.util.Scanner;

//Programme to calculate the series
public class Calculate_the_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        double n = sc.nextDouble();
        double sum = 0;
        //code to be executed
        System.out.println("Sum of the Series:");
        if (n > 0) {
            for (double i = 1; i <= n; i++) {
                sum = sum + (1 / i);
                //Display total of n number series
            }
            System.out.println(sum);

        } else {
            System.out.println("Invalid Entry");
        }
    }
}