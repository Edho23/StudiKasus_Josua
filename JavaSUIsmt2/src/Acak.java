import java.util.Random;

public class Acak {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10);
        System.out.println("Bilangan acak: " + number);
    }
}