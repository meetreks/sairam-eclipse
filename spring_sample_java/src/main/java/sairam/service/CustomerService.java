package sairam.service;

import java.util.List;

import sairam.model.Customer;
import sairam.repoistry.CustContract;

public class CustomerService implements CustServiceInterface {
	private CustContract cc;
	
	/* (non-Javadoc)
	 * @see sairam.service.CustServiceInterface#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return cc.findAll();
	}

	/*public void setCc(CustContract cc) {
		this.cc = cc;
	}*/

	public void setCc(CustContract customerContract) {
		// TODO Auto-generated method stub
		this.cc = customerContract;
		
	}
	

}
