import java.util.Scanner;

public class weightconverter {
    public static void main(String[] args) {
        //weight conversion program
        //declare variables
        //welcome message
        //prompt for user choice
        //option1 convert lbs to kgs
        //option2 convert kgs to lbs
        //else print not a valid choice

        Scanner sc = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.print("Choose an option: ");
        choice = sc.nextInt();

        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = sc.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The weight in kgs is %.2f kgs", newWeight);
        }
        else if(choice == 2){
            System.out.print("Enter the weight in kgs: ");
            weight = sc.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The weight in lbs is %.2f lbs", newWeight);
        }
        else{
            System.out.println("That was not a valid choice.");
        }

        sc.close();
    }
}
