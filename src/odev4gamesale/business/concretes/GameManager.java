package odev4gamesale.business.concretes;

import java.util.List;


import odev4gamesale.dataAccess.abstracts.GameDao;
import odev4gamesale.entities.concretes.Game;

public class GameManager {
	private GameDao gameDao;

	public GameManager(GameDao gameDao) {
		this.gameDao = gameDao;
	}
	public void add(Game game) {
		gameDao.add(game);
	}
	public void update(Game game) {
		gameDao.update(game);
	}
	public void delete(Game game) {
		gameDao.delete(game);
	}
	public List<Game> getAll() {
		return gameDao.getAll();
	}
}
