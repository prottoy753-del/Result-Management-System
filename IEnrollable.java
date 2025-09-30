package A;

import java.util.*;

public interface IEnrollable {

	void addStudent(Student student);
	
	void dropStudent(int studentId);
		
		void addFaculty(Faculty faculty);
		
		void dropFaculty();
		
		void printStudentList(); 
	
}
