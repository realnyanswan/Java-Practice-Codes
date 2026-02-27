import java.util.Scanner;

public class methodsGreeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n,d;
        boolean validDay = true;

        System.out.print("Enter your name: ");
        n = sc.next();
        n = n.substring(0,1).toUpperCase() + n.substring(1).toLowerCase();

        System.out.print("Enter the time of the day: ");
        d = sc.next();
        d = d.substring(0,1).toUpperCase() + d.substring(1).toLowerCase();

        if(d.equals("Morning") || d.equals("Afternoon") || d.equals("Evening") || d.equals("Night")){
            System.out.println(getGreeting(n,d));
        }
        else{
            System.out.println("Invalid time of the day.");
            validDay = false;
        }
    }

    static String getGreeting(String name, String day){
        return "Hello! Good " + day +", " + name;
    }
}
