package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {

	List<User> users = new ArrayList<User>();
	private User user;
	
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Hibernate ile eklendi: " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getEmail(String email) {
		
		if (user.getEmail() == email) {
			return true;
			
		}
		return false;
	}

	@Override
	public boolean getpassword(String password) {
		if (user.getPassword() == password) {
			return true;
			
		}
		return false;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
