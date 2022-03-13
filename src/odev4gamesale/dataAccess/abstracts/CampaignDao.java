package odev4gamesale.dataAccess.abstracts;

import java.util.List;

import odev4gamesale.entities.concretes.Campaign;



public interface CampaignDao {
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
	List<Campaign>getAll();
}

