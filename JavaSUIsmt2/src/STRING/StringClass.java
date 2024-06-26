class StringClass{
	public static void main(String args[]){
		String Str1,Str2;  // deklarasi anggota class
		char ArrKar[]={'J','A','V','A'};

		Str1=new String(ArrKar); // membuat obyek
		Str2=new String("PROGRAMMING"); // membuat obyek
		// deklarasi sekaligus membuat
		String Str3=new String(); // membuat obyek


		System.out.println("Str1   = "+Str1);
		System.out.println("Str2   = "+Str2);
		System.out.println();
		System.out.println("Str1 digabung dengan Str2");
		Str3=Str1.concat(Str2);
		System.out.println("Str2   = "+Str2);
		System.out.println("Str3   = "+Str3);

        int panjang=Str2.length();
        System.out.println("panjang String= " + panjang);
		System.out.println();
		System.out.println("Ambil sebagian karakter Str1");
		String Str4 = String.copyValueOf(ArrKar,0,3);

		System.out.println("Str4   = "+Str4);


	}
}
