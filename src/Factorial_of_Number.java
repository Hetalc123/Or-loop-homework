import java.util.Scanner;

//Programme to find factorial of number
public class Factorial_of_Number {
    public static void main(String[] args) {
        //Import Scanner to Input User value
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int a = sc.nextInt();
        int b = 1;
        //code to be executed
        for (int i = 1; i <= a; i++)
          b=b*i;//multiplying numbers to get factorial
        System.out.println("The Factorial of " + a + " is " + b);
        //System.out.println(b);
    }
}
