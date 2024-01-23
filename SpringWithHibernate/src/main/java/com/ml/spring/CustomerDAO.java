package com.ml.spring;

import java.util.List;

public interface CustomerDAO {

	public Customer getCustomerById(long id);
	public Customer getCustomerByName(String name);
	public Customer getCustomerByEmail(String email);
	public Customer getCustomerByPhone(String phone);
	public Customer getCustomerByCity(String city);
	public List<Customer> getAllCustomers();
	public void addCustomer(Customer customer);
	public void updateCustomer(Customer customer);
	public void deleteCustomer(long id);
}
