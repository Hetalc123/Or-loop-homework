import java.util.Scanner;

public class Fibonacci {
    //Programme to display Fibonacci Sequance
    public static void main(String[] args) {
        //Import Scanner to Input User value
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci Sequance till " + n + " as Below:");
//Executing the code
        for (int i = b; i <=n ; ++i) {
            System.out.print(a+"");
            //it adds current number with number before
            int c = a+b;
            a=b;
            b=c;

        }
    }
}
