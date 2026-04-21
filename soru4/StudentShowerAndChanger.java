
public class StudentShowerAndChanger {
	
	public void showAllInformation(Student s) {
		System.out.println("In Student Shower showAllInformation :: Student Ref Variable ::" + s);
		s.getFullInformation();
	}
	
	public void changeStudentName(Student s, String newName) {
		System.out.println("In Student Shower changeStudentName :: Student Ref Variable ::" + s);
		s.name = newName;
	}
	
	public void changeStudentGpa(Student s, double newGpa) {
		System.out.println("In Student Shower changeStudentGpa :: Student Ref Variable ::" + s);
		s.gpa = newGpa;
	}
}
