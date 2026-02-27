public class breakandcontinue {
    public static void main(String[] args) {
        //break = break out of a loop (stop)
        //continue = skip current iteration of a loop (skip)

        for(int i = 0; i<10; i++){
            if(i==5){
                //break; //stops the loop
                continue; //skip the iteration (skips 5)
            }

            System.out.println(i);
        }
    }
}
