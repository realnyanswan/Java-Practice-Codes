import java.util.Scanner;

public class mathclasscircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //radius
        double r1;
        double r2;
        double r3;

        double c; //circumference
        double a; //area
        double v; //volume

        //circumference
        System.out.print("Enter the radius of a circle to find a circumference: ");
        r1 = sc.nextDouble();
        c = 2 * Math.PI * r1;
        System.out.println("The circumference of a circle is " + c);

        System.out.println();

        //area
        System.out.print("Enter the radius of a circle to find an area: ");
        r2 = sc.nextDouble();
        a = Math.PI * Math.pow(r2,2);
        System.out.println("The area of a circle is " + a);

        System.out.println();

        //volume
        System.out.print("Enter the radius of a circle to find a volume: ");
        r3 = sc.nextDouble();
        v = (4.0/3.0) * Math.PI * Math.pow(r3,3);
        System.out.println("The volume of a circle is " + v);

        sc.close();
    }
}
