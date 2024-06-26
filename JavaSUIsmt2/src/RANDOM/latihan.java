import java.util.Random;
class latihan
{
    public static void main(String[]Args)
    {
        Random Rndm = new Random();
        int Bil;
        
        int I=0;
        while(I<=100)
        {
            Bil=Rndm.nextInt(100);
            if(Bil>50)
            {
                System.out.println(Bil);
                I++;
            }
        }
        
    }
}