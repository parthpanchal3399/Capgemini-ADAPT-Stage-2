import java.util.*;

class Utility
{
    public static int fahrenheitToCelcius(double farhenheit)
    {
        int celcius;
        celcius = (int)Math.round((farhenheit - 32) * 5 / 9);
        return celcius;
    }
    
    public static String  getLevel(int a[])
    {
        int sum=0;
        for(int i=0; i<a.length; i++)
        {
            sum += a[i];
        }
        if(sum >= 100)
            return "HIGH";
        else if(sum >= 70)
            return "MEDIUM";
        else if(sum < 70)
            return "LOW";
        return "";
    }
}

class Source 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        
        switch(option)
        {
            case 1:
                double f;
                f = sc.nextDouble();
                System.out.println(Utility.fahrenheitToCelcius(f));
                break;
            case 2:
                int n = sc.nextInt();
                int a[] = new int[n];
                for(int i=0; i<n; i++)
                {
                    a[i] = sc.nextInt();
                }
                System.out.println(Utility.getLevel(a));
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}
