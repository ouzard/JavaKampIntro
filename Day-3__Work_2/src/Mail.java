
public class Mail {

	public static void main(String[] args) {
		Student student1 = new Student(1, "Ali1","Ali Y�lmaz",
				"ali@hotmail.com","ali123",60,"Kay�tl�");
		
		Student student2 = new Student(2, "Mehmet1","Mehmet Y�lmaz",
				"mehmet@hotmail.com","memo123",40,"Kay�tl�");
		Student student3 = new Student(3, "Ahmet1","Ahmet Y�lmaz",
				"ahmet@hotmail.com","ahmet123",82,"Kay�tl�");
		
		Student[] students =  {student1, student2,student3};
		 
		Instructor instructor = new Instructor();
		instructor.setFullName("Engin Demiro�");
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
