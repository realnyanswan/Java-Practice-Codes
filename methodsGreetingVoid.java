import java.util.Scanner;

public class methodsGreetingVoid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String n, d;
        boolean validDay = true;
        System.out.print("Please enter your name: ");
        n = sc.next();
        n = n.substring(0,1).toUpperCase() + n.substring(1).toLowerCase();
        System.out.print("Please enter the time of the day (morning/afternoon/evening/night): ");
        d = sc.next();
        d = d.substring(0,1).toUpperCase() + d.substring(1).toLowerCase();
        if(d.equals("Morning") || d.equals("Afternoon") ||d.equals("Evening") ||d.equals("Night")){
            getGreeting(n,d);
        }
        else{
            System.out.println("Invalid time of the day.");
            validDay = false;
        }
    }
    static void getGreeting (String name, String day){
        System.out.printf("Hello! Good %s, %s.", day, name);
    }
}