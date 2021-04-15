import java.util.Scanner;
public class Source {
    public static void main(String[] args) {
        int n, sum=0, original, digit;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n<100 || n>999)
        {
            System.out.print("INVALID_INPUT");
        }
        else
        {
            original = n;
            while(n > 0)
            {
                digit = n%10;
                sum += Math.pow(digit, 3);
                n /= 10;
            }
            if(sum == original)
            {
                System.out.print("ARMSTRONG");
            }
            else
            {
                System.out.print("NOT ARMSTRONG");
            }
        }
    }
}
