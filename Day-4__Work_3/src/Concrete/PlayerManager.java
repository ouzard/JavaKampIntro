package Concrete;

import Abstract.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService{

	@Override
	public void add(Player player) {
		System.out.println(player.getFirstName()+ " : Adl� oyuncu eklendi!");
		
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName()+ " : Adl� oyuncu kald�r�ld�!");
		
		
	}

	@Override
	public void update(Player player) {
		System.out.println(player.getFirstName()+ " : Adl� oyuncu g�ncellendi!");
		
		
	}

}
