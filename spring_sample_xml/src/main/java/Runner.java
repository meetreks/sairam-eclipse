import sairam.service.CustomerService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CustServiceInterface cit = new CustomerService();
		ApplicationContext appcon = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService cit = appcon.getBean("custService", CustomerService.class);
		System.out.println(cit.findAll().get(0).getFirstName());

	}

}
