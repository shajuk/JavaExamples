package generics.examples;

public class Student extends Person {
	private String studentId;

	public Student(String name, Integer age, String studentId) {
		super(name, age,Student.class.getName());
		this.studentId = studentId;
	}

	public String getStudentId() {
		return studentId;
	}
	
}
