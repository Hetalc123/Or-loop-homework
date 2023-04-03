//Programme to divide numbers by 3 and 5
public class Divide_Numbers_by_3_and_5 {
    public static void main(String[] args) {
        //code to print numbers divided by 3 between 1 and 100
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Number Divided By 3 " + " is " + i);
            }
        }  //code to print numbers divided by 5 between 1 and 100
        for (int i = 1; i < 100; i++) {
            if(i%5==0){
                System.out.println("Number Divided By 5 " + " is " + i);
            }
        }
    }
}