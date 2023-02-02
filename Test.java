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

    //
    public static void main(String args[])
    {
        int numbet 313 ;
        int orininalNumber , reminder , result=0;

        orininalNumber= reminder;

        while(orininalNumber !=0)
        {
            reminder = originalNumber % 10;
            result += Math.pow(reminder , 2);
            originalNumber /= 10;

        }

        if (result == number)
        {
            System.out.println("Armstrong");
        }

        else{
            System.out.println(" not Armstrong");
        }
    }


}