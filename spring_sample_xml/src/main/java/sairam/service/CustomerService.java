package sairam.service;

import java.util.List;

import sairam.model.Customer;
import sairam.repoistry.CustContract;

public class CustomerService implements CustServiceInterface {
	private CustContract customerContract;
	
	@Override
public List<Customer> findAll() {
	return customerContract.findAll();
}
	
		public void setCustContract(CustContract customerContract) {
			this.customerContract = customerContract;
		}

		
//*- No setter found for property 'custContract' in class 'sairam.service.CustomerService'
	

}
