import java.util.Vector;
class VectorClass{
	public static void main(String args[]){
		
		Vector vector = new Vector(2);
		
		Integer Bil1 = new Integer(10);
		Integer Bil2 = new Integer(20);

		String  str = new String("Satu");

		System.out.println("Capacity = "+vector.capacity());
		System.out.println(" Size     = "+vector.size());
		System.out.println();


		vector.addElement(Bil1);
		vector.addElement(str);
                

		System.out.println("Setelah Dimasukkan dua elemen ");
		System.out.println("Capacity = "+vector.capacity());
		System.out.println("Size     = "+vector.size());
		System.out.println();

		System.out.println();
		System.out.println("Elemen-Elemen Vector= ");
		for(int I = 0;I<vector.size();I++){
			System.out.println(vector.elementAt(I));
		}

		System.out.println();
		System.out.println("Tambah satu Elemen lagi ");
		vector.addElement(Bil2);
		System.out.println();
		System.out.println("Capacity = "+vector.capacity());
		System.out.println("Size     = "+vector.size());

		System.out.println();
		System.out.println("Elemen-Elemen Vector= ");
		for(int I = 0;I<vector.size();I++){
			System.out.println(vector.elementAt(I));
		}


	}
}
