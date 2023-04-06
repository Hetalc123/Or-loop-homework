import java.util.Scanner;
//Programme to reverse number
public class Reverse_The_Number {
    public static void main(String[] args) {
        ////Import Scanner to Input User value
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed:");
        int n= sc.nextInt();
        System.out.println("Reversed number");
        int r=0;
        //executing the code
        for (int i =n; i !=0;i= i/10) {
            int a=i%10;//gets the first reverse number in form of remeinder
            r= r*10+a;//reverses the number
        }
        System.out.print(r);




    }
}
