import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        /*for (int i =0; i<=10; i++){
            System.out.println(i);
        }*/

        /*for(int x = 10; x > 0; x--){
            System.out.println(x);
        }*/

        Scanner sc = new Scanner(System.in);
        int loop;
        System.out.print("How many times do you want to get looped? ");
        loop = sc.nextInt();

        for (int i = loop; i>0; i-- ){
            System.out.println(i);
        }


        sc.close();
    }
}
