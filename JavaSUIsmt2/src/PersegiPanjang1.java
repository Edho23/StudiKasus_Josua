public class PersegiPanjang1
{
   private int panjang=100;
   private int lebar=50;

   PersegiPanjang1()
   {
	  System.out.println("Konstruktor Dijalankan...");
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
       PersegiPanjang1 ObyPP = new PersegiPanjang1(); // membuat obyek dari class persegi panjang
       ObyPP.Cetak();
       ObyPP.Luas();
       ObyPP.Keliling();

       PersegiPanjang1 ObyPP2 = new PersegiPanjang1(); // membuat obyek dari class persegi panjang


     }     

}
