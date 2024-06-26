import java.util.*;
class CRandom
{
	public static void main(String Args[])
	{
		int Bil=0;
		Random Rnd = new Random();
		int Jum=1;
		while(Jum <= 10)
		{
			Bil=0;
			while(Bil < 1 || Bil > 100)
			{
				Bil=Math.abs(Rnd.nextInt())%101;
			}
			System.out.println(Bil);
			Jum++;
		}
	}
}
