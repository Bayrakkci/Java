import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt(6) + 1; //next boolean, float...
        double y = random.nextDouble();
        System.out.println(x + y);
    }
}