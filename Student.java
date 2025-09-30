package A;

public class Student {

	private int studentId;
	
	private String studentName;
	
	private double studentCGPA;
	
	public Student(int studentId, String studentName, double studentCGPA) {
		
		this.studentId=studentId;
		
		this.studentName=studentName;
		
		this.studentCGPA=studentCGPA;
		
	}
	
	public Student() {
		
		this.studentName="unknown";
		
		this.studentId= 0;
		
		this.studentCGPA= 0.0;
	}
	
	public int getStudentId() {
		
		return studentId;
		
	}
	
	@Override
	
	public String toString() {
		
		return "\nName is: "+studentName+ ", ID is: "+studentId+ ", CGPA is: "+studentCGPA;
	}
}
