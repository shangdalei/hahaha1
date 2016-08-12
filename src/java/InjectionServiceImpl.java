
@Service
public class InjectionServiceImpl implements InjectionService{

	@Autowired
	private InjectionDAO injectionDAO;
	
	public void save(String arg){
		//模拟业务操作
		System.out.print("Service接受参数："+arg);
		arg = arg+":"+this.hashCode();
		injectionDAO.save(arg);
	}
}
