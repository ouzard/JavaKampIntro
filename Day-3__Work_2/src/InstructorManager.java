
public class InstructorManager extends UserManager{

	public void addCourse(Instructor ýnstructor) {
		
	
  System.out.println(ýnstructor.getGiveLessons() +
  " adlý kurs verilen derslere eklendi. Ve ders eðitmeni: "
		+ ýnstructor.getFullName());
		
	}
}
