package odev4gamesale.business.concretes;


import java.util.List;

import odev4gamesale.business.abstracts.CustomerCheckDao;
import odev4gamesale.dataAccess.abstracts.CustomerDao;
import odev4gamesale.entities.concretes.Customer;

public class CustomerManager implements CustomerDao{
	CustomerCheckDao customerCheckDao;
	
	
	
	public CustomerManager(CustomerCheckDao customerCheckDao) {
	
		this.customerCheckDao = customerCheckDao;
	}

	@Override
	public void add(Customer customer) {
	if(customerCheckDao.checkCustomer(customer)) {
		System.out.println(customer.getName()+" kullanıcısı eklendi");
	}else {
		System.out.println("Kullanıcı eklenemedi.");
	}
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Kullanıcı güncellendi.");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Kullanıcı silindi.");
		
	}

	
	
		
	

}

