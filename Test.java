class Test
{
    public static void main(String args[])
    {

        int n1=0, n2=1, n3,i, count=20;

        System.out.print(n1 + " " + n2);

        for(i = 0, i<=count; i++)
        {
            n3 = n1+ n2;

            system.out.print(" "+n3);

            n1 = n2;

            n2= n3;
        }
    }

    //prime number
    public static void main(String args[])
    {

        for(int i= 1; i <=20; i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
            }
        }
    }


}