import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.naming.InvalidNameException;

interface AdminService
{
    boolean validateAdmin(String email,String password);
}

interface CustomerService
{
    boolean validateCustomer(String email,String password);
}

class Address 
{
  private String city;
  private String state;
  private int zip;
  private String country;
  
  public Address(String city, String state, int zip, String country) {
    super();
    this.city = city;
    this.state = state;
    this.zip = zip;
    this.country = country;
  }
}


class Customer implements Serializable
{
  private int userId;
  private String emailId;
  private String password;
  private String firstName;
  private String lastName;
  private String city;
  private String gender;
  private long phoneNumber;
  private Address address;
  public Customer(int userId, String emailId, String password, String firstName, String lastName, String city,
      String gender, long phoneNumber, Address address)
    {
        super();
        this.userId = userId;
        this.emailId = emailId;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    
    public Customer()
    {
    
    }
    
    public int getUserId()
    {
      return userId;
    }
    public String getEmailId()
    {
      return emailId;
    }
    public String getPassword()
    {
      return password;
    }
    public void setUserId(int userId)
    {
      this.userId=userId;
    }
    public void setEmailId(String emailId)
    {
      this.emailId=emailId;
    }
    public void setPassword(String password)
    {
      this.password=password;
    }
    
    @Override
    public String toString() 
    {
        return "Customer [userId=" + userId + ", emailId=" + emailId + ", password=" + password + ", firstName="
            + firstName + ", lastName=" + lastName + ", city=" + city + ", gender=" + gender + ", phoneNumber="
            + phoneNumber + ", address=" + address + "]";
    }
}

class Admin
{
    private String name;
    private String email;
    private String password;
  
    public Admin()
    {
    
    }
    
    public Admin(String name, String email, String password) 
    {
        super();
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    public String getName()
    {
      return name;
    }
    
    public String getEmail()
    {
      return email;
    }
    
    public String getPassword()
    {
      return password;
    }
    
    public void setName(String name)
    {
      this.name=name;
    }
    
    public void setEmail(String email)
    {
      this.email=email;
    }
    
    public void setPassword(String password)
    {
      this.password=password;
    }
}

class AdminServiceImpl extends CustomerServiceImpl implements AdminService
{
    public static Admin[] adminArray=new Admin[5];
    
    AdminServiceImpl()
    {
        adminArray[0]=new Admin("Krithick","krithick@gmail.com","krithi");
        adminArray[1]=new Admin("Rajan","rajan@gmail.com","rajan#345");
        adminArray[2]=new Admin("Chandrav","chand@gmail.com","wel$234");
        adminArray[3]=new Admin("Ankit","ankit@gmail.com","kit@56");
        adminArray[4]=new Admin("Akilan","akilan@gmail.com","ak*76");
    }
    
    public boolean validateAdmin(String email, String password)
    {
        // TODO Auto-generated method stub
        for(Admin a : adminArray)
        {
            if(a.getEmail().equals(email) && a.getPassword().equals(password))
            {
                return true;
            }
        }
        return false;
    }
}

class CustomerServiceImpl implements CustomerService
{
    public static Customer[] customerArray=new Customer[5];
    
    public CustomerServiceImpl()
    {
        customerArray[0]=
            new Customer(101,"raj@gmail.com","xxxxxx","Raj","Kunar","Chennai","Male",
              9001018761l,new Address("Chennai","TamilNadu",600075,"India"));
        customerArray[1]=
            new Customer(102,"krithick@gmail.com","xxxxxx","Krithick","Rajan","Chennai","Male",
              9001018761l,new Address("Chennai","TamilNadu",600075,"India"));
        customerArray[2]=
            new Customer(103,"chandrav@gmail.com","xxxxxx","Chandrav","Rajan","Bangalore","Male",
              9001018761l,new Address("Chennai","TamilNadu",600075,"India"));
      customerArray[3]=
          new Customer(104,"rajan@gmail.com","xxxxxx","Rajan","Arun","Bangalore","Male",
              9001018761l,new Address("Chennai","TamilNadu",600075,"India"));
      customerArray[4]=
          new Customer(105,"akshay@gmail.com","xxxxxx","Akshay","Kumar","Mumbai","Male",
              9001018761l,new Address("Chennai","TamilNadu",600075,"India"));
    }

    @Override
    public boolean validateCustomer(String email, String password) 
    {
        // TODO Auto-generated method stub
        for(Customer c : customerArray)
        {
            if(c.getEmailId().equals(email) && c.getPassword().equals(password))
            {
                return true;
            }
        }
        return false;
    }
}

public class Source
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1)
        {
            String email=sc.next();
            String password=sc.next();
            CustomerServiceImpl cs=new CustomerServiceImpl();
            boolean flag=cs.validateCustomer(email,password);
            if(flag)
            {
                System.out.println("Display Services");
                System.out.println("BookingDetails of the logged in Customer");
            }
        }
        else if(n==2)
        {
            String email=sc.next();
            String password=sc.next();
            AdminService as=new AdminServiceImpl();
            boolean flag=as.validateAdmin(email,password);
            if(flag)
            {
                System.out.println("1.Insert ServiceDetails"+"\n2.Update ServiceDetails"+"\nDelete ServiceDetails"+"\nSearch ServiceDetails");
            }
        }
    }
}             