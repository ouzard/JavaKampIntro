package business.concrete;

import business.abstracts.MailVerificationService;
import business.abstracts.UserCheckService;
import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
	UserCheckService userCheckService;
	MailVerificationService mailVerificationService;
	UserDao userDao;
	
	
	public UserManager(UserCheckService userCheckService, MailVerificationService mailVerificationService,
			UserDao userDao) {
		
		this.userCheckService = userCheckService;
		this.mailVerificationService = mailVerificationService;
		this.userDao = userDao;
	}
	
	@Override
	public void singIn(User user) {
		if (mailVerificationService.checkVerifyAccount(user)) {
			System.out.println("Sisteme giris yapildi.");
		}
		else {
			System.out.println("Sisteme giris yapilamadi");
		}
		
	}

	@Override
	public void signUp(User user) {
		if (userCheckService.userIsValid(user)) {
			mailVerificationService.sendToMail(user);
			mailVerificationService.verifyMail(user);
			userDao.add(user);
			
		} else {
			System.out.println("Bilgiler gecersiz.Kontrol edip tekrar deneyiniz.");
		}
		
	}

}
