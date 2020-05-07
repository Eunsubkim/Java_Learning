import java.util.Arrays;

public class ReferenceExample {

	public static void main(String[] args) {
		//5칸 짜리 char형 배열을 하나 선언해서
		//해당 배열을 출력했을 때 안녕하세요가 나오세 만들어 보세요.
		
		//배열의 초기화와 값까지 한번에 지정
		//초기화 할 때 {값,값,값,...}의; 형태로 작성
		
		char[] charArray = new char [5];
		//char형 []배열  charArray이름  = new char [5]; 5칸의 배열을 새로 만듬
		charArray[0] = '안';
		charArray[1] = '녕';
		charArray[2] = '하';
		charArray[3] = '세';
		charArray[4] = '요';
		System.out.println(Arrays.toString(charArray)); //Arrays.toString(charArray) 배열을 
		//System(클래스).(참조)out(내보내는 스트리호출)
		
		
		char[] hi = {'안','녕','하','세','요'};  //차형 변수형 형태 - 초가화와 같이 값을 지정해버림.
		System.out.println(Arrays.toString(hi));
		char[] hi2 = hi;
		System.out.println(Arrays.toString(hi));
		hi2[2] ='1';
		hi2[3] ='4';
		System.out.println(Arrays.toString(hi)); //String 은 참조값 = 주소깂을 가지고있음.
				
		
		

	}

}
