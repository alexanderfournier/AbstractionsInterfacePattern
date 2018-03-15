package abstraction;

public class HourlyCalculator extends RevenueCalculator {
	
	public static final double STANDARD_HOURLY_RATE = 50;
	
	private final double hourlyRate;
	
	
	public HourlyCalculator(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	@Override
	public double calculate(final ClientEngagement clientengagement) {
		return STANDARD_HOURLY_RATE * clientengagement.getAnticipatedRevenue();
	}

}
