package abstraction;

public class FixedFeeCalculator extends RevenueCalculator {
	
	public final static double NORMAL_HOURLY_RATE = 500;
	private double fixedFee;
	
	public FixedFeeCalculator(double fixedFee) {
		this.fixedFee=fixedFee;
	
	}
	
	@Override
	public double calculate(final ClientEngagement clientengagement) {
		return NORMAL_HOURLY_RATE * clientengagement.getHoursworked();
	}
	

}
