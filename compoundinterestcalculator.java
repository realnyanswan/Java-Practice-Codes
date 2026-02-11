import java.util.Scanner;

public class compoundinterestcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //compound interest calculator

        double principal;
        double rate;
        int timesCompound;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter the interest rate (%): ");
        rate = sc.nextDouble()/100;

        System.out.print("Enter the number times compounded per year: ");
        timesCompound = sc.nextInt();

        System.out.print("Enter the number of years: ");
        years = sc.nextInt();

        amount = principal * Math.pow( (1+ rate/timesCompound), (timesCompound *  years) );

        System.out.printf("The amount after %d years is $: %f\n", years,amount);
        sc.close();
    }
}
