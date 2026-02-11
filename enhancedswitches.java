import java.util.Scanner;

public class enhancedswitches {
    public static void main(String[] args) {
        //instead of writing if/else if/else
        //enhanced switch = a replacement to many else if statements

        String day;

        /*String day = "Sunday";

        switch(day){
            case "Monday" -> System.out.println("It is a weekday");
            case "Tuesday" -> System.out.println("It is a weekday");
            case "Sunday" -> System.out.println("It is a weekend");
        }*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a day: ");
        day = sc.nextLine();
        day = day.substring(0,1).toUpperCase() + day.substring(1).toLowerCase();

        /*switch(day){
            case "Monday" -> System.out.println("It is a weekday");
            case "Tuesday" -> System.out.println("It is a weekday");
            case "Wednesday" -> System.out.println("It is a weekday");
            case "Thursday" -> System.out.println("It is a weekday");
            case "Friday" -> System.out.println("It is a weekday");
            case "Saturday" -> System.out.println("It is a weekend");
            case "Sunday" -> System.out.println("It is a weekend");
            default -> System.out.printf("Invalid input. %s is not a day", day);
        }*/

        switch(day){
            case "Monday","Tuesday","Wednesday","Thursday","Friday"
                -> System.out.println("It is a weekday 😭");
            case "Saturday","Sunday" -> System.out.println("It is a weekend 😍");
            default -> System.out.printf("Invalid input. %s is not a day", day);
        }

        sc.close();
    }
}
