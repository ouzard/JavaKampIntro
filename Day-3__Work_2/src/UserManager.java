public class UserManager {

	public void view(User user) {
		//kay�tl� ��renci g�r�nt�leme
		System.out.println(user.getFullName()+
				": Adl� ��renciyi G�r�nt�l�yorsunuz");
	}
	public void add(User user) {
		System.out.println(user.getFullName()+" Adl�"
				+ " ��renci ba�ar�yla eklendi");
	}
	
	public void addMultiple(User[] users) {
		
		for (User user : users) {
			add(user);
			
		}
	}
}
