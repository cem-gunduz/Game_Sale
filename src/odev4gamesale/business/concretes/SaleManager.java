package odev4gamesale.business.concretes;

import odev4gamesale.business.abstracts.SaleDao;
import odev4gamesale.entities.concretes.Campaign;
import odev4gamesale.entities.concretes.Customer;
import odev4gamesale.entities.concretes.Game;

public class SaleManager implements SaleDao{

	@Override
	public void sell(Game game, Campaign campaign, Customer customer) {
		double lastprice=game.getPrice()-(game.getPrice()*campaign.getDiscount()/100);
		
	System.out.println(customer.getName()+ " oyuncusuna " +game.getPrice()+" tl tutarındaki "+game.getGameName()
	+" oyununu " + campaign.getName() +" kampanyası ile " + campaign.getDiscount()+" indirimle "+ lastprice+" fiyatına satıldı.");
	
		
	}
	
	
}