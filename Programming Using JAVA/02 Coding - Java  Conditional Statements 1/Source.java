import java.util.Scanner;
public class Source {
    public static void main(String[] args) {
        int m1, m2, m3;
        double avg=0.0;
        Scanner sc = new Scanner(System.in);
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        if( (m1<0 || m2<0 || m3<0) || (m1>100 || m2>100 || m3>100) )
        {
            System.out.println("INVALIDMARKS");
        }
        else
        {
            avg = (m1 + m2 + m3)/3.0;
            if(avg >= 70)
                System.out.println("DISTINCTION");
            else if(avg < 70 && avg >=60)
                System.out.println("FIRST");
            else if(avg < 60 && avg >=50)
                System.out.println("SECOND");
            else if(avg < 50 && avg >=40)
                System.out.println("THIRD");
            else if(avg < 40)
                System.out.println("FAIL");
        }
    }
}
