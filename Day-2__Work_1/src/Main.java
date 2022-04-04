
public class Main {

	public static void main(String[] args) {
		
		Courses course1 = new Courses(1,"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", "Engin Demirog", 0.15);
		
		Courses course2 = new Courses(2,"Yazýlým Geliþtirici Yetiþtirme Kampý (JavaScript)", "Engin Demirog", 0.50);
		
		Courses course3 = new Courses(3,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)", "Engin Demirog", 0.42);

		Courses course4 = new Courses(4,"Programlamaya Giriþ için Temel Kurs", "Engin Demirog", 0.98);
		
		
		Courses [] course = {course1, course2, course3, course4};
		
       for (Courses kurs : course) {
			
			System.out.println("Kurs ID : " + kurs.id);
			System.out.println("Kurs Ýsmi : " + kurs.name);
			System.out.println("Kurs Egitmeni : " + kurs.teacher);
			System.out.println("Kurs Tamamlama Yüzdesi : " + kurs.detail);
			
		}
            System.out.println(course.length); 
            
            courseRegistration courseRegister = new courseRegistration();
            
            courseRegister.addDataBase(course1);
            courseRegister.addDataBase(course2);
            courseRegister.addDataBase(course3);
            courseRegister.addDataBase(course4);
            
	}

}
