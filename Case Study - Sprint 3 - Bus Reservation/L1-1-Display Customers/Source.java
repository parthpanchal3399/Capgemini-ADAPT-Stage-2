import java.util.*;
public class Source {
	public static void main(String args[] ) throws Exception {
	    String arr[] = new String[5];
	    Scanner sc = new Scanner(System.in);
	    for(int i=0; i<5; i++)
	    {
	        arr[i] = sc.nextLine();
	    }
	    Arrays.sort(arr);
	    for(String s : arr)
	    {
	        System.out.println(s);
	    }
	}
}
