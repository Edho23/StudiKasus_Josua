public class PersegiPanjang3
{
   private int panjang;
   private int lebar;


  PersegiPanjang3()
   {
	  System.out.println("Konstruktor pertama");
      panjang=4;
      lebar=2;
   }

   PersegiPanjang3(int panjang, int lebar)
      {
		System.out.println("Konstruktor kedua");
        this.panjang=panjang;
        this.lebar = lebar;
      }


   public void Cetak()
     {
        System.out.println("panjang = "+panjang);
        System.out.println("lebar   = "+lebar);
     }
   public void Luas()
     {
        System.out.println("Luas    = "+panjang*lebar);
     }
   public void Keliling()
     {
        System.out.println("Keliling = "+(2*(panjang+lebar)));
     }

    public static void main(String Args[])
     {
       System.out.println("Obyek Pertama");
       PersegiPanjang3 ObyPP1 = new PersegiPanjang3();
       ObyPP1.Cetak();
       ObyPP1.Luas();
       ObyPP1.Keliling();

       System.out.println();
       System.out.println("Obyek Kedua");
       PersegiPanjang3 ObyPP2 = new PersegiPanjang3(10,5);
       ObyPP2.Cetak();
       ObyPP2.Luas();
       ObyPP2.Keliling();

       
     }

}
