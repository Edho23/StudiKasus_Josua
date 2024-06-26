class CMath
{
	public static void main(String Args[])
	{
		int Bil1=10;
		int Bil2=50;
		int Bil3=100;
		double Bil;
		int Max=0;
		long Bulat=0;
		Max=Math.max(Bil1,Bil2);
		Max=Math.max(Max,Bil3);
		System.out.println(Max)	;
		Bil=0;
		while(Bil <1 || Bil >100)
		{
			Bil=(Math.random()*1000)%101;
		}
		Bulat=Math.round(Bil);
		System.out.println(Bulat);
	}
}
