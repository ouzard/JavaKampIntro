package business.concrete;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.MailVerificationService;
import entities.concretes.User;

public class MailVerificationManager implements MailVerificationService{

	List<User> verificationMail = new ArrayList<User>();
	
	
	@Override
	public void sendToMail(User user) {
		
		System.out.println(user.getEmail()+" adli kullaniciya mail gönderildi.");
		
	}

	@Override
	public void verifyMail(User user) {
		verificationMail.add(user);
		System.out.println("E-mail basari ile dogrulandi.");
		
	}

	@Override
	public boolean checkVerifyAccount(User user) {
		if (verificationMail.contains(user)) {
			
			return true;
			
		}
		return false;
	}

}
