package sairam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sairam.model.Customer;
import sairam.repoistry.CustContract;
@Service("customerService")
public class CustomerService implements CustServiceInterface {
	//@Autowired
	private CustContract cc;
	
	/* (non-Javadoc)
	 * @see sairam.service.CustServiceInterface#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return cc.findAll();
	}
	@Autowired
	public void setCc(CustContract cc) {
		System.out.println("We are in this method");
		this.cc = cc;
	}
	

}
