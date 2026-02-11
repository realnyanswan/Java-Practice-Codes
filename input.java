import java.util.Scanner;
public class input{
    static void main(String[] args) {  //psvma for shortcut
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Your name is " + name);
        System.out.println("Your age is " +  age);

        System.out.println("Do you work for Apple? (True/False: ");
        boolean yesApple = sc.nextBoolean();
        System.out.println("Apple Employee: " + yesApple);

        if(yesApple){
            System.out.println("You are an Apple employee.");
        }
        else{
            System.out.println("You are not an Apple employee.");
        }

        sc.close();
    }
}
