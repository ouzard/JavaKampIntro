
public class Student extends User{
	private int progressStatus;
	private String registrationStatus;
	
	public Student() {
		
	}
	
	public Student(int id,String userName, String fullName, 
			String email, String password, 
	int progressStatus, String registrationStatus) {
		super(id, userName, fullName, email, password);
		this.progressStatus = progressStatus;
		this.registrationStatus = registrationStatus;
	}


	public String getRegistrationStatus() {
		return registrationStatus;
	}

	public void setRegistrationStatus(String registrationStatus) {
		this.registrationStatus = registrationStatus;
	}

	public int getProgressStatus() {
		return progressStatus;
	}

	
}
