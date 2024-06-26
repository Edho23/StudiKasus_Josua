package test;
/**
 *
 * @author Josua EL
 */
import java.util.*;

class masterReverse 
{
    private void Reversa()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Numbers : ");
        int number = scan.nextInt();
        int reversaNumber = 0;
        
        System.out.println("Originale : " + number);
        
        while(number != 0)
        {
            int x = number % 10;
            reversaNumber = reversaNumber * 10 + x;
            number /= 10;
        }
        
        
        System.out.println("Reversed : " + reversaNumber);
    }
    
    void output()
    {
        Reversa();
    }
}
