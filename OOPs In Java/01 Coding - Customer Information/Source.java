import java.util.*;

class SimpleDate
{
    private int day;
    private int month;
    private int year;
    
    SimpleDate(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
        validateDate(this);
    }
    
    //getters
    public int getDay()
    {
        return this.day;
    }
    
    public int getMonth()
    {
        return this.month;
    }
    
    public int getYear()
    {
        return this.year;
    }
    
    //setter
    public void setDate(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public static boolean validateDate(SimpleDate d)
    {
        int day = d.getDay();
        int month = d.getMonth();
        int year = d.getYear();
        
        if(year < 2000)
            return false;
        if(month > 12 || month < 1)
            return false;
        
        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(day < 1 || day > 31)
                    return false;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if(day < 1 || day > 30)
                    return false;
                break;
            case 2:
                if(day < 1 || day > 28)
                    return false;
                break;
        }
        return true;
    }
    
    @Override
    public String toString()
    {
        return (day + "/" + month + "/" + year);
    }
}

class Address 
{
    private String area;
    private String city;
    
    Address(String area, String city)
    {
        this.area = area;
        this.city = city;
    }
    
    //getters
    public String getArea()
    {
        return this.area;
    }
    
    public String getCity()
    {
        return this.city;
    }
    
    //setters
    public void setArea(String area)
    {
        this.area = area;
    }
    
    public void setCity(String city)
    {
        this.city = city;
    }
    
    @Override
    public String toString()
    {
        return (area + ", " + city);
    }
}

class Customer
{
    private int custId;
    private String name;    //wrong in question
    private Address address;
    private SimpleDate registrationDate;
    
    Customer(int custId, String name, Address address, SimpleDate registrationDate)
    {
        this.custId = custId;
        this.name = name;
        this.address = address;
        if(!SimpleDate.validateDate(registrationDate))
        {
            this.registrationDate = null;
        }
        else
        {
            this.registrationDate = registrationDate;
        }
    }
    //getters
    public Address getAddress()
    {
        return this.address;
    }
    
    public SimpleDate getRegistrationDate()
    {
        return this.registrationDate;
    }
    
    //setters
    public void setAddress(Address address)
    {
        this.address = address;
    }
    
    public void setRegistrationDate(SimpleDate date)
    {
        if(!SimpleDate.validateDate(date))
        {
            this.registrationDate = null;
        }
        else
        {
            this.registrationDate = registrationDate;
        }
    }
    
    @Override
    public String toString() 
    {
        String date = "";
        if(this.registrationDate == null)
            date = "Unknown";
        else
            date = this.registrationDate.toString();
        
        String add = "";
        if(this.address == null)
            add = "Unknown";
        else
            add = this.address.toString();

        String s = String.format("Id : %d, Name : %s\n" +
                                 "Address : %s\n" +
                                 "Registered on : %s",
                                 custId, name,
                                 add,
                                 date);
        return s;
    }
}

public class Source
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1[] = sc.nextLine().split(" ");
        String s2[] = sc.nextLine().split(" ");
        String s3[] = sc.nextLine().split(" ");
        
        int id = Integer.parseInt(s1[0]);
        String name = s1[1];
        String area = s2[0];
        String city = s2[1];
        int day = Integer.parseInt(s3[0]);
        int month = Integer.parseInt(s3[1]);
        int year = Integer.parseInt(s3[2]);
        
        SimpleDate date = new SimpleDate(day, month, year);
        Address add = new Address(area, city);
        
        Customer c = new Customer(id, name, add, date);
        System.out.println(c);
    }
}
