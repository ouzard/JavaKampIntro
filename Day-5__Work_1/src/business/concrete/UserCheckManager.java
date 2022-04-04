package business.concrete;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import business.abstracts.UserCheckService;
import entities.concretes.User;

public class UserCheckManager implements UserCheckService {
	//Kaydedilen kullanýcýlarý karþýlaþtýrmak için array oluþturuldu.
	
	List<String> mailList = new ArrayList<String>();
	
	@Override
	public boolean checkFirstName(User user) {
		if (user.getFirstName().isEmpty()) {
			System.out.println("isim alani bos birakilamaz.");
			return false;
			
		} else if (user.getFirstName().length()<3) {
				System.out.println("isim alani 3'den kücük olamaz.");
				return false;
			}
		
		return true;
	}

	@Override
	public boolean checkLastName(User user) {
		if (user.getLastName().isEmpty()) {
			System.out.println("isim alani bos birakilamaz.");
			return false;
			
		} else if (user.getLastName().length()<3) {
				System.out.println("isim alani 3'den kücük olamaz.");
				return false;
				
			}
		return true;
	}

	@Override
	public boolean checkEmail(User user) {
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		
		if (user.getEmail().isEmpty()) {
			System.out.println("Email alani bos birakilamaz.");
			return false;
			
		} else if (pattern.matcher(user.getEmail()).find() == false) {
				System.out.println("Girilen email adresi formata uygun deðil. Örnek: ornek@ornek.com");
				return false;
			}
			return true;	
	}

	@Override
	public boolean checkpassword(User user) {
		if (user.getPassword().isEmpty()) {
			System.out.println("Password alani bos birakilamaz");
			return false;
			
		} else if (user.getPassword().length()<6) {
				System.out.println("Password uzunlugu 6'dan kücük olamaz");
				return false;
				
				
			}
			return true;
			
		
	}

	@Override
	public boolean originalMail(User user) {
		if (mailList.contains(user.getEmail())) {
			System.out.println("Bu mail önceden kullanýlýyor.");
			return false;
			
		} else {
			mailList.add(user.getEmail());
			return true;
		}
	}

	@Override
	public boolean userIsValid(User user) {
		if (checkFirstName(user) && checkLastName(user) && checkEmail(user) &&
				checkpassword(user) && originalMail(user)) {
			return true;
		} else {
			return false;
		}
	}

}
