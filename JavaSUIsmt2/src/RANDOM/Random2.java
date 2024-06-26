class Random2{
	public static void main(String args[]){
		double Bil1;
		int Randomke=1;

		Bil1=0;
	    while (Bil1 < 50 || Bil1 >100)
	    {
	    	Bil1=Math.round(Math.random()*100);
	    	Randomke++;
	    }
		System.out.println(Bil1);
		System.out.println("Bilangan Random Ke = "+Randomke);
	
	}
}
