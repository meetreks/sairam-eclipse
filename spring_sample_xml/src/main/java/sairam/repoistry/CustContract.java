package sairam.repoistry;

import java.util.List;

import sairam.model.Customer;

public interface CustContract {

	List<Customer> findAll();

}