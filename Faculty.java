package A;

public class Faculty {

	private int facultyId;
	
	private String facultyName;
	
	private String facultyPosition;
	
	public Faculty(int facultyId, String facultyName, String facultyPosition) {
		
		this.facultyId=facultyId;
		
		this.facultyName=facultyName;
		
		this.facultyPosition=facultyPosition;
	}
	
	public Faculty() {
		
		this.facultyId= 0;
		
		this.facultyName="unknown";
		
		this.facultyPosition="unknown";
		
	}
	
	@Override
	
	public String toString() {
		
		return "\nFaculty ID is= "+facultyId+ ", Faculty name is= "+facultyName+ ", Faculty position is= "+facultyPosition;
	}
	
}
