
@RunWith(BlockJUnit4ClassTunner.class)
public class TestInjection extends UnitTestBase{

	public TestInjection(){
		super("classpath:spring-beanannotation.xml");
	}
	
	@Test
	public void testAutowired(){
		InjectionService sevice = super.getBean("injectionServiceImpl");
		service.save("this is autowired");
	}
}
