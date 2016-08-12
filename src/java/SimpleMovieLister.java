
public class SimpleMovieLister {

	private MovieFinder movieFinder;
	@Autowired
	private CustomerPreferencrDao customerPreferenceDao;
	/*
	 * 
	 * @required，bean属性必须在配置时被填充
	 */
	@Required
	public void setMovieFinder(MovieFinder movieFinder){
		this.movieFinder = movieFinder;
	}
	/*
	 * @Autowired每个类只可以有一个构造器标为required=true
	 * @Autowired的必要属性，建议使用@Required注解
	 */
	@Autowired(required=false)
	public MovieRecommender(CustomerPreferenceDao customerPreenceDao){
		this.customerPreferenceDao = customerPreenceDao;
	}
}
