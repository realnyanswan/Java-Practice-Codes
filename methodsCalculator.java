import java.util.Scanner;

public class methodsCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char operators;
        double num1, num2;
        double result = 0;
        boolean valid0peration = true;

        System.out.print("Enter the first number: ");
        num1 = sc.nextDouble();
        System.out.print("Enter the operation (+,-, *, /, %, ^): ");
        operators = sc.next().charAt(0);
        System.out.print("Enter the second number: ");
        num2 = sc.nextDouble();

        switch (operators){
            case '+' -> System.out.print("Result: " + getAddition(num1, num2));
            case '-' -> System.out.print("Result: " + getSubstraction(num1, num2));
            case '*' -> System.out.print("Result: " + getMultiplication(num1, num2));
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Cannot be divisible by 0.");
                    valid0peration = false;
                }
                else{
                    System.out.print("Result: " + getDivision(num1, num2));
                }
            }
            case '%' -> System.out.print("Result: " + getModule(num1, num2));
            case '^' -> System.out.print("Result: " + getPow(num1, num2));
            default -> {
                System.out.println("Invalid Operator. Please try again.");
                valid0peration = false;
            }
        }
    }

    static Double getAddition(double n1, double n2){
        return n1 +n2;
    }
    static Double getSubstraction(double n3, double n4){
        return n3 - n4;
    }
    static Double getMultiplication(double n5, double n6){
        return n5 * n6;
    }
    static Double getDivision(double n7, double n8){
        return n7 / n8;
    }
    static Double getModule(double n9, double n10){
        return n9 % n10;
    }
    static Double getPow(double n11, double n12){
        return Math.pow(n11, n12);
    }
}
