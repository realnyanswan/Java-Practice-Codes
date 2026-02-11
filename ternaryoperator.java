import java.util.Scanner;

public class ternaryoperator {
    public static void main(String[] args) {
        // ternary operator ? = return 1 of 2 values if a condition is true
        // variable = (condition) ? ifTrue : ifFalse;

        Scanner sc = new Scanner(System.in);

        int score = 75;
        String passOrFail = (score>=70) ? "Pass":"Fail";
        System.out.println(passOrFail);

        System.out.println();

        System.out.print("Enter any integer: ");
        int num = sc.nextInt();
        String oddOREven = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(oddOREven);

        System.out.println();

        System.out.print("Enter the time: ");
        int time = sc.nextInt();
        if( time >= 0 && time <=24 ){
            String amOrPm = (time < 12) ? "Am" : "Pm";
            System.out.println(amOrPm);
        }
        else{
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
