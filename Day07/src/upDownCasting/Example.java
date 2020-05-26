package upDownCasting;

public class Example {

	public static void main(String[] args) {
		Parents a = new Child(); //upCasting
		Child b = (Child)a; //DownCasting(Parents형태의 Child형태로 형변환), 반드시 사전에 Upcasting이 필요, 
		System.out.println("a = " + a.a);
		System.out.println("b = " + a.b);
//		System.out.println("c = " + a.c); /Parents 형태의 a는 Child 형태로 생성되긴하지만  Child 클래스의 변수 사용 불가 
		
		System.out.println("a = " + b.a);
		System.out.println("b = " + b.b);
		System.out.println("c = " + b.c); //downcasting 후에 child의 변수를 사용하는 모습.
	}

}
