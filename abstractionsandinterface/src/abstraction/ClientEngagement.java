package abstraction;

public class ClientEngagement {
	private String clientname;
	private double hoursworked;
	private double anticipatedRevenue;
	
	public ClientEngagement(String clientname,double hoursworked,double anticipatedRevenue) {
		this.clientname = clientname;
		this.hoursworked = hoursworked;
		this.anticipatedRevenue = anticipatedRevenue;
	}
	
	
	public String getClientname() {
		return clientname;
	}
	public double getHoursworked() {
		return hoursworked;
	}
	public double getAnticipatedRevenue() {
		return anticipatedRevenue;
	}
	
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	
	public void setHoursWorked(double hoursworked) {
		this.hoursworked = hoursworked;
		
	}
	
	public void setAnticipatedRevenue(double anticipatedRevenue) {
		this.anticipatedRevenue = anticipatedRevenue;
	}

}
