import java.util.Scanner;
//Write a programme to count alphabet
public class Count_alphabet_in_String {
    public static void main(String[] args) {
        //import scanner class to input user value
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        char a = sc.next().charAt(0);
        int total = 0;
        for (int i = 0; i < name.length(); i++)
            //Prints index of character of string
            //System.out.println(i);
            //find the character
            if(name.charAt(i)==a){
                //count total number of character
                total=total+1;}
        System.out.println("Total Number of Character "+ a +" => " + total);
    }
}