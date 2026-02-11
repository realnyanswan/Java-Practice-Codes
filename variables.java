public class variables {
    public static void main (String[] args){
        /*
        variables
        int double char float boolean String
         */

        String name = "Nyan";
        int age = 25;
        double height = 5.6;
        double gpa = 3.5;
        char grade = 'A';
        char symbol = '$';
        boolean isStudent = false;
        boolean isWorking = true;

        System.out.println("My name is " + name + ".");
        System.out.println("My height is " +  height + " which is pretty average i guess.");
        System.out.println("I just turned " + age + " back in October.");
        System.out.println("I got a final grade: " + grade + " in Computer Science major.");
        System.out.println("My gpa was " + gpa);
        System.out.println("I get paid in " + symbol);
        System.out.println("Am I a student right now? The answer is " + isStudent);

        if(isStudent) {
            System.out.println("I'm not a student anymore");
        }
        else {
            System.out.println("I work for Apple Inc.");
        }

    }
}
