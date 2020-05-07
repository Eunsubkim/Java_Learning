import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		int[] intArray = new int[5] ; 
		//배열 선언 및 초기화 - 칸수 지정만 해도 초기화  
		//칸수 지정만 하는 경우 기본 값 할당   -칸당 4비트 할당
		// int 배열 -> [] , 이름 ->  intArray, 초기화 -> 새로 인트 배열 을 만듬 [] 
		System.out.println(intArray); //참조형 데이터익 때문에 주소값 출력
		//참조형은 주소값이 나옴.
		//반복문을 활용해서 한칸한칸 꺼낸는 방법이 있음.
		System.out.println(Arrays.toString(intArray));//데이터 값 추력
		//Arrays.toString 배열에 있는 값을 하나하나 보여줌
		intArray[1] = 10; // 배열의 첫번째 호출 
		System.out.println(Arrays.toString(intArray));
		//자바에서의 인덱스(순서)는 첫 번째가 0번째
		// 때문에 1은 두번째를 가리키는 값이 됨.
		intArray[0] = 5; 
		System.out.println(Arrays.toString(intArray));
		
	}

}
