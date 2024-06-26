class CDeret extends CBatas
{
    void Cetak()
    {
        for(int I=1; I<= Batas ; I++ )
        {
            System.out.print(I+" ");
        }
    }
    
    public static void main(String Args[])
    {
        CDeret ObyDeret = new CDeret();
        ObyDeret.Input_Batas(50);
        ObyDeret.Cetak();
    }
}