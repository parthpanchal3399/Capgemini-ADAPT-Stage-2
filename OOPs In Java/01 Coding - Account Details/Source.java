import java.util.*;

class Account
{
    int accountNo;
    double balance;
    String accountType;
    static int counter;
    
    Account(double balance, String accountType)
    {
        this.balance = balance;
        this.accountType = accountType;
        this.accountNo = ++this.counter;
    }
    
    public void depositAmount(double amount)
    {
        this.balance = this.balance + amount;
    }
    
    public void printAccountDetails()
    {
        String s = String.format("[Acct No : %d, Type : %s, Balance : %.1f]",
                            this.accountNo, this.accountType, this.balance);
        System.out.println(s);
    }
}

class Source    //class name should be Source 
{
    public static void main(String args[])
    {
        String s1[], s2[];
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine().split(" ");
        s2 = sc.nextLine().split(" ");
        
        Account a1 = new Account(Double.parseDouble(s1[0]), s1[1]);
        a1.printAccountDetails();
        
        a1.depositAmount(Double.parseDouble(s1[2]));
         System.out.println("New Balance : " + a1.balance);
        
        Account a2 = new Account(Double.parseDouble(s2[0]), s2[1]);
        a2.printAccountDetails();
        
        a2.depositAmount(Double.parseDouble(s2[2]));
        System.out.println("New Balance : " + a2.balance);
    }
}
