package core;

import Google.GoogleManager;
import entities.concretes.User;

public class GoogleManagerAdapters implements GoogleService{

	@Override
	public void add(User user) {
		GoogleManager googleManager = new GoogleManager();
		googleManager.googleSimulation(user);
		
	}

}
