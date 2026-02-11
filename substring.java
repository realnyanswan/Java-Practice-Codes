import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        // .substring() = a method used to extract a portion of a string
        // .substring(start index, end index)

        Scanner sc = new Scanner(System.in);

        String email = "nsa123@gmail.com";
        String username = email.substring(0,6);
        String domain = email.substring(7);

        System.out.println(username);
        System.out.println(domain);

        System.out.println();

        String email1 = "hehehaha@gmail.com";
        String username1 = email1.substring(0,email1.indexOf("@"));
        String domain1 = email1.substring(email1.indexOf("@") + 1);

        System.out.println(username1);
        System.out.println(domain1);

        System.out.println();

        String email2;
        String username2;
        String domain2;

        System.out.print("Enter your email: ");
        email2 = sc.nextLine();

        if(email2.contains("@")){
            username2 = email2.substring(0, email2.indexOf("@"));
            domain2 = email2.substring(email2.indexOf("@") + 1);
            System.out.printf("Your username is %s\n", username2);
            System.out.printf("The domain is %s\n", domain2);
        }
        else{
            System.out.println("Email has to contain @");
        }

        sc.close();
    }
}
