package test;
class Almighty
{
    private void Print1()
    {
        System.out.println("Private Print1");
    }
    void Print2()
    {
        Print1();
        System.out.println("Package Print2");
    }
    protected void Print3()
    {
        System.out.println("Protected Print3");
    }
    public void Print4()
    {
        System.out.println("Public Print4\n");
    }
    

} 