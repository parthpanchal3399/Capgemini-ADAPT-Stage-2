import java.util.*;

class ColourCodeValidator 
{
    //question expects to write the static method here, however testcases expect 
    //to write the methods in Source class ;_;
}

class Source
{
    
    public static int validateHexCode(String code)
    {
        if(code.startsWith("#"))
        {
            if(code.length() == 7)
            {
                for(int i=1; i < code.length(); i++)
                {
                    if((code.charAt(i) >= 'A' && code.charAt(i) <= 'F')
                        || (code.charAt(i) >= '0' && code.charAt(i) <= '9'))
                    {
                        continue;
                    }
                    else
                    {
                        return -1;
                    }
                }
                return 1;
            }
        }
        return -1;
    }
    
    public static int validateDecimalCode(String code)
    {
        if(code.startsWith("rgb(") && code.endsWith(")"))
        {
            code = code.substring(4, code.length()-1);
            String ranges[] = code.split(",");
            for (String str : ranges) 
            {
                try 
                {
                   int number = Integer.parseInt(str);
                   if (number >= 0 && number <= 255) 
                   {
                      continue;
                   } 
                   else 
                   {
                      return -1;
                   }
                } 
                catch (Exception e) 
                {
                   return -1;
                }
            }
            return 1;
        }
        return -1;
    }
    
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String line[] = sc.nextLine().split(" ");
        int ch = Integer.parseInt(line[0]);
        String code = line[1];
        
        switch(ch)
        {
            case 1:
                if(Source.validateHexCode(code) == 1)
                    System.out.println("Valid Code");
                else
                    System.out.println("Invalid Code");
                break;
            case 2:
                if(Source.validateDecimalCode(code) == 1)
                    System.out.println("Valid Code");
                else
                    System.out.println("Invalid Code");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}

