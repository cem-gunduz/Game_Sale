package odev4gamesale.dataAccess.abstracts;

import java.util.List;

import odev4gamesale.entities.concretes.Customer;

public interface CustomerDao {
	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	
	
}