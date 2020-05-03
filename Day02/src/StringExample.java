
public class StringExample {

	public static void main(String[] args) {
		// string = 문자형 . 클레스 형태
		String a = "안녕하세요" ; 
		System.out.println(a);
		String b = ""; //nullString - 아무것도 없는 스트링
		System.out.println(b);
		String c = null; // 참조형 데이터의 기번 값 -구조 자체도 없음.
		System.out.println(c);
		
		int d  =10;
		System.out.println(a+d);
		//다른 데이터 타입과 스트링타입의 합은 문자열로 환산
		//다른 데이터 타입의 형태 그대로 유지.
		int e  =10;
		System.out.println(d==e);
		
		String f = new String ("안녕하세요");
		System.out.println(f);
		System.out.println(a==f);
		// 참조형은 주소값만 갖음. 기본형은 static으로 끝남.

	}

}
