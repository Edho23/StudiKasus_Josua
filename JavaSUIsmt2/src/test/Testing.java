package lat200902;
import java.util.Random;

class LAT20090{
    private static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static void main(String[] args) 
    {
        Random random = new Random();
        int number = random.nextInt(900000) + 100000; // Menghasilkan bilangan acak antara 100000 dan 999999
        System.out.println("Bilangan: " + number);
        int reversedNumber = reverseNumber(number);
        System.out.println("Terbalik: " + reversedNumber);
    }
}