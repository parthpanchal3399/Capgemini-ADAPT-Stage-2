import java.util.*;
public class Source {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        int binary[] = new int[40]; 
        if(n<1 || n>999)
        {
            System.out.println("INVALID_INPUT");
        }
        else
        {
            while(n > 0)
            {
                binary[i++] = n%2;
                n /= 2;
            }
            for(int j=i-1; j>=0; j--)
            {
                System.out.print(binary[j]);
            }
        }
    }
}
