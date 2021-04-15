import java.util.*;

public class Source {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<1 || n>20)
        {
            System.out.println("INVALID_INPUT");
        }
        else
        {
            Integer a[] = new Integer[n];
            for(int i=0; i<n; i++)
            {
                a[i] = sc.nextInt();
            }
            if(n%2 == 0)    //n is even 
            {
                Arrays.sort(a);
                for(int i=0; i<n; i++)
                {
                    System.out.print(a[i]+" ");
                    if(i==n)
                    {
                        System.out.print(a[i]);
                    }
                }
            }
            else
            {
                Arrays.sort(a, Collections.reverseOrder());
                for(int i=0; i<n; i++)
                {
                    System.out.print(a[i]+" ");
                    if(i==n)
                    {
                        System.out.print(a[i]);
                    }
                }
            }
        }
    }
}

