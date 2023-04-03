import java.util.Scanner;

//Programme to calculte Two Numbers
public class Calculator {
    public static void main(String[] args) {
        //import scanner to input user value
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        double a = sc.nextInt();
        System.out.println("Enter Second Number");
        double b = sc.nextInt();
        System.out.println("Enter Operator to be executed:");
        char operator= sc.next().charAt(0);
        double addition = a+b;
        double multiplication = a*b;
        double subtraction = a-b;
        double division = a/b;
        //code to be executed and display the value as per user input
        switch (operator){
            case '+':
                System.out.println("Addition of " + a + " and " + b + " is " + addition);
                break;
            case '-':
                System.out.println("Subtraction of " + a + " and " + b + " is " + subtraction);
                break;
            case '*':
                System.out.println("Multiplication of " + a + " and " + b + " is " + multiplication);
                break;
            case '/':
                System.out.println("Division of " + a + " and " + b + " is " + division);
                break;
            default:
                System.out.println("Invalid Entry");
        }

    }
}
