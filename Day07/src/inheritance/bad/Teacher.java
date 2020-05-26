package inheritance.bad;

public class Teacher {

	public String name;
	public int age;
	public String subject;


	public Teacher (String name,  int age ,  String subject) {
		this.name =name;
		this.age =age;
		this.subject = subject;

	}

	public String getDetails() { // 정보를 표현한다라는 뜻으로 메소드는 바꿀필요가 없음
		return "이름 = "+name+" ,  나이 =" +age+", 과목= " +subject ; 
	}

}
