package inheritance.bad;

public class Student {

	public String name;
	public int age;
	public int studentId;

	public Student (String name,  int age ,  int studentId) {
		this.name =name;
		this.age =age;
		this.studentId = studentId;

	}

	public String getDetails() {
		return "이름 = "+name+" ,  나이 =" +age+", 학번= " +studentId ; 
	}
}