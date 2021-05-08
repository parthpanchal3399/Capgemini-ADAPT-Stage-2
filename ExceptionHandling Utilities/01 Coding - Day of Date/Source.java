import java.text.SimpleDateFormat;  
import java.text.ParseException;  
import java.util.*;  

public class Source {
	public static void main(String[] args) throws ParseException {
	    Scanner sc = new Scanner(System.in);
        String datestr = sc.nextLine();
        System.out.println(Source.getDayOfDate(datestr));
	}
	
public static String getDayOfDate(String datestr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
        SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE"); 
        Date date;
        try
        {
            date = sdf.parse(datestr);
            return sdf2.format(date);
        }
        catch(ParseException e)
        {
            System.out.println(e);
        }
        return null;
    }
}
