package odev4gamesale.business.abstracts;

import odev4gamesale.entities.concretes.Campaign;
import odev4gamesale.entities.concretes.Customer;
import odev4gamesale.entities.concretes.Game;

public interface SaleDao {
	void sell(Game game,Campaign campaign,Customer customer);
}
