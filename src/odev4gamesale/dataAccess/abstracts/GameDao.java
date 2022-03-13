package odev4gamesale.dataAccess.abstracts;

import java.util.List;

import odev4gamesale.entities.concretes.Game;



public interface GameDao {
	void add(Game game);
	void update(Game game);
	void delete(Game game);
	List<Game>getAll();
}
