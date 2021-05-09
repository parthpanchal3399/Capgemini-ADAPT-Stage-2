class BookingDetails
{
    private int bookingId;
    private int customerId;
    private int userId;
    private String status;
    
    BookingDetails(){
    }
    
    BookingDetails(int bookingId,int customerId,int userId,String status)
    {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.userId = userId;
        this.status = status;
    }
    
    public int getBookingId()
    {
        return bookingId;
    }
    
    public void setBookingId(int bookingId)
    {
        this.bookingId = bookingId;
    }
    
    public int getCustomerId()
    {
        return customerId;
    }
    
    public void setCustomerId(int customerId)
    {
        this.customerId = customerId;
    }
    
    public int getUserId()
    {
        return userId;
    }
    
    public void setUserId(int userId)
    {
        this.userId = userId;
    }
    
    public String getStatus()
    {
        return status;
    }
    
    public void setStatus(String status)
    {
        this.status = status;
    }
}
interface BookingDetailsService
{
    void addBookingDetails(BookingDetails bookingDetails);
    BookingDetails updateBookingDetails(BookingDetails bookingDetails);
    void deleteBookingDetails(int bookingId);
    BookingDetails[] getBookingDetails();
    BookingDetails[] searchByUserId(int customerId);
    BookingDetails[] searchByBookingId(int bookingId);
}

class BookingDetailsServiceImpl implements BookingDetailsService
{
    public static BookingDetails[] bookingDetailsArray = new BookingDetails[5];
    public void addBookingDetails(BookingDetails bookingDetails)
    {
        for(int i=0,j = bookingDetailsArray.length ; i<j ;i++)
        {
            if( bookingDetailsArray[i] == null )
            {
                bookingDetailsArray[i] =bookingDetails;
                break;
            }
        }
    }
    
    public BookingDetails updateBookingDetails(BookingDetails bookingDetails)
    {
        int i = 0 ;
        int j = bookingDetailsArray.length;
        for(; i < j; i++)
        {
            if( bookingDetailsArray[i].getBookingId() == bookingDetails.getBookingId() )
            {
                bookingDetailsArray[i] = bookingDetails;
                return bookingDetails;
            }
        }
        return null;
    }
    
    public void deleteBookingDetails(int bookingId)
    {
        int i = 0 ;
        int j = bookingDetailsArray.length;
        for(; i < j; i++)
        {
            if( bookingDetailsArray[i].getBookingId() == bookingId )
            {
                bookingDetailsArray[i] = null;
                break;
            }
        }
    }
    
    public BookingDetails[] getBookingDetails(){
        return bookingDetailsArray;
    }
    public BookingDetails[] searchByCustomerId(int customerId)
    {
        int i = 0 ;
        int j = bookingDetailsArray.length;
        BookingDetails[] customerBookingDetails = new BookingDetails[2];
        int k = 0;
        for(; i < j; i++)
        {
            if( bookingDetailsArray[i].getCustomerId() == customerId )
            {
                customerBookingDetails[k++] = bookingDetailsArray[i];
                if( k == 2 )
                {
                    return customerBookingDetails;
                }
            }
        }
        return customerBookingDetails;
    }
    
    public BookingDetails[] searchByUserId(int userId)
    {
        int i = 0 ;
        int j = bookingDetailsArray.length;
        BookingDetails[] customerBookingDetails = new BookingDetails[2];
        int k = 0;
        for(; i < j; i++){
            if( bookingDetailsArray[i].getUserId() == userId )
            {
                customerBookingDetails[k++] = bookingDetailsArray[i];
                if( k == 2 )
                {
                    return customerBookingDetails;
                }
            }
        }
        return customerBookingDetails;
    }
    
    public BookingDetails[] searchByBookingId(int bookingId)
    {
        int i = 0 ;
        int j = bookingDetailsArray.length;
        BookingDetails[] customerBookingDetails = new BookingDetails[2];
        int k = 0;
        for(; i < j; i++)
        {
            if( bookingDetailsArray[i].getBookingId() == bookingId )
            {
                customerBookingDetails[k++] = bookingDetailsArray[i];
                if( k == 2 )
                {
                    return customerBookingDetails;
                }
            }
        }
        return customerBookingDetails;
    }
}

interface UserService
{
    void addBookingDetails(BookingDetails bookingDetails);
    BookingDetails[] getBookingDetails(int userId);
}

class UserServiceImpl implements UserService
{
    public void addBookingDetails(BookingDetails bookingDetails)
    {
        new BookingDetailsServiceImpl().addBookingDetails(bookingDetails);
    }
    
    public BookingDetails[] getBookingDetails(int userId)
    {
        return new BookingDetailsServiceImpl().searchByUserId( userId );
    }
}