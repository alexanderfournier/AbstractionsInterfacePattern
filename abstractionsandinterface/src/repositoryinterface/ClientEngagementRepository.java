package repositoryinterface;

public interface ClientEngagementRepository extends AutoCloseable{
	int NO_ID = 0;
	
	
	void add(ClientEngagement clientengagement ) throws RepositoryException;
	void remove(ClientEngagement clientengagement) throws RepositoryException;
	Iterable<ClientEngagement> find(Query query) throws RepositoryException ;
	
	
	/*Auto closeable is a great way to close up resources when you are done with them*/
}
