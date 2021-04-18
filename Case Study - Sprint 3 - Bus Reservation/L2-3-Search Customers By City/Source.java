import java.util.*;
public class Source {
    // Binary Search not possible for given input
    // Since given data has repeated values for "Chennai"
    // Will update the code once this is fixed
    static String customerDetails[][]=new String[5][3];
    Source()
    {
        customerDetails[0][0]="1001";
        customerDetails[0][1]="Raj";
        customerDetails[0][2]="Chennai";
        
        customerDetails[1][0]="1008";
        customerDetails[1][1]="Akshay";
        customerDetails[1][2]="Pune";
        
        customerDetails[2][0]="1002";
        customerDetails[2][1]="Simran";
        customerDetails[2][2]="Amritsar";
        
        customerDetails[3][0]="1204";
        customerDetails[3][1]="Gaurav";
        customerDetails[3][2]="Delhi";
        
        customerDetails[4][0]="1005";
        customerDetails[4][1]="Ganesh";
        customerDetails[4][2]="Chennai";
    }
	
	public static void main(String args[] ) throws Exception {
	    Scanner sc = new Scanner(System.in);
	    Source o = new Source();
	    String key = sc.nextLine();
		boolean flag = false;
		for(int i=0; i<customerDetails.length; i++)
		{
		    if(customerDetails[i][2].equalsIgnoreCase(key))
		    {
			for(int j=0; j<3; j++)
			{
			    System.out.println(customerDetails[i][j]);
			    flag = true;
			}
		    }
		}
		if(!flag)
		{
		    System.out.println("No Record Found");
		}
	}
	}
