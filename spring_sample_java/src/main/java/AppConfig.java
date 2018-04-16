import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import sairam.repoistry.CustContract;
import sairam.repoistry.DBContract;
import sairam.service.CustServiceInterface;
import sairam.service.CustomerService;

@Configuration
@ComponentScan({"sairam"})
public class AppConfig {
	@Bean(name = "custServiceInterface")
	public CustServiceInterface getCustomerService() {
		CustomerService cs = new CustomerService();
		cs.setCc(getCustomerContract());
		return cs;
		
	}
	
	@Bean(name = "customerRepoistry")
	public CustContract getCustomerContract() {
		return new DBContract();
		
	}
}
