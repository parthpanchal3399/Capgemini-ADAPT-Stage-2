import java.util.Scanner;
public class Source {
    public static void main(String[] args) {
        int a=0,b=0,c=0;
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextLine())
            a = sc.nextInt();
        if(sc.hasNextLine())
            b = sc.nextInt();
        if(sc.hasNextLine())
            c = sc.nextInt();
        if(a > b && a > c && b > c)
        {
            if( Math.pow(b,2) + Math.pow(c,2) == Math.pow(a,2) )
            {
                System.out.println("RIGHT ANGLE");
            }
            else
            {
                System.out.println("NOT RIGHT ANGLE");
            }
        }
        else
        {
            System.out.println("INVALID_INPUT");
        }
    }
}
