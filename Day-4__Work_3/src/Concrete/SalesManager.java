package Concrete;

import Abstract.SellService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class SalesManager implements SellService {

	@Override
	public void sell(Player player, Game game, Campaign campaign) {
		System.out.println(player.getFirstName() + " isimli oyuncu "+
				game.getGameName()+" isimli oyunu "+
				campaign.getCampaignName()+" isimli kampanya ile birlikte "+
				campaign.getDiscount()+"% indirimle satin almiþtir.");
		
	}

}
