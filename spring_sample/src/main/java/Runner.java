import sairam.service.CustomerService;
import sairam.service.CustServiceInterface;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustServiceInterface cit = new CustomerService();
		System.out.println(cit.findAll().get(0).getFirstName());

	}

}
