public class stringmethods {
    public static void main(String[] args) {
        String name = "Password";
        int length = name.length(); //length
        char letter = name.charAt(3); //find the char
        int index = name.indexOf("S"); //find the place
        int lastIndex = name.lastIndexOf("n"); //find the last place of char

        //name = name.toLowerCase(); //lowercase
        //name = name.toUpperCase(); //uppercase
        //name = name.trim(); //remove whitespace
        //name = name.replace("n", "m"); //replace n with m

        /*if(name.isEmpty()){
            System.out.println("Your name is empty.");
        }
        else{
            System.out.printf("Hello %s\n", name);
        }*/

        /*if(name.contains(" ")){
            System.out.println("You name contains a space.");
        }
        else{
            System.out.println("Your name does not contain a space");
        }*/

        if(name.equalsIgnoreCase("password")){ //equalsIgnoreCase = ignoring case sensitivity
            System.out.println("Your name cannot be a password");
        }
        else{
            System.out.printf("Hello %s\n", name);
        }

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        //System.out.println(name);
    }
}
