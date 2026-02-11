import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import java.util.Scanner;

public class calculatorprogram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        double result = 0;
        char operator;
        boolean validOperation = true;

        System.out.print("Enter the first number: ");
        num1 = sc.nextDouble();

        System.out.println();

        System.out.print("Enter the operators (+,-,*,/,%,^): ");
        operator = sc.next().charAt(0);

        System.out.println();

        System.out.print("Enter the second number: ");
        num2 = sc.nextDouble();

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Invalid. Cannot be divide by zero.");
                    validOperation = false;
                }
                else{
                    result = num1 / num2;
                }
            }
            case '%' -> result = num1 % num2;
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid Operator!");
                validOperation = false;
            }
        }

        System.out.println();

        if(validOperation){
            System.out.printf("%.2f", result);
        }

        sc.close();
    }
}
