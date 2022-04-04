
public class Instructor extends User{
	private String programmingLanguage;
	private String yearsOfExperience;
	private String giveLessons;
	
	public Instructor() {
		
	}
	
	public Instructor(int id,String userName, String fullName, 
			String email, String password,String programmingLanguage, 
			String yearsOfExperience, String giveLessons) {
		super(id, userName,fullName, email,password);
		this.programmingLanguage = programmingLanguage;
		this.yearsOfExperience = yearsOfExperience;
		this.giveLessons = giveLessons;
	}

	public String getGiveLessons() {
		return giveLessons;
	}

	public void setGiveLessons(String giveLessons) {
		this.giveLessons = giveLessons;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}

	public String getYearsOfExperience() {
		return yearsOfExperience;
	}
	
	
}
