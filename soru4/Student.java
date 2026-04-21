
public class Student {
	String name;
	double gpa;
	
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}
	
	public String getName() {
		return name;
	}
	
	public double getGPA() {
		return gpa;
	}
	
	public void getFullInformation() {
		System.out.println("NAME : " + name + " GPA : " + gpa);
	}
}
