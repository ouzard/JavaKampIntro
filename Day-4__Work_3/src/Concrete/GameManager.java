package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " : Adl� oyun "
				+ "eklendi ve fiyat� : "+ game.getPrice());
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " : Adl� oyun g�ncellendi"
				+ " ve fiyat�: "+ game.getPrice());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " : Adl� oyun kald�r�ld�!");
		
	}

}
