class TDeret extends CDeret
{
    void Total_Deret()
    {
        int Tot=0;
        for(int I=1 ; I<= Batas ; I++)
        {
            Tot=Tot+I;
        }
        System.out.println("Total Deret = "+Tot);
    }
    public static void main(String Args[])
    {
        TDeret Oby = new TDeret();
        Oby.Input_Batas(50);
        Oby.Total_Deret();
        Oby.Cetak();
       
    }
}