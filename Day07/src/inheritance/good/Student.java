package inheritance.good;

public class Student extends person {
	// 이름,나이 상속받음
	public int studentId;

	public  Student (String name,  int age ,  int studentId)	{

		// super (); 생성자를 호출하는 코드 안적으면 생략됨. - 이경우 부모 클래스에 기본생성자 써주기
		super (name, age);  
		//	this.name =name;
		//	this.age =age;
		this.studentId = studentId;
	}
	public String getDetails() { 
		return super.getDetails() +", 학번 = " +studentId ; 
	}
	
}
