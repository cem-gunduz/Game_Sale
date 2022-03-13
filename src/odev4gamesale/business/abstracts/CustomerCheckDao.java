package odev4gamesale.business.abstracts;

import odev4gamesale.entities.concretes.Customer;

public interface CustomerCheckDao {

	boolean checkCustomer(Customer customer);
}

