package repositoryinterface;

import java.util.Iterator;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvPersistor {
	
	private static final int Client_Col = 0;
	private static final int Hours_Worked_Col=1;
	
	private final String path;
	
	CsvPersistor(final String path){
		this.path=path;
	}
	
	List<ClientEngagement> load(){
		try(CSVreader reader = new CSVReader(new FileReader(path)) {
				final List<ClientEngagement> engagements= new ArrayList<>();
				final Iterator<String[]> iterator = reader.iterator();
				while(iterator.hasNext()) {
					final String[] row = iterator.next();
					final String client = row[Client_Col];
					final Integer Hours_Worked_Col = Integer.parseInt(row[Hours_Worked_Col]);
					engagements.add(new ClientEngagement(client,hoursWorked));
				}
				return engagements;
		}
		catch(IOException e) 
		{
			throw new RepositoryException("unable to load parts " + path, e);
			
		}
	}
		
			
	
	
	void save (final List<ClientEngagements> engagements ) {
		try(CSVWriter csvwriter = new CSVWriter(new FileWriter(path))){
			engagements.forEach(Engagement ->
			{
				final String[] row = {
						enagement.getClient(),
						String.valueOf(engagement.getHoursWorked())
				};
				csvWriter.writeNext(row);
			}
		}
	}

}
