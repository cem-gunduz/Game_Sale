package odev4gamesale.dataAccess.concretes;


import java.util.ArrayList;
import java.util.List;

import odev4gamesale.dataAccess.abstracts.CampaignDao;
import odev4gamesale.entities.concretes.Campaign;

public class HibernateCampaignDao implements CampaignDao{
	ArrayList<Campaign> campaings;
	
	
	
	public HibernateCampaignDao() {
		campaings=new ArrayList<Campaign>();
	}

	@Override
	public void add(Campaign campaign) {
		campaings.add(campaign);
		System.out.println(campaign.getName()+ "kampanyası hibernate ile eklendi");
		
		
	}

	@Override
	public void update(Campaign campaign) {
		campaings.set(0, campaign);
		System.out.println(campaign.getName()+ "kampanyası hibernate ile güncellendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		campaings.remove(campaign);
		System.out.println(campaign.getName()+ "kampanyası hibernate ile silindi");
		
	}

	@Override
	public List<Campaign> getAll() {
		
		return campaings;
	}

}
