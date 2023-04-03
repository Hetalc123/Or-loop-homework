import java.util.Scanner;
//Programme to find if input Number Is Prime Number

public class Prime_Number {
    public static void main(String[] args) {
        //Import Scanner Class to take User input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number:");
        int a = sc.nextInt();
        int sum=0;
        int count=0;
        for (int i = 1; i <= a; i++)//for loop to execute the code
           if(a%i==0)//code to find factors of number
               //counting the numbers of factor
               count++;{
                   //executing code to find Prime number
                   if(count>2){
                       System.out.println(a + " is not a Prime Number");
                   }else{
                       System.out.println(a + " is a Prime number");
                   }
        }


        }
    }


