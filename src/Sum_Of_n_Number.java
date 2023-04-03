import java.util.Scanner;

//programme to Print sum of n natural number
public class Sum_Of_n_Number {
    public static void main(String[] args) {
        //import Scanner class to input user value
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Natural Number n :");
        int n = sc.nextInt();
        int sum = 0;
        //code to be executed
        for (int i = 0; i <=n ; i++)
        sum = sum+i;
        {
            System.out.println("Sum of Natural Number " + n + " is => " + sum);

        }
    }
}
