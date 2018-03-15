package repositoryinterface;

public class Query {
	
	private String client;
	private int atLeastHoursWorked;
	
	public Query client(final String client) {
		this.client = client;
		return this;
	}
	public Query setAtLeastHoursWorked(final int atLeastHoursWorked) {
		this.atLeastHoursWorked = atLeastHoursWorked;
		return this;
	}
	public String getClient() {
		return client;
	}
	public int getClientLeastHoursWorked() {
		return atLeastHoursWorked;
	}

}
