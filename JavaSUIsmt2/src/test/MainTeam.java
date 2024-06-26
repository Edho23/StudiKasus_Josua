package test;

class MainTeam
{
    protected void Max()
    {
        int[] X= {30, 100, 20, 52, 120};
        int max = X[0];
        
        System.out.print("X: ");
        for (int i=0; i < X.length; i++)
        {
            System.out.print(X[i] + " ");
//            if(X[i] > max)
//            {
//                max = X[i];
//            }
            max = (X[i] > max ) ? X[i] : max;
        }
        System.out.println();
        System.out.println("Bilangan Terbesar = " + max);
    }
}