
import java.util.Scanner;

public class Source{
    // Code here
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int res = Source.getMaxDigit(input);
        if(res == -1)
        {
            System.out.println("No digits in string");
        }
        else
        {
            System.out.println(res);
        }
    }
    
    public static int getMaxDigit(String input)
    {
        if(input==null || input.isEmpty())
            return -1;
        input = input.replaceAll("\\s", "");
        int max = Integer.MIN_VALUE;
        for(int i=0; i<input.length(); i++)
        {
            if(Character.isDigit(input.charAt(i)))
            {
                int val = Character.getNumericValue(input.charAt(i));
                if(val > max)
                {
                    max = val;
                }
            }
        }
        if(max == Integer.MIN_VALUE)
            return -1;
        else
            return max;
    }
}
