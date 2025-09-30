package A;

import java.util.ArrayList;

public class Course implements IEnrollable {

private String courseId;
	
	private String courseTitle;
		
		private double credit;
		
		private ArrayList <Student> studentList;
		
		private int numberOfStudents;
		
		private Faculty faculty;
	
	public Course(String courseId, String courseTitle, double credit) {
		
		this.courseId=courseId;
		
		this.courseTitle=courseTitle;
		
		this.credit=credit;
		
		this.studentList=new ArrayList<>();
		
		this.numberOfStudents=0;
		
		this.faculty=null;
	}
	
public Course() {
	
	this.courseId= "unknown";
	
	this.courseTitle="unknown";
	
	this.credit= 0.0;
	
	this.studentList=new ArrayList<>();
	
	this.numberOfStudents=0;
	
	this.faculty=null;
}
	
	
	@Override
	public void addStudent(Student student) {

		studentList.add(student);

		numberOfStudents++;
		
		System.out.println("\nStudents added= "+student);

	}

	@Override
	public void dropStudent(int studentId) {
		
		boolean found= false;
		
		for (int i = 0; i < studentList.size(); i++) {
			
		    if (studentList.get(i).getStudentId() == studentId) {
		    	
		        studentList.remove(i);
		        
		        numberOfStudents--;
		        
		        break;
		    }
		    
		    System.out.println("\nStudents with ID "+studentId+" dropped");
		    
		    found=true;
		    
		}
		
	}

	@Override
	public void addFaculty(Faculty faculty) {

		this.faculty=faculty;

		System.out.println("\nFaculty added= "+faculty);
	}

	@Override
	public void dropFaculty() {

		this.faculty=null;

		System.out.println("\nFaculty removed");
	}

	@Override
	public void printStudentList() {

		System.out.println("\nStudents enrolled in "+courseTitle+ ":");
		
		for(Student s: studentList) {
			
			System.out.println(s);
		}
		
	}
	
	public void courseInformation() {
		
		System.out.println("\nCourse ID is= "+courseId);
		
		System.out.println("\nCourse title is= "+courseTitle);
		
		System.out.println("\nCourse credit is= "+credit);
		
		System.out.println("\nFaculty: " + (faculty != null ? faculty : "None assigned"));
	       
		System.out.println("\nNumber of Students: " + numberOfStudents);
		
			}

	public String toString() {
		
		return courseId + ": " + courseTitle + " (" + credit + " credits)";
	}
	
}
