import java.util.*;
class Telepon{
	public static void main(String args[]){
		String StrTelp=new String("(03111111111111111)9544801");
		String StrDel= new String("- ()");

		StringTokenizer st= new StringTokenizer(StrTelp,StrDel,false);
		System.out.println("Kode Area     = "+st.nextToken());
		System.out.println("Nomor Telepon = "+st.nextToken());

	}
}
