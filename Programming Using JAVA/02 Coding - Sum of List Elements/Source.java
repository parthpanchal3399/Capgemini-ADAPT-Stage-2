import java.util.*;

public class Source {
	public static List<Integer> getSumOfListElements(List<Integer> first,List<Integer> second){
	    List<Integer> result = new ArrayList<Integer>();
	    if (first == null && second == null )
	    {
	        return result;
	    }
	    if (first == null) 
	    {
	        return second;
        }
        if (second == null) 
        {
            return first;
        }
	    int s1 = first.size();
        int s2 = second.size();
        int max = (s1>=s2) ? s1 : s2;
        for(int i=0; i<max-Math.abs(s1-s2); i++)
        {
            result.add(i, first.get(i) + second.get(i));
        }
        for(int i=result.size(); i<max; i++)
        {
            if(first.size() == max)
                result.add(i, first.get(i));
            else if(second.size() == max)
                result.add(i, second.get(i));
        }
        return result;
	}

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    List<Integer> first = new ArrayList<Integer>();
	    List<Integer> second = new ArrayList<Integer>();
	    String s1 = sc.nextLine();
	    s1 = s1.substring(1, s1.length()-1);
        String nums1[] = s1.split(", ");
        for(int i=0; i< nums1.length; i++)
	    {
	        first.add(Integer.parseInt(nums1[i]));
	    }

        String s2 = sc.nextLine();
        s2 = s2.substring(1, s2.length()-1);
        String nums2[] = s2.split(", ");
        for(int i=0; i< nums2.length; i++)
	    {
	        second.add(Integer.parseInt(nums2[i]));
	    }
        System.out.println(getSumOfListElements(first, second));
	}
}
