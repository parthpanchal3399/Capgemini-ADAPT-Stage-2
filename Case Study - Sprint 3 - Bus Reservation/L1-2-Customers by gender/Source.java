import java.util.*;
public class Source 
{
	static String[] maleCustomers= {"Akshay","Saran","Sasi Kumar","Prem"};
	static String[] femaleCustomers= {"Bharathi","Rekah","Priya","Akansha"};
	public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
		String gender = sc.nextLine().toLowerCase();
		switch(gender)
		{
		    case "male":
		    case "m": 
		            for(int i=0; i<maleCustomers.length; i++)
        		    {
        		        System.out.println(maleCustomers[i]);
        		    }
        		    break;
        	case "female":
		    case "f": 
		            for(int i=0; i<femaleCustomers.length; i++)
        		    {
        		        System.out.println(femaleCustomers[i]);
        		    }
        		    break;
        	default: System.out.println("No Customers Available");
		}
	}
}
