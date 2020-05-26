package inheritance.good;

public class InheritanceExample {

	public static void main(String[] args) {
		person p  = new person("둘리",20);
		Teacher  t = new  Teacher("홍길동",20,"JAVA");
		Student s = new Student("김은섭",29,2020);
		System.out.println(t.getDetails());
		System.out.println(s.getDetails());

		//		//다형적 객체
		//		person p1 =Student; 
		//		System.out.println(p1.getDetails()); //재정의 규칙, 다형성의 근간
		//		person p2 =Teacher;


		person[] perArry =new person[3];
		perArry[0] =p;
		perArry[1] =t;
		perArry[2] =s;
//		for (person per : perArry) 
		for (int i=0; i<perArry.length; i++) {
			System.out.println(perArry[i].getDetails());
		}

	}

}
