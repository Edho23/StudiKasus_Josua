class StringBufferClass{
	public static void main(String args[]){
		StringBuffer sb1= new StringBuffer("MATA KULIAH ");  // Membuat Obyek
		StringBuffer sb2= new StringBuffer();  // Membuat Obyek
		StringBuffer sb3= new StringBuffer(); // Membuat Obyek
		
	
		sb2.append("JAVA PROGRAMMING");

		System.out.println("sb1  = "+sb1);
		System.out.println("sb2  = "+sb2);
		System.out.println();
		System.out.println("sb3 = sb1 digabung dengan sb2");
		sb3.append(sb1);
		sb3.append(sb2);
		System.out.println("sb3  = "+sb3);

		System.out.println();
		System.out.println("Sisipkan String CORE pada sb3");
		sb3.insert(12,"CORE ");
		System.out.println("sb3  = "+sb3);
		System.out.println("Panjang = "+sb3.length());


		System.out.println();
		System.out.println("Hapus String dari StringBuffer");
		sb3.delete(12,17);
		System.out.println("sb3  = "+sb3);
		System.out.println("Panjang = "+sb3.length());

		System.out.println();
		System.out.println("Hapus Karakter dari StringBuffer");
		sb3.deleteCharAt(12);
		System.out.println("sb3  = "+sb3);
		System.out.println("Panjang = "+sb3.length());

		System.out.println();
		System.out.println("Koversi StringBuffer ke String");
		String Str = sb3.toString();
		System.out.println("Str  = "+Str);
		System.out.println("Panjang = "+Str.length());



	}
}
