public interface GreetingRepository extends ElasticsearchRepository<Greeting, String> {
	
    List<Greeting> findByUsername(String username);
    
}