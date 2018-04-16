import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sairam.service.CustomerService;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appcon = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService cit = appcon.getBean("customerService", CustomerService.class);
		System.out.println(cit.findAll().get(0).getFirstName());

	}

}
