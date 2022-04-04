package business.abstracts;

import entities.concretes.User;

public interface UserService {
	void singIn(User user);
	void signUp(User user);
	
}
