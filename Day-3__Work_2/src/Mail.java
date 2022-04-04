
public class Mail {

	public static void main(String[] args) {
		Student student1 = new Student(1, "Ali1","Ali Yılmaz",
				"ali@hotmail.com","ali123",60,"Kayıtlı");
		
		Student student2 = new Student(2, "Mehmet1","Mehmet Yılmaz",
				"mehmet@hotmail.com","memo123",40,"Kayıtlı");
		Student student3 = new Student(3, "Ahmet1","Ahmet Yılmaz",
				"ahmet@hotmail.com","ahmet123",82,"Kayıtlı");
		
		Student[] students =  {student1, student2,student3};
		 
		Instructor instructor = new Instructor();
		instructor.setFullName("Engin Demiroğ");
		instructor.setGiveLessons("Java,C#");
		instructor.setProgrammingLanguage("Turkish");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addLesson(student1, "Java");
		studentManager.addLesson(student2, "C#");
		studentManager.addLesson(student3, "Python");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor);
		
		UserManager userManager = new UserManager();
		
		userManager.addMultiple(students);
		
		}

}
