
public class VariableExample {

	
	static int c; 

	public static void main(String[] args) {
		int a=0; //변수 선언  type - int 변수명 -a
		// 변수선언 및 초기화
		// <variableName>변수타입이름 =  <literal>값 ;
		// int b,c=1;  같은 변수(ex상수)일 경우 같이 묶어서 초기화 
		// =은 자바에서 오른쪽 값을 왼족에 할당한다는 뜻
		a=a+1;
		System.out.println(a); //지역변수
		System.out.println(c); 
	}
}
