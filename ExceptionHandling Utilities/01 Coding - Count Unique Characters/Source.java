import java.util.Scanner;

public class Source {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    int res = Source.getUniqueCharacterCount(str);
	    if(res == -1)
	        System.out.println("No unique character/s");
	    else
	        System.out.println(res + " unique character/s");
	 }

    public static int getUniqueCharacterCount(String str)
    {
        str = str.replaceAll("\\s", "");
        str = str.toLowerCase();
        int count = 0;
        for(int i=0; i < str.length(); i++)
        {
            boolean contains = false;
            for (int j = 0; j < str.length(); j++)
            {
                if(str.charAt(i) == str.charAt(j) && i!=j)
                {
                    contains = true;
                    break;
                }
            }
            if(!contains)
                count++;
        }
        
        if(count>0)
            return count;
        
        return -1;
    }

}
