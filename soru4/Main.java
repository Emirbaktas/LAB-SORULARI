
public class Main {
	public static void main(String[] args) {
		
		Student student = new Student("Ali", 3.0);
		System.out.println("Student Ref. Address : " + student);
		StudentShowerAndChanger ss = new StudentShowerAndChanger();
		ss.changeStudentGpa(student, 3.5);
		student.getFullInformation();
	}
}
