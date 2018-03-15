package repositoryinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CsvClientEngagementRepo implements ClientEngagementRepository{
	
	private final List<ClientEngagement> engagements = new ArrayList<>();
	private final CsvPersistor persistor;
	private int nextId = 1;

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
	
	}
	
	public CsvClientEngagementRepo(final String path) {
		persistor = new CsvPersistor(path);
		persistor.load();
		
	}

	@Override
	public void add(final ClientEngagement clientengagement) throws RepositoryException{
		if(clientengagement.getId() == NO_ID) {
		engagements.add(clientengagement);
		clientengagement.setId(nextId++);
		}
	}

	@Override
	public void remove(final ClientEngagement clientengagement) throws RepositoryException{
		
		engagements.removeIf(engagement -> engagement.getId() == engagementToRemove.getId()){
			engagementToRemove.setId(NO_ID);
		}
		
	}

	@Override
	public Iterable<ClientEngagement> find(Query query) {
		return engagements.stream().filter(filterOf(query)).collect(Collectors.toList());
		
	}
	
	private Predicate<? super ClientEngagement> filterOf(final Query query){
		final String client = query.getClient();
		return null;
	}

}
