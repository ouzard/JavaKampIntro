
public class User {

	private int id;
	private String userName;
	private String fullName;
	private String email;
	private String password;
	
	public User() {
		
	}
	
	public User (int id, String userName,String fullName,
			String email, String password) {
		
		super();
		this.id= id;
		this.userName = userName;
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		
		}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return email;
	}
	
}
