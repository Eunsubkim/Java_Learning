
public class MethodExample1 {

	static int calcTotal(int x) {
		int total =0;
		for(int i=0; i<=x; i++) {
			total +=i;
		}
		return total;
	}
	
	
	public static void main(String[] args) {
		
		/*
		 1. 메서드는 반복되는 코드 블록에 이름 부여
		 
		 2. 코드의 모듈화(=반복되는 코드를 구조화)
		 
		 3. 선언, 호출하는 과정
		 
		 4. 클래스 블록 내부, 타 메서드 내부에서 선언 불가
		 
		 5. 메서드 호출은 메서드나 생성자 블록 내부에서 가능
		 
		 6. 메서드가 필요로 하는 value(매개 변수)가 달라지면 다른 메서드로 인식
		 */
		
		int result = calcTotal(10);
		
		
	}
	
}
