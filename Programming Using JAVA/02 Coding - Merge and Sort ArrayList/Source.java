import java.util.*;
public class Source {
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    List<Integer> al1 = new ArrayList<Integer>();
	    List<Integer> al2 = new ArrayList<Integer>();
	    for(int i=0; i<5; i++)
	    {
	        if(sc.hasNextLine())
	        	al1.add(sc.nextInt());
	        else
	        	throw new IllegalArgumentException();
	    }
	    for(int i=0; i<5; i++)
	    {
	        if(sc.hasNextLine())
	        	al2.add(sc.nextInt());
	        else
	        	throw new IllegalArgumentException();
	    }
	    System.out.println(mergeAndSort(al1, al2));
	}
	
	public static List<Integer> mergeAndSort(List<Integer> al1, List<Integer> al2) 
	{
	    List<Integer> tmp = new ArrayList<Integer>();
	    List<Integer> result = new ArrayList<Integer>();
	    tmp.addAll(al1);
	    tmp.addAll(al2);
	    Collections.sort(tmp);
	    result.add(tmp.get(2));
	    result.add(tmp.get(6));
	    result.add(tmp.get(8));
	    return result;
	}
}
