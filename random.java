import java.util.Random;

public class random {
    public static void main(String[] args) {

        Random rm = new Random();

        int x;
        int y;
        int z;

        x = rm.nextInt(0,5);
        y = rm.nextInt(6,10);
        z = rm.nextInt(11,15);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        double a;

        a = rm.nextDouble(1, 2);

        System.out.println(a);

        boolean b;

        b = rm.nextBoolean();

        if(b){
            System.out.println("hehe");
        }
        else{
            System.out.println("haha");
        }
    }
}
