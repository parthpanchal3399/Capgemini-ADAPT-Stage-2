import java.util.*;
// Class name should be "Source",
// otherwise solution won't be accepted
public class Source {
	public static void main(String args[] ) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		String[] s = new String[5];
		for(int i = 0; i < 5; i++)
		    s[i] = sc.nextLine();
		
		Arrays.sort(s);
		for(String a : s)
		    System.out.println(a);
	}
}
