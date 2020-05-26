package inheritance.good;

public class Teacher extends person {
	
	public String subject;
	
	public Teacher (String name,  int age ,  String subject) {
		super(name, age);
		this.subject = subject;

	}

	public String getDetails() { 
		return super.getDetails()+", 과목= " +subject ; 
	}

}
