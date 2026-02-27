import java.util.Scanner;

public class nestloops {
    public static void main(String[] args) {

        /*for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print("$" + " ");
            }
            System.out.println();
        }*/

        Scanner sc = new Scanner(System.in);

        int row;
        int column;
        char symbol;

        System.out.print("Enter the number of rows: ");
        row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        column = sc.nextInt();
        System.out.print("Enter the symbol: ");
        symbol = sc.next().charAt(0);

        for (int i=1;i<=row;i++){
            for(int j =1;j<=column;j++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

    }
}
