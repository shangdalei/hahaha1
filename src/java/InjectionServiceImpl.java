
@Service
public class InjectionServiceImpl implements InjectionService{

	@Autowired
	private InjectionDAO injectionDAO;
	
	public void save(String arg){
		//ģ��ҵ�����
		System.out.print("Service���ܲ�����"+arg);
		arg = arg+":"+this.hashCode();
		injectionDAO.save(arg);
	}
}
