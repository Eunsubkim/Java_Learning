package inheritance.good;

public class person {
	
	public String name;
	public int age;
	
	public person (String name,  int age) {
		super(); 
		this.name =name;
		this.age =age;
	}
	
	//매소드도 상속 가능 
	public String getDetails() { 
		return "이름 = "+name+" ,  나이 =" +age; 
	}
	
}
	
