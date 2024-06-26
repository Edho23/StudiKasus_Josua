class MathClass{
	public static void main(String args[]){
		double Bil1,Bil2,Bil3,Bil;

		Bil1=Math.random();
		Bil2=Math.random()*10;
		Bil=Math.random();
		Bil3=Bil*100;
		System.out.println("Bil1 = "+Bil1);
		
		System.out.println("Bil2 = "+Bil2);
		System.out.println("Bil = "+Bil);
		System.out.println("Bil3 = "+Bil3);

		System.out.println();
   	    System.out.println("Bilangan Bulat");
		System.out.println("Bil1 = "+Math.round(Bil1));
		System.out.println("Bil2 = "+Math.round(Bil2));
		System.out.println("Bil3 = "+Math.round(Bil3));
/*
		System.out.println();
   	    System.out.println("10 Bilangan Bulat Random Antara 1 s/d 10");
   	    int BilKe=0;
   	    while(BilKe <=10){
			Bil2=Math.random()*10;
			if((Bil2 >=1) && (Bil2 <= 10)){
				BilKe++;
				System.out.println(Math.round(Bil2));
			}
		}
*/
	}
}
