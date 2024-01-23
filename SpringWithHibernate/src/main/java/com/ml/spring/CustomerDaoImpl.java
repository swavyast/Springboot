package com.ml.spring;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDAO {

	@Autowired
	HibernateTemplate htemp;

	@Override
	public void addCustomer(Customer customer) {
		htemp.save(customer);
	}

	@Override
	public Customer getCustomerById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerByPhone(String phone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCustomer(long id) {
		// TODO Auto-generated method stub

	}

}
