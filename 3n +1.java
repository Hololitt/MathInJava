public class Training41 {
    public static int[] clength = new int[1000000];

    public static long nextnum(long n)
    {

        if(n%2==0)
        {
            return n/2;
        }
        else
            return 3*n+1;
    }

    public static long cyclelength(long n)
    {

        if(n==1)
        {
            return 1;

        }
        if (n < 1000000 && clength[(int)n] != 0)
        {
            return clength[(int)n];

        }
        long length= (1+ cyclelength(nextnum(n)));
        if (n < 1000000)
            clength[(int)n] = (int) length;

        return length;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

            System.out.println(cyclelength(scanner.nextInt()));
    }

}
