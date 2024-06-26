import java.util.Random;
public class Main 
{
    public static void main(String[] Args)
    {
        int Acak;
        Random sui = new Random();
        
        Acak = sui.nextInt(100);
        System.out.println(Acak);
    }
}