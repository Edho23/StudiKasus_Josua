class CStringBuffer
{
	public static void main(String Args[])
	{
		StringBuffer SB1 = new StringBuffer();
		System.out.println("SB1 = "+SB1);
		SB1.append("PEMROGRAMAN");
		System.out.println("SB1 = "+SB1);
		SB1.append(" LANJUT");
		System.out.println("SB1 = "+SB1);
		SB1.insert(11," JAVA");
		System.out.println("SB1 = "+SB1);
		SB1.delete(11,16);
		System.out.println("SB1 = "+SB1);
	}
}
