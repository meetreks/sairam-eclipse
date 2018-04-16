package sairam.service;

import sairam.repoistry.DBContract;

import java.util.List;

import sairam.model.Customer;
import sairam.repoistry.CustContract;

public class CustomerService implements CustServiceInterface {
	private CustContract cc = new DBContract();
	
	/* (non-Javadoc)
	 * @see sairam.service.CustServiceInterface#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return cc.findAll();
	}
	

}
