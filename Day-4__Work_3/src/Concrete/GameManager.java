package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " : Adlý oyun "
				+ "eklendi ve fiyatý : "+ game.getPrice());
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " : Adlý oyun güncellendi"
				+ " ve fiyatý: "+ game.getPrice());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " : Adlý oyun kaldýrýldý!");
		
	}

}
