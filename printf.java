public class printf {
    public static void main(String[] args) {
        String name = "Nyan";
        char firstInitial = 'N';
        int age = 25;
        double height = 66.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with %c\n", firstInitial);
        System.out.printf("You are %d years old and your height is %f inches\n",age,height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.println();

        double price1 = 9000.99;                        //+ = output a plus
        double price2 = 10000000.99;                    //, = comma grouping separator
        double price3 = -54.77;                         //( = negative number are enclosed in ()
                                                        // space = display a minus if negative, space if positive
        System.out.printf("%,.1f\n", price1);
        System.out.printf("%(.4f\n", price2);
        System.out.printf("%(.3f\n", price3);

        int num1 = 1;                               //0 = zero padding
        int num2 = 23;                              //number = right justified padding
        int num3 = 456;                             //negative number = left justified padding
        int num4 = 7890;

        System.out.printf("%-4d\n", num1);
        System.out.printf("%-4d\n", num2);
        System.out.printf("%-4d\n", num3);
        System.out.printf("%-4d\n", num4);
    }
}
