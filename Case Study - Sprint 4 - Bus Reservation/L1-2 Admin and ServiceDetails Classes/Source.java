import java.time.LocalDateTime;

class Admin
{
	private int adminId;
	private String email;
	private String firstName;
	private String lastName;
	private String password;
	
	public Admin() 
	{
	}
	
	public Admin(int adminId, String email, String firstName, String password) 
	{
		this.adminId = adminId;
		this.email = email;
		this.firstName = firstName;
		this.password = password;
	}

	//getters & setters
	public int getAdminId() 
	{
		return adminId;
	}

	public String getEmailId() 
	{
		return email;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setAdminId(int adminId) 
	{
		this.adminId = adminId;
	}

	public void setEmailId(String email)
	{
		this.email = email;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	@Override
	public String toString() 
	{
		return "Admin [adminId=" + adminId + ", emailId=" + email + ", firstName=" + firstName 
		+ ", password=" + password + "]";
	}
}

class ServiceDetails 
{
	private int serviceId;
	private int busId;
	private LocalDateTime depDateTime;
	private LocalDateTime arrDateTime;
	private String arrCity;
	private String deptCity;
	private double cost;
	private int seatsLeft;
	private int totalSeats;
	
	public ServiceDetails() 
	{
	
	}

	public ServiceDetails(int serviceId, int busId, LocalDateTime depDateTime, LocalDateTime arrDateTime,
			String arrCity, String deptCity, double cost, int seatsLeft, int totalSeats) 
	{
		this.serviceId = serviceId;
		this.busId = busId;
		this.depDateTime = depDateTime;
		this.arrDateTime = arrDateTime;
		this.arrCity = arrCity;
		this.deptCity = deptCity;
		this.cost = cost;
		this.seatsLeft = seatsLeft;
		this.totalSeats = totalSeats;
	}

	//getters & setters
	public int getServiceId() 
	{
		return serviceId;
	}

	public int getBusId() 
	{
		return busId;
	}

	public LocalDateTime getDepDateTime() 
	{
		return depDateTime;
	}

	public LocalDateTime getArrDateTime()
	{
		return arrDateTime;
	}

	public String getArrCity()
	{
		return arrCity;
	}

	public String getDeptCity()
	{
		return deptCity;
	}

	public double getCost() 
	{
		return cost;
	}

	public int getSeatsLeft() 
	{
		return seatsLeft;
	}

	public int getTotalSeats() 
	{
		return totalSeats;
	}

	public void setServiceId(int serviceId)
	{
		this.serviceId = serviceId;
	}

	public void setBusId(int busId) 
	{
		this.busId = busId;
	}

	public void setDepDateTime(LocalDateTime depDateTime) 
	{
		this.depDateTime = depDateTime;
	}

	public void setArrDateTime(LocalDateTime arrDateTime)
	{
		this.arrDateTime = arrDateTime;
	}

	public void setArrCity(String arrCity) 
	{
		this.arrCity = arrCity;
	}

	public void setDeptCity(String deptCity) 
	{
		this.deptCity = deptCity;
	}

	public void setCost(double cost) 
	{
		this.cost = cost;
	}

	public void setSeatsLeft(int seatsLeft) 
	{
		this.seatsLeft = seatsLeft;
	}

	public void setTotalSeats(int totalSeats) 
	{
		this.totalSeats = totalSeats;
	}

	@Override
	public String toString() {
		return "ServiceDetails [serviceId=" + serviceId + ", busId=" + busId + ", depDateTime=" + depDateTime
				+ ", arrDateTime=" + arrDateTime + ", arrCity=" + arrCity + ", deptCity=" + deptCity + ", cost="
				+ cost + ", seatsLeft=" + seatsLeft + ", totalSeats=" + totalSeats + "]";
	}	
}

//Main method not needed as it will be checked by test cases
