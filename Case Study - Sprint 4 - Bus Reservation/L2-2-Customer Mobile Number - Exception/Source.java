import java.util.regex.Pattern;
import java.util.regex.Matcher;

class InvalidPhoneNumberExcception extends Exception
{
	InvalidPhoneNumberExcception()
	{
		super();
	}
}

class Customer
{
    private long phoneNumber;
    
    //default constructor
    Customer()
    {
    }
    
    //parameterized constructor
    Customer(long phoneNumber) throws InvalidPhoneNumberExcception
    {
    	Pattern pattern = Pattern.compile("^[6-9][0-9]{9}$");
    	Matcher matcher = pattern.matcher(Long.toString(phoneNumber));
    	
    	if(matcher.matches())
    	{
    		this.phoneNumber = phoneNumber;
    	}
    	else
    	{
    		try
    		{
    			throw new InvalidPhoneNumberExcception();
    		}
    		catch(InvalidPhoneNumberExcception e)
    		{
    			if(e instanceof InvalidPhoneNumberExcception)
    			{
    				throw new InvalidPhoneNumberExcception();
    			}
    		}
    	}
    }
    
    //getters
    public long getPhoneNumber()
    {
        return this.phoneNumber;
    }
   
    //setters
    public void setPhoneNumber(long a) throws InvalidPhoneNumberExcception
    {
    	Pattern pattern = Pattern.compile("^[6-9][0-9]{9}$");
    	Matcher matcher = pattern.matcher(Long.toString(a));
    	
    	if(matcher.matches())
    	{
    		this.phoneNumber = a;
    	}
    	else
    	{
    		try
    		{
    			throw new InvalidPhoneNumberExcception();
    		}
    		catch(InvalidPhoneNumberExcception e)
    		{
    			if(e instanceof InvalidPhoneNumberExcception)
    			{
    				throw new InvalidPhoneNumberExcception();
    			}
    		}
    	}
    }
}

//No need to create main class as it's not checked in the test cases

