package repositoryinterface;

public class ClientEngagement {
	private  final String client;
	private final double hoursWorked;
	private int Id;

	
	public ClientEngagement(String client,double hoursWorked,double anticipatedRevenue) {
		this.client = client;
		this.hoursWorked = hoursWorked;
	}
	
	
	
	public int getId() {
		return Id;
	}
	
	public String getClientname() {
		return client;
	}
	public double getHoursworked() {
		return hoursWorked;
	}
	
}

