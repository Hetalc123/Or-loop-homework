import java.util.Scanner;

//programme to print sum of the numbers
public class Sum_of_number_between_1_to_20 {
    public static void main(String[] args) {
        //import scaner class to input user value
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        int sum = 0;
        //implementing condition to verify input number is in given range
        if (a > 1 && a<20) {
            //code to be executed to print sum of given number
            for (int i = 1; i <= a; i++)
                sum = sum + i;
            {
                System.out.println("Sum of " + a + " = " + sum);}
        }else {
            System.out.println("Invalid Entry");
        }
    }
}

