package repositoryinterface;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		
		ClientEngagementRepository repository = null;
		Query query = new Query();
	

		final Iterable<ClientEngagement> engagements = repository.find(query.setAtLeastHoursWorked(100).client("alex fournier"));
		
		
		/*
		 * 
		 * Can you iterable with for loops!
		 * 
		 * 
		 * 
		for(ClientEngagement clientEngagement : engagements) {
			
		}
		
		*/
		
		/* Variety of different choices we could have used a list  or Iterator of ClientEngagement instead of Iterable*/
		
		
		

	}

}






