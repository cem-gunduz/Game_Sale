package odev4gamesale.dataAccess.concretes;


import java.util.ArrayList;
import java.util.List;

import odev4gamesale.dataAccess.abstracts.GameDao;
import odev4gamesale.entities.concretes.Game;

public class HibernateGameDao implements GameDao{
	ArrayList<Game> games;
	
	
	
	public HibernateGameDao() {
		games=new ArrayList<Game>();
	}

	@Override
	public void add(Game game) {
		games.add(game);
		System.out.println(game.getGameName()+ " hibernate ile eklendi");
		
	}

	@Override
	public void update(Game game) {
		games.set(0, game);
		System.out.println(game.getGameName()+ " hibernate ile güncellendi");
		
	}

	@Override
	public void delete(Game game) {
		games.remove(game);
		System.out.println(game.getGameName()+ " hibernate ile silindi");
	}

	@Override
	public List<Game> getAll() {
		
		return games;
	}

}
