package abstraction;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		final List<ClientEngagement> engagements = Arrays.asList(
				new ClientEngagement("Company1",10.0,100.00),
				new ClientEngagement("Company2",15.0,150.00),
				new ClientEngagement("Company3",100.0,95.00),
				new ClientEngagement("Company4",100.0,95.00));
		
		RevenueCalculator calculator = new FixedFeeCalculator(100);
		RevenueCalculator calculatorhourly = new HourlyCalculator(50);
		
		
		printTotalRevenue(engagements,calculator);
		printTotalRevenue(engagements,calculatorhourly);
		
		
		
	/* you can also pass the class inline like
	 * printTotalRevenue(engagements, HourlyCalculator(STANDARD_HOURLY_RATE));
	 * 
	 * wal-lah!
	 */
		
		
		


	}
	


	
private static void printTotalRevenue(final List<ClientEngagement> engagements,
		final RevenueCalculator calculator) {
	double total = 0;
	for(ClientEngagement engagement: engagements) {
		total += calculator.calculate(engagement);
	}
		System.out.println("The total revenue from the calculator " + calculator.getClass() + " is: " +  total);
	
}


}

