import java.util.*;
public class Source {
  
    static String customerDetails[][]=new String[5][3];
    static {
	customerDetails[0][0]="1001";
	customerDetails[0][1]="Raj";
	customerDetails[0][2]="Chennai";
	
	customerDetails[1][0]="1008";
	customerDetails[1][1]="Akshay";
	customerDetails[1][0]="Pune";
	
	customerDetails[2][0]="1002";
	customerDetails[2][1]="Simrath";
	customerDetails[2][2]="Amristar";
	
	customerDetails[3][0]="1204";
	customerDetails[3][1]="Gaurav";
	customerDetails[3][2]="Delhi";
	
	customerDetails[4][0]="1005";
	customerDetails[4][1]="Ganesh";
	customerDetails[4][2]="Chennai";
    }
    
	public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
		String key = sc.nextLine();
		int index = -1;
		Boolean found = false;
		for(int i=0; i<customerDetails.length; i++)
		{
		    if(key.equalsIgnoreCase(customerDetails[i][1]))
		    {
		        found = true;
		        index = i;
		        break;
		    }
		}
		
		if(found)
		{
		    for(int i=0; i<3; i++)
		    {
		        System.out.println(customerDetails[index][i]);
		    }
		}
		else
		{
		    System.out.println("No Record Found");
		}
	}
}
