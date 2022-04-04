package Adapters;
import java.rmi.RemoteException;

import Abstract.PlayerCheckService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


	public class MerniseServiceAdapter implements PlayerCheckService{
		
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		@Override
		public boolean CheckIfRealPerson(Player player) throws RemoteException {
			boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(player.getNationallyId()),
					player.getFirstName(), 
					player.getLastName(),
					player.getDateOfBirth());
			
			if (result == true) {
				 
				 System.out.println("Kullanici Sisteme Kayitlidir");
					return true;
			}
			 else 
				{
					System.out.println("Kullanici Kayit Disi"); 
					return false;
				}
		}

	}
