class CString
{
	public static void main(String Args[])
	{
		String Str1 = new String();
		String Str2 = new String("PEMROGRAMAN LANJUT");
		System.out.println("Str1 = "+Str1);
		System.out.println("Str2 = "+Str2);
		Str2=Str2.toLowerCase();
		System.out.println("Str2 = "+Str2);
		Str1=Str2.substring(5,11);
		System.out.println("Str1 = "+Str1);
		System.out.println("Str2 = "+Str2);
	}
}
