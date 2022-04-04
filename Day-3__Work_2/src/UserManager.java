public class UserManager {

	public void view(User user) {
		//kayýtlý öðrenci görüntüleme
		System.out.println(user.getFullName()+
				": Adlý Öðrenciyi Görüntülüyorsunuz");
	}
	public void add(User user) {
		System.out.println(user.getFullName()+" Adlý"
				+ " öðrenci baþarýyla eklendi");
	}
	
	public void addMultiple(User[] users) {
		
		for (User user : users) {
			add(user);
			
		}
	}
}
