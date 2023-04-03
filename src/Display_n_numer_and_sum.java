import java.util.Scanner;

public class Display_n_numer_and_sum {

        public static void main(String[] args) {
            //import Scanner class to input user value
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Natural Number n :");
            int n = sc.nextInt();
            int sum = 0;
            System.out.println("Limit of Number");
            //code to be executed
            for (int i = 0; i <=n ; i++){
                System.out.println(i);
                sum = sum+i;}
            {
                System.out.println("Sum of Natural Number " + n + " is " + sum);

            }
        }
    }

