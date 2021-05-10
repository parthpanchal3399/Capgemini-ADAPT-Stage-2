import java.util.*;
public class Source {
    public static List<String> sort(String s) {
        if (s == null)
            return new ArrayList<String>();
        else
        {
            String words[] = s.split(" ");
            ArrayList<String> arr = new ArrayList<String>(Arrays.asList(words));
            Collections.sort(arr);
            return arr;
        }
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    if(sc.hasNextLine())
	    	System.out.println(sort(sc.nextLine()));
	}
}
