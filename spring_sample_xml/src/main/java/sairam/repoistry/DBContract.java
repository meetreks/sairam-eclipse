package sairam.repoistry;

import java.util.ArrayList;
import java.util.List;

import sairam.model.Customer;

public class DBContract implements CustContract {
	
	/* (non-Javadoc)
	 * @see sairam.repoistry.CustContract#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<> ();
		Customer customer = new Customer();
		customer.setFirstName("Sairam");
		customer.setLastName("Ramsai9");
		customers.add(customer);
		return customers;
		
	}

}
