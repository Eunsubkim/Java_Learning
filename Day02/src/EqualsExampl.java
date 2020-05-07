
public class EqualsExampl {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		System.out.println(a==b);
		
		String x ="a";
		String y ="a";
		String z = new String ("a");
		System.out.println(x==y);
		System.out.println(x==z);
		System.out.println(x.equals(z));
		//참조형 데이터 비교할 떄 .equals() 메서드 사용
		//String 참조형 사용할때
	
		

	}

}
