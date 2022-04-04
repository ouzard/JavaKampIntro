package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface SellService {
	void sell(Player player, Game game, Campaign campaign);
}
