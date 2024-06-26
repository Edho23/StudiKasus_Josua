class MathClass{
	public static void main(String[]args){
		double Bil1,Bil;

		System.out.println("Bilangan Bulat Random Antara 50 s/d 100");
   	    int BilKe=0;
   	    int Selesai=0;
   	    while(Selesai!=1){
			
			Bil=Math.random()*100;
			Bil1=Bil;
			BilKe++;
			System.out.println("Bilangan Ke "+BilKe+" = "+Bil);
			System.out.println(Math.round(Bil1));
	
			if((Bil1 >=50) && (Bil1 <= 100)){
	           Selesai=1;
			}
		}


	}
}
