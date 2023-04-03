import java.util.Scanner;

//Programme to display month name
public class Month_Name {
    public static void main(String[] args) {
        //import scanner class to input value
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number to Print Month name accordingly:");
        int a = sc.nextInt();
        //code to be executed to display month by inputing number
        switch (a){
            case 1:
                System.out.println("Month " + a +" is 'January'");
                break;
            case 2:
                System.out.println("Month " + a +" is 'February'");
                break;
            case 3:
                System.out.println("Month " + a +" is 'March'");
                break;
            case 4:
                System.out.println("Month " + a +" is 'April'");
                break;
            case 5:
                System.out.println("Month " + a +" is 'May'");
                break;
            case 6:
                System.out.println("Month " + a +" is 'June'");
                break;
            case 7:
                System.out.println("Month " + a +" is 'July'");
                break;
            case 8:
                System.out.println("Month " + a +" is 'August'");
                break;
            case 9:
                System.out.println("Month " + a +" is 'September'");
                break;
            case 10:
                System.out.println("Month " + a +" is 'October'");
                break;
            case 11:
                System.out.println("Month " + a +" is 'November'");
                break;
            case 12:
                System.out.println("Month " + a +" is 'December'");
                break;
            default:
                System.out.println("'Invalid Input'");
        }


    }
}
