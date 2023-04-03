import java.util.Scanner;

//programme for multiplication number
public class Multiplication_table {
    public static void main(String[] args) {
        //import scanner class to input user value
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Table of Number " + a + " is as below:");
        //code to be executed to print table
        for (int i = a; i <=a ; i++) {
            for (int j = 1; j <=12 ; j++) {
                System.out.println(i + " X " + j + " = " + i*j);
            }
            System.out.println("x===x===x===x===x");
        }
    }
}
