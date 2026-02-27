import java.util.Scanner;

public class methods {
    public static void main(String[] args) {

        printName("Nyan Swan", "Aung"); //method1

        String name = getName("Nyan","Swan"); //method2
        System.out.println(name);

        Double result1 = getResult1(1,2); //method3
        System.out.println(result1);

        Scanner sc = new Scanner(System.in); //method4
        Double n3,n4;
        System.out.print("Enter a first number: ");
        n3 = sc.nextDouble();
        System.out.print("Enter a second number: ");
        n4 = sc.nextDouble();

        Double result2 = getResult2(n3,n4);
        System.out.printf("Result: %.2f", result2);

        System.out.println();

        int d,y; //method5
        String m = "";
        boolean validMonth = true;
        boolean validDay = true;

        System.out.print("What day were you born? ");
        d = sc.nextInt();
        if(d<=0 || d>31){
            System.out.println("Invalid day.");
            validDay = false;
        }
        if(!validDay){
            return;
        }

        System.out.print("Which month were you born in? ");
        String input = sc.next();

        switch(input){
            case "1" -> m = "January";
            case "2" -> m = "February";
            case "3" -> m = "March";
            case "4" -> m = "April";
            case "5" -> m = "May";
            case "6" -> m = "June";
            case "7" -> m = "July";
            case "8" -> m = "August";
            case "9" -> m = "September";
            case "10" -> m = "October";
            case "11" -> m = "November";
            case "12" -> m = "December";
            default -> {
                m =  input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();
            }
        }

        if(m.equals("Invalid") || m.equals("")){
            System.out.println("Not a valid month.");
            validMonth = false;
        }
        if(!validMonth){
            return;
        }

        System.out.print("What year were you born? ");
        y = sc.nextInt();

        printBirthday(d,m,y);
    }

    static void printName(String first1, String last1){ //method1
        System.out.println(first1 + " " + last1);
    }

    static String getName(String first2, String last2){ //method2
        return "Hello " + first2 + " " + last2;
    }

    static Double getResult1 (double num1, double num2){ //method3
        return num1 + num2;
    }

    static Double getResult2 (double num3, double num4){ //method4
        return num3 - num4;
    }

    static void printBirthday (int date, String month, int year){ //method5
        System.out.printf("%d/%s/%d", date, month, year);
    }
}



