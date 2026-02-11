import java.util.Scanner;

public class ifstatements {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age;

        System.out.println("What's your age?");
        age = sc.nextInt();

        if(age <20){
            System.out.println("You are a teenage/kid.");
        }

        else if(age >=20 && age<=30){
            System.out.println("You are a young adult.");
        }

        else if (age > 30 && age <50 ){
            System.out.println("You are an adult.");
        }

        else{
            System.out.println("You are a senior.");
        }

        sc.close();
    }
}
