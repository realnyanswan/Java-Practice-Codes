import java.util.Scanner;

public class mathclass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double c; //hypotenuse
        double a; //first side
        double b; //second side

        System.out.print("Enter the first side: ");
        a = sc.nextDouble();
        System.out.print("Enter the second side: ");
        b = sc.nextDouble();

        c = Math.sqrt( (Math.pow(a,2)) + (Math.pow(b,2)) ) ;

        System.out.println("The hypotenuse of the right angled triangle is " + c + "in");

        sc.close();
    }
}
