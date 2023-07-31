public class factorial
{
    public static void main(String[] args)
    {
        System.out.println("1) " + prob1(10));
        System.out.println("2) " + prob2(10));
        System.out.println("3) " + prob3(10));
        System.out.println("4) " + prob4(10));
        System.out.println("5) " + prob5(10));
        System.out.println("6) " + prob6(10));
        System.out.println("7) " + prob7(10));
        System.out.println("8) " + prob8(10));
        System.out.println("9) " + prob9(10));
        System.out.println("10) " + prob10(10));
    }

    public static int prob1(int n)
    {
        // when n = 1 return 6
        // a(n) = a(n-1) + 200
        if (n == 1)
        {
            return 6;
        }
        else
        {
            return prob1(n - 1) + 200;
        }
    }
    
    public static int prob2(int n)
    {
        if (n == 1)
        {
            return 26;
        }
        else
        {
            return (2 + prob2(n - 1)) / 2;
        }
    }
    
    public static int prob3(int n)
    {
        if (n == 1)
        {
            return -4;
        }
        else
        {
            return prob3(n - 1) + 30;
        }
    }

    public static double prob4(int n)
    {
        if (n == 1)
        { return 0.5; }
        else
        { return (prob4(n - 1) * 2); }
    }

    public static int prob5(int n)
    {
        if (n == 1)
        { return 3; }
        else
        { return (prob5(n - 1) + n); }
    }

    public static int prob6(int n)
    {
        if (n == 1)
        { return -1; }
        else
        { return (prob6(n - 1) + n); }
    }

    public static int prob7(int n)
    {
        if (n == 1)
        { return -35; }
        else
        { return (prob7(n - 1) + 100); }
    }

    public static int prob8(int n)
    {
        if (n == 1)
        { return 3; }
        else
        { return (prob8(n - 1) * -4); }
    }

    public static int prob9(int n)
    {
        if (n == 1)
        { return 1; }
        else
        { return(n * prob9(n - 1)); }
    }

    public static int prob10(int n)
    {
        if (n == 1)
        { return(5/3); }
        else
        { return(prob10(n - 1) * (1/2)); }
    }
}

