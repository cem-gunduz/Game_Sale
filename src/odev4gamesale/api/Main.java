package odev4gamesale.api;

import odev4gamesale.adapter.MernisDaoAdapter;
import odev4gamesale.business.concretes.CampaignManager;
import odev4gamesale.business.concretes.CustomerManager;
import odev4gamesale.business.concretes.GameManager;
import odev4gamesale.business.concretes.SaleManager;
import odev4gamesale.dataAccess.concretes.HibernateCampaignDao;
import odev4gamesale.dataAccess.concretes.HibernateGameDao;
import odev4gamesale.entities.concretes.Campaign;
import odev4gamesale.entities.concretes.Customer;
import odev4gamesale.entities.concretes.Game;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1=new Customer(1,"Cem","Gündüz",1975,"1155141");
		CustomerManager customerManager=new CustomerManager(new MernisDaoAdapter());
		customerManager.add(customer1);
		
		Campaign campaign1=new Campaign(1,"Yeni yıl",10);
		CampaignManager campaignManager=new CampaignManager(new HibernateCampaignDao());
		campaignManager.add(campaign1);
		
		Game game1=new Game(1,"Call of Duty","Action",150);
		GameManager gameManager=new GameManager(new HibernateGameDao());
		gameManager.add(game1);
		
		SaleManager saleManager= new SaleManager();
		saleManager.sell(game1, campaign1, customer1);
		
	}

}
