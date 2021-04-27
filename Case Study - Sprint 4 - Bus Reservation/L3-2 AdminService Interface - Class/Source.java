import java.time.LocalDateTime;

class ServiceDetailsNotFoundException extends RuntimeException 
{
	ServiceDetailsNotFoundException()
	{
		super();
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

interface AdminService
{
	void createServiceDetails(ServiceDetails serviceDetails);
	ServiceDetails updateServiceDetails(ServiceDetails serviceDetails);
	void deleteServiceDetails(int id);
	ServiceDetails searchServiceDetails(int id);
	ServiceDetails[] getServiceDetails();
}

class AdminServiceImpl implements AdminService
{
	public static ServiceDetails serviceDetailsArray[] = new ServiceDetails[5];
	public static int count = 0;

	@Override
	public void createServiceDetails(ServiceDetails serviceDetails)
	{
		serviceDetailsArray[count++] = serviceDetails;
	}

	@Override
	public ServiceDetails updateServiceDetails(ServiceDetails serviceDetails) throws ServiceDetailsNotFoundException
	{
		for(int i=0; i<5; i++)
		{
			if(serviceDetails.getServiceId() == serviceDetailsArray[i].getServiceId())
			{
				serviceDetailsArray[i] = serviceDetails;
				return serviceDetailsArray[i];
			}
		}
		throw new ServiceDetailsNotFoundException();
	}

	@Override
	public void deleteServiceDetails(int id) throws ServiceDetailsNotFoundException
	{
		for(int i=0; i<5; i++)
		{
			if(id == serviceDetailsArray[i].getServiceId())
			{
				serviceDetailsArray[i] = null;
				break;
			}
		}
		throw new ServiceDetailsNotFoundException();
	}

	@Override
	public ServiceDetails searchServiceDetails(int id) throws ServiceDetailsNotFoundException
	{
		for(int i=0; i<5; i++)
		{
			if(id == serviceDetailsArray[i].getServiceId())
			{
				return serviceDetailsArray[i];
			}
		}
		throw new ServiceDetailsNotFoundException();
	}

	@Override
	public ServiceDetails[] getServiceDetails()
	{
		return serviceDetailsArray;
	}
}

//Main method not needed as it will be checked by test cases


