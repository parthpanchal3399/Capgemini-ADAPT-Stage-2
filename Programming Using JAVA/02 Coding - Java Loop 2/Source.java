import java.util.Scanner;
public class Source {
    public static boolean isPrime(int n)
    {
        for(int i=2; i<n/2; i++)
        {
            if(n%i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int x1, x2, sum=0;
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        if( ((x1<3 || x1>1000) || (x2<3 || x2>1000)) || (x1 > x2) )
        {
            System.out.println("INVALID_INPUT");
        }
        else
        {
            for(int i=x1; i<=x2; i++)
            {
                if(isPrime(i))
                {
                    sum += i;
                }
            }
            System.out.println(sum);
        }
    }
}
