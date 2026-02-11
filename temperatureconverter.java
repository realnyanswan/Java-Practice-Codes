import java.util.Scanner;

public class temperatureconverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;
        String invalid;

        System.out.print("Enter the temperature: ");

        temp = sc.nextDouble();

        sc.nextLine();
        System.out.println();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): " );
        unit = sc.nextLine().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 :
                (unit.equals ("F")) ? (temp * 9/5) +32: -9999;  //-9999 means invalid in java
        System.out.printf("%.1f%s", newTemp, unit);

        sc.close();
    }
}
