
public class MethodExample {

	public static void main(String[] args) {
		//메서드 호출 - 이름(매개변수); 로 호출
		//메서드를 선언했을 때의 결과 값 리턴
		//리턴 값을 변수에 할당 또는 다른 메서드의 매개변수로 활용 가능
		int a = add(1,2);
		System.out.println(a);
		
	}
	// 메서드 선언 방법 - 리턴타입 메서드이름 (매개변수) {}
	//리턴타입에 명시한 타입을 무조건 리턴해야함
	//아무것도 리턴하지 않으려면 리턴타임 자리에 void 작성
	static int add (int a, int b) {
		return a+b;
		
	}
	
	

}
