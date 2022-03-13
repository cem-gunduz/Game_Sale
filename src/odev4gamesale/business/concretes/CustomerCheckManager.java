package odev4gamesale.business.concretes;

import odev4gamesale.business.abstracts.CustomerCheckDao;
import odev4gamesale.entities.concretes.Customer;

public class CustomerCheckManager implements CustomerCheckDao{

	@Override
	public boolean checkCustomer(Customer customer) {
		
		return true;
	}

}
