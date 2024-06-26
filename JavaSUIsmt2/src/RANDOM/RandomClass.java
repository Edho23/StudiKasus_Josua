import java.util.Random;

class RandomClass{
	public static void main(String args[]){
		int RandomInt;
		double RandomDouble;

		Random Bil = new Random();

        for(int I = 1 ; I <= 10 ; I++)
        {
        	RandomInt=Bil.nextInt();
			System.out.println("Random Integer = "+RandomInt);
        }


		System.out.println();
		System.out.println("Random Integer Antara 1 s/d 10");
		do{

			RandomInt=(Math.abs(Bil.nextInt())%11);
			System.out.println(RandomInt);
		}while ((RandomInt < 1) || (RandomInt > 10));

		//System.out.println(RandomInt);

        System.out.println();
		RandomDouble=Bil.nextDouble();
		System.out.println("Random Double = "+RandomDouble);

		System.out.println();
		System.out.println("Random Double Antara 1 s/d 10");
		do{
			RandomDouble=Math.round(Math.abs(Bil.nextDouble()*10));
			System.out.println(RandomDouble);
		}while ((RandomDouble < 1) || (RandomDouble > 10));
		System.out.println(RandomDouble);


	}
}
