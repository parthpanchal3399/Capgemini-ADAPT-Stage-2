import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class Source {
	public static void main(String args[] ) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		String[][] s = new String[5][3];
		for(int i = 0; i < 5; i++)
			s[i][0] = "0";
		
		for(int i = 0; i < 5; i++)
		    for(int j = 0; j < 3; j++)
				if(sc.hasNextLine())
					s[i][j] = sc.nextLine();
		        
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4 - i; j++) {
                
                int a = Integer.parseInt(s[j][0]);
                int b = Integer.parseInt(s[j + 1][0]);
                
                if(a > b)
                    swap(s, j);
            }
        }
        
        for(int i = 0; i < 5; i++) 
            for(int j = 0; j < 3; j++) 
                System.out.println(s[i][j]);
            
	}
	
	private static void swap(String[][] a, int i) {
	    for(int j = 0; j < 3; j++) {
	        String temp = a[i][j];
            a[i][j] = a[i + 1][j];
            a[i + 1][j] = temp;
	    }
	}
}
