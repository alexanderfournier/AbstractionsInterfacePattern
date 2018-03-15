package abstraction;

public class RoyaltyShareCalculator extends RevenueCalculator {

	public final double NORMAL_ROYALTY_SHARE = 10.0;
	private double royaltyfee;
	
	public RoyaltyShareCalculator(double royaltyfee) {
		this.royaltyfee = royaltyfee;
	}
	
	@Override
	public double calculate(final ClientEngagement clientengagement) {
		return clientengagement.getAnticipatedRevenue() / NORMAL_ROYALTY_SHARE ;
		
	}
}
