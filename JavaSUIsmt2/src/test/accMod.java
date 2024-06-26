package test;
import java.util.Random;
class accMod extends Random
{
    public static void main (String[]Args)
    {
        accMod SUI = new accMod();
        System.out.println(SUI.nextInt());
        System.out.println(SUI.next(100));
    }
}   