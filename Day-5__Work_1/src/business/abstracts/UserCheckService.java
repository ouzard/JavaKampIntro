package business.abstracts;

import entities.concretes.User;

public interface UserCheckService {
	boolean checkFirstName (User user);
	boolean checkLastName (User user);
	boolean checkEmail (User user);
	boolean checkpassword(User user);
	boolean originalMail(User user);
	boolean userIsValid(User user);
}
