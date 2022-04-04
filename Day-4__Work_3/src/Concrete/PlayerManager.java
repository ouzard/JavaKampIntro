package Concrete;

import Abstract.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService{

	@Override
	public void add(Player player) {
		System.out.println(player.getFirstName()+ " : Adlý oyuncu eklendi!");
		
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName()+ " : Adlý oyuncu kaldýrýldý!");
		
		
	}

	@Override
	public void update(Player player) {
		System.out.println(player.getFirstName()+ " : Adlý oyuncu güncellendi!");
		
		
	}

}
