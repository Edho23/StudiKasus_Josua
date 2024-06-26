import java.util.*;
class HashTable{
	public static void main(String args[]){
		Hashtable ht = new Hashtable(); // Membuat obyek dari class Hashtable
		ht.put("TC0001","CORE JAVA");
		ht.put("TC0002","STRUKTUR DATA");
		ht.put("TC0003","ADVANCED JAVA");

		System.out.println("Isi HashTable = "+ht.toString());

		System.out.println();
		System.out.println("Menampilkan Keys dari HashTable");
		for(Enumeration enum1 = ht.keys();enum1.hasMoreElements();)
		   System.out.println((String)enum1.nextElement());
		   
       
		String StrCari1 = new String("TC0002");
		String StrCari2 = new String("STRUKTUR DATA");

		System.out.println();
		System.out.println("Cari "+StrCari1);
		if(ht.containsKey(StrCari1))
			System.out.println(StrCari1+" Ada ");
		else
			System.out.println(StrCari1+" Tidak Ada ");

        System.out.println();
		System.out.println("Cari "+StrCari2);
		if(ht.containsKey(StrCari2))
			System.out.println(StrCari2+" Ada ");
		else
			System.out.println(StrCari2+" Tidak Ada ");

		String StrMk = new String();
		StrMk=(String)ht.get(StrCari2);

		System.out.println();
		System.out.println("Mencari Nama Matakuliah Berdasarkan Key Kode Mata Kuliah");
		System.out.println(StrCari2+" Kode Dari "+StrMk);
		System.out.println();

	}
}