import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sairam.service.CustomerService;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appcon = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService cit = appcon.getBean("custServiceInterface", CustomerService.class);
		System.out.println(cit.findAll().get(0).getFirstName());

	}

}
