package A;

public class Main {

	public static void main(String[] args) {
		
		Course c= new Course("CSE110","Object Oriented Programming",4.5);
		
		Student s1= new Student(791, "Prottoy Barua", 3.92);
		
		Student s2= new Student(755, "Sakib Kaiser", 3.55);
		
		Faculty f=new Faculty(802, "Arijit Das", "Adjunct Faculty");
		
		c.addStudent(s1);
		
		c.addStudent(s2);
		
		c.addFaculty(f);
		
		c.courseInformation();
		
		c.printStudentList();
		
		c.dropStudent(755);
		
		c.dropFaculty();
		
		c.courseInformation();
		
		c.printStudentList();
		
	}

}
