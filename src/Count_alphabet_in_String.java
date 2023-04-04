import java.util.Scanner;
//Write a programme to count alphabet
public class Count_alphabet_in_String {
    public static void main(String[] args) {
        //import scanner class to input user value
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String Name:");
        String name = sc.nextLine();
        System.out.println("Enter Character need to be counted:");
        char a = sc.next().charAt(0);
        int total = 0;
        for (int i = 0; i < name.length(); i++)
            //count index of each character of string
            //find the character
            if(name.charAt(i)==a){
                //count total number of character
                total=total+1;}
        System.out.println("Total Number of Character "+ a +" => " + total);
    }
}