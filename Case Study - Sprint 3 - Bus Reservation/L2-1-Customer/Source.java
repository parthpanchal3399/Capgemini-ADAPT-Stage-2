import java.util.*;
public class Source {
	public static void main(String args[] ) throws Exception {
	    String customerArray[][] = new String[5][3];
	    int idArray[] = new int[5];
	    String temp[] = new String[3];
	    Scanner sc = new Scanner(System.in);
	    for(int i=0; i<5; i++)
	    {
	        for(int j=0; j<3; j++)
	        {
	            customerArray[i][j] = sc.nextLine();
	            if(j==0)
	            {
	                idArray[i] = Integer.parseInt(customerArray[i][j]);
	            }
	        }
	    }
        
        //bubble sort
	    for(int i=0; i<5; i++)  //rows
	    {
	        for(int j=0; j<(5-i-1); j++)  //cols
	        {
                if(Integer.parseInt(customerArray[j][0]) > Integer.parseInt(customerArray[j+1][0]))
                {
                    temp = customerArray[j];
                    customerArray[j] = customerArray[j+1];
                    customerArray[j+1] = temp;
                }
	        }
	    }
	    
	    for(int i=0; i<5; i++)
	    {
	        for(int j=0; j<3; j++)
	        {
	            System.out.println(customerArray[i][j]);
	        }
	    }
	}
}
