import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.naming.InvalidNameException;

class Customer
{
    private String firstName;
    private String lastName;
    
    //default constructor
    Customer()
    {
    }
    
    //parameterized constructor
    Customer(String firstName, String lastName) throws InvalidNameException
    {
    	
    	if(firstName.length()<6 || lastName.length()<6)
    	{
    		throw new InvalidNameException();
    	}
    	else
    	{
    		this.firstName = firstName;
    		this.lastName = lastName;
    	}
        
    	Pattern pattern = Pattern.compile("[A-Za-z]");
    	Matcher matcher1 = pattern.matcher(firstName);
    	Matcher matcher2 = pattern.matcher(lastName);
    	boolean isSpChar1 = matcher1.find();
    	boolean isSpChar2 = matcher2.find();
    	
    	if(isSpChar1 || isSpChar2)
    	{
    		throw new InvalidNameException();
    	}
    	else
    	{
    		this.firstName = firstName;
    		this.lastName = lastName;
    	}
    }
    
    //getters
    public String getFirstName()
    {
        return this.firstName;
    }
    
    public String getLastName()
    {
        return this.lastName;
    }
    

    public void setFirstName(String a) throws InvalidNameException
    {
    	if(a.length()<6)
    	{
    		throw new InvalidNameException();
    	}
    	else
    	{
    		this.firstName = a;
    	}
    	
    	Pattern pattern = Pattern.compile("[A-Za-z]");
    	Matcher matcher1 = pattern.matcher(a);
    	boolean isSpChar1 = matcher1.find();
    	if(isSpChar1)
    	{
    		throw new InvalidNameException();
    	}
    	else
    	{
    		this.firstName = a;
    	}
    }
    
    public void setLastName(String a) throws InvalidNameException
    {
    	if(a.length()<6)
    	{
    		throw new InvalidNameException();
    	}
    	else
    	{
    		this.lastName = a;
    	}
    	
    	Pattern pattern = Pattern.compile("[A-Za-z]");
    	Matcher matcher2 = pattern.matcher(a);
    	boolean isSpChar2 = matcher2.find();
    	if(isSpChar2)
    	{
    		throw new InvalidNameException();
    	}
    	else
    	{
    		this.lastName = a;
    	}
    }
    
    //toString
    @Override
    public String toString()
    {
        return String.format("Customer [firstName=%s, lastName=%s]", firstName, lastName);
    }
    
}
//No need to create main class as it's not checked in the test cases
