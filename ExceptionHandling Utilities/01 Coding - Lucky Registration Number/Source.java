import java.util.*;
import java.util.regex.*;

class Source
{
    public static int checkRegistrationNumber(String reg)
    {
        //0 : valid
        //-1 : invalid
        // 1 : valid + lucky
        if(reg == null)
            return -1;
        
        if ( reg.isEmpty() )
         return -1;
         
        String regex = 
        "(KA|DL)(01|02|03|04|05|06|07|08|09|10)[A-Z]{1,2}[1-9]{1}[0-9]{3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(reg);
        
        if (matcher.matches())
        {
            //get the number YYYY
            int number = Integer.parseInt(reg.substring(reg.length() - 4, reg.length()));
            int sum = 0;
            while (number > 0 || sum > 9)
            {
                if (number == 0) 
                {
                   number = sum;
                   sum = 0;
                }
                int rem = number % 10;
                sum = sum + rem;
                number /= 10;
            }
            
            if (sum == 6) //lucky
            {
                return 1;
            }
            return 0;
        }
        return -1;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String reg = sc.nextLine();
        int res = Source.checkRegistrationNumber(reg);
        if(res == -1)
            System.out.println("Invalid registration number");
        else if(res == 0)
            System.out.println("Valid registration number");
        else if(res == 1)
            System.out.println("Lucky registration number");
    }
}

