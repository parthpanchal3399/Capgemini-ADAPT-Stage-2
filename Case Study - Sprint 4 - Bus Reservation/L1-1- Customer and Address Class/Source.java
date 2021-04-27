//THEY TURNED OFF AUTOCOMPLETE FOR VARIABLE NAMES!! ><
class Customer
{
    private int userId;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String city;
    private String gender;
    private long phoneNumber;
    private Address address;
    
    //default constructor
    Customer()
    {
    }
    
    //parameterized constructor
    Customer(int userId, String email, String password, String firstName, String lastName
    , String city, String gender, long phoneNumber, Address address)
    {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    
    //getters
    public int getUserId()
    {
        return this.userId;
    }
    
    public String getEmailId()
    {
        return this.email;
    }
    
    public String getPassword()
    {
        return this.password;
    }
    
    public String getFirstName()
    {
        return this.firstName;
    }
    
    public String getLastName()
    {
        return this.lastName;
    }
    
    public String getCity()
    {
        return this.city;
    }
    
    public String getGender()
    {
        return this.gender;
    }
    
    public long getPhoneNumber()
    {
        return this.phoneNumber;
    }
    
    public Address getAddress()
    {
        return this.address;
    }
    
    //setters
    public void setUserId(int uid)
    {
        this.userId = uid;
    }
    
    public void setEmailId(String a)
    {
        this.email = a;
    }
    
    public void setPassword(String a)
    {
        this.password = a;
    }
    
    public void setFirstName(String a)
    {
        this.firstName = a;
    }
    
    public void setLastName(String a)
    {
        this.lastName = a;
    }
    
    public void setCity(String a)
    {
        this.city = a;
    }
    
    public void setGender(String a)
    {
        this.gender = a;
    }
    
    public void setPhoneNumber(long a)
    {
        this.phoneNumber = a;
    }
    
    public void setAddress(Address a)
    {
        this.address = a;
    }
    
    //toString
    @Override
    public String toString()
    {
        return String.format("Customer [userId=%d, emailId=%s, password=%s, firstName=%s, lastName=%s, city=%s, gender=%s, phoneNumber=%d, address=%s]",
                        userId, email, password, firstName, lastName, city, gender, phoneNumber, address);
    }
    
}

class Address
{
    private String city;
    private String state;
    private int zip;
    private String country;
    
    //default Constructor
    Address()
    {
    }
    
    //Parameterized constructor
    Address(String city, String state, int zip, String country)
    {
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }
    
    //getter
    public String getCity()
    {
        return this.city;
    }
    
    public String getState()
    {
        return this.state;
    }
    
    public int getZip()
    {
        return this.zip;
    }
    
    public String getCountry()
    {
        return this.country;
    }
    
    //setters
    public void setCity(String a)
    {
        this.city = a;
    }
    
    public void setState(String a)
    {
        this.state = a;
    }
    
    public void setZip(int a)
    {
        this.zip = a;
    }
    
    public void setCountry(String a)
    {
        this.country = a;
    }
    
    //toString
    @Override
    public String toString()
    {
        return String.format("Address [city=%s, state=%s, zip=%d, country=%s]",
                            city, state, zip, country);
    }   
}


//No need to create main class as it's not checked in the test cases
