import business.concrete.MailVerificationManager;
import business.concrete.UserCheckManager;
import business.concrete.UserManager;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setFirstName("Oðuzhan");
		user1.setLastName("Arslan");
		user1.setEmail("oguzhanarslan06@hotmail.com");
		user1.setPassword("123456");
		
		User user2 = new User();
		user2.setFirstName("Ali");
		user2.setLastName("Arslan");
		user2.setEmail("");
		user2.setPassword("ali323");
		
		User user3 = new User();
		user3.setFirstName("Ahmet");
		user3.setLastName("Arslan");
		user3.setEmail("abc@hotmail.com");
		user3.setPassword("ahmet123");
		
		UserManager manager = new UserManager(new UserCheckManager(), new MailVerificationManager(),new HibernateUserDao());
		manager.signUp(user3);
		System.out.println("-----------------------------");
		manager.signUp(user2);
		System.out.println("-----------------------------");
		manager.signUp(user1);
		System.out.println("-----------------------------");
		
		manager.singIn(user3);
		System.out.println("-----------------------------");
		manager.singIn(user2);
		System.out.println("-----------------------------");
		manager.singIn(user1);
		
	}

}
