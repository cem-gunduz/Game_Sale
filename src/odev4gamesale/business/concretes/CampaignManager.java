package odev4gamesale.business.concretes;

import java.util.List;

import odev4gamesale.dataAccess.abstracts.CampaignDao;
import odev4gamesale.entities.concretes.Campaign;



public class CampaignManager {
	private CampaignDao campaignDao;

	
	
	public CampaignManager(CampaignDao campaignDao) {
		this.campaignDao = campaignDao;
	}
	
	
	public void add(Campaign campaign) {
		campaignDao.add(campaign);
	}
	public void update(Campaign campaign) {
		campaignDao.update(campaign);
	}
	public void delete(Campaign campaign) {
		campaignDao.delete(campaign);
	}
	public List<Campaign> getAll() {
		return campaignDao.getAll();
	}
	

}
