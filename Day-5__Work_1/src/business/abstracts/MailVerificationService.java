package business.abstracts;

import entities.concretes.User;

public interface MailVerificationService {
	void sendToMail(User user);
	void verifyMail(User user);
	boolean checkVerifyAccount(User user);
}
