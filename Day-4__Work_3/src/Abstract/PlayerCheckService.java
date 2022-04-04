package Abstract;

import java.rmi.RemoteException;

import Entities.Player;

public interface PlayerCheckService {

	boolean CheckIfRealPerson(Player player) throws RemoteException;
}
