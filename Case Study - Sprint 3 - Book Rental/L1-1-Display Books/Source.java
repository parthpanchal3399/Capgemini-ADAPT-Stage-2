import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class Source {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>();
		
		for(int i = 0; i < 5; i++){
		    if(sc.hasNextLine())		// covers java.util.NoSuchElementException: No line found
		    	list.add(sc.nextLine());

		}
		    
		Collections.sort(list);   		// covers NullPointerException using java.util.Arrays.sort()
		Iterator itr=list.iterator();
		while(itr.hasNext()){
		    System.out.println(itr.next());
		}

	}
}

// We're using ArrayList for Dynamic arrays. The Prob statement says 5 string inp actually means MAX 5 inp. They're free to
// use less than 5 too. In which case we'll have NULLs in our static array which would then introduce 2 exceptions at 
// sc.nextLine() and sort()
