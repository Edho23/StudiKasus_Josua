public class PersegiPanjang2
{
   private int panjang;
   private int lebar;



   PersegiPanjang2(int P, int lebar)  // konstruktor
      {
        panjang=P;
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
       System.out.println("Konstruktor Dgn Parameter");
       PersegiPanjang2 ObyPP = new PersegiPanjang2(10,5);
       System.out.println("Persegi Panjang Pertama");

       ObyPP.Cetak();
       ObyPP.Luas();
       ObyPP.Keliling();

       System.out.println();
       System.out.println("Persegi Panjang Kedua");
       PersegiPanjang2 ObyPP2 = new PersegiPanjang2(100,50);

       ObyPP2.Cetak();
       ObyPP2.Luas();
       ObyPP2.Keliling();


     }

}