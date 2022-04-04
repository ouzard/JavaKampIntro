package Main;
import java.rmi.RemoteException;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		
		Player player = new Player(1,"Oðuzhan","Arslan","52540700148",1999);
		
		PlayerManager manager = new PlayerManager();
		manager.add(player);
		
		Game game1 = new Game(15,"VALORANT",45);
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		Campaign campaign = new Campaign(3,"Yaz Sezonu Kampanyasý",20);
		CampaignManager campaignManager  = new CampaignManager();
		campaignManager.add(campaign);
		
		SalesManager manager2 = new SalesManager();
		manager2.sell(player, game1, campaign);
		
		
		
	}

}
