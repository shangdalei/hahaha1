
public class SimpleMovieLister {

	private MovieFinder movieFinder;
	@Autowired
	private CustomerPreferencrDao customerPreferenceDao;
	/*
	 * 
	 * @required��bean���Ա���������ʱ�����
	 */
	@Required
	public void setMovieFinder(MovieFinder movieFinder){
		this.movieFinder = movieFinder;
	}
	/*
	 * @Autowiredÿ����ֻ������һ����������Ϊrequired=true
	 * @Autowired�ı�Ҫ���ԣ�����ʹ��@Requiredע��
	 */
	@Autowired(required=false)
	public MovieRecommender(CustomerPreferenceDao customerPreenceDao){
		this.customerPreferenceDao = customerPreenceDao;
	}
}
