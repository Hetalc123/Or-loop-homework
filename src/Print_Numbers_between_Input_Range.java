import java.util.Scanner;
//Programme to print numbers between given two numbers
public class Print_Numbers_between_Input_Range {
    public static void main(String[] args) {
        //Import Scanner to Input User value
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        System.out.println("Numbers between " + a + " and " + b + " are:"+ "\n" );
        //Executing code to print Numbers
        for (int i = a+1; i <b ; i++) {
            System.out.println(i);

        }
    }
}

