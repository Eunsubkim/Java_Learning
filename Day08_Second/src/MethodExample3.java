import java.util.Arrays;

/*
 # 반환값, 반환 유형(return value, return type)
 
 1. 반환값이란 메서드의 실행 결과 값을 의미.
 
 2. 매개변수는 여러 개 존재할 수 있지만, 반환값은 오직 한개만 존재.
 
 3. return이라는 키워드 사용, return뒤에 전달할 값을 지정.
 
 4. 전달되는 값의 데이터 타입을 반환 유형이라 하며, 메서드 선언 시 메서드 반환 유형을 반드시 명시(String, int 등등)
 
 5. 다른 변수에 반환 값 대입 or 반환 값이 다른 메서드의 매개값으로 사용 가능
 
 6. 반환할 값이 딱히 없다면 return을 사용하지 않고 void형태로 작성(void일때는 sysout으로 출력하는 것을 주로 사용)
 
 7. 모든 메서드는 return을 마지막으로 강제로 종료, 따라서 추가적인 조건없이 return 하위에 코드 작성 불가(return은 한번만 반환)
 
 8. void메서드에서 return키워드를 탈출 기능으로 사용 가능
 */

public class MethodExample3 {

	static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	static int[] operateTotal(int n1, int n2) {
//		return n1+n2;
//		return n1-n2;
//		return n1*n2;
//		return n1/n2;
//		return은 한번만 실행가능 하므로 n1-n2;는 실행 불가로 오류
		
		return new int[] {n1+n2, n1-n2, n1*n2, n1/n2};
	}
		
	/*
	 1. 메서드 이름은 calcArrayTotal
	 2. 정수 배열 하나를 전달받아 해당 배열 내부에 있는 모든 정수의 합계(int), 평균(double)을 '배열'에 담아 리턴하는 메서드
	 3. 2번에서 정의한 메서드를 선언 후 실제 호출 및 합계/평균(소수점 둘째 자리까지)을 출력.
	  {57, 89, 78, 91, 93, 47}
	 */
	
	
	public static double[] calcArrayTotal(int[] arr) {
		int sum=0;
		double ave=0;
		for(int i : arr) {
			sum += i;			
		}
		ave=(double)sum/arr.length;		
		return new double[] {sum, ave};
	}
	
	static void multi(int n1, int n2) {
		int result = n1*n2;
		System.out.printf("%d*%d = %d\n",n1,n2,result);
	}
	
 	static void divide(int n1, int n2) {
 		if(n2 == 0) {
 			System.out.println("0으로 나누지 마시오");
 			//break;	//break cannot be used outside of loop or switch, break는 반복문, 조건문, switch등에만 사용
 			return;		//void형태의 메서드에서의 break역할
 		}
 		int result = n1/n2;
 		System.out.printf("%d / %d = %d\n",n1,n2,result);
 	}
	
	
	
	public static void main(String[] args) {
		
		int r1 = add(3,8);		//int r1 = 11;
		int r2 = add(10,15);
		int r3 = add(add(4,6), add(7,8));
		
		int[] totalResult = operateTotal(30, 6);
		System.out.println("30+6 = "+totalResult[0]);
		System.out.println("30-6 = "+totalResult[1]);
		System.out.println("30*6 = "+totalResult[2]);
		System.out.println("30/6 = "+totalResult[3]);
		
		int[] ar = {57, 89, 78, 91, 93, 47};
		double[] result= calcArrayTotal(ar);
		System.out.printf("합계 %.0f, 평균 %.2f",result[0],result[1]);
		// %.0f : 소수점 없는 int의 형태로 출력
		
		System.out.println("------------------------------------------");
		
		//int r4=multi(10,7);		//반환값이 없는 void형태로 변수에 할당할 값 없음.
		multi(10,7);		//void메서드는 동작을 지시하는 역할로 단독 호출하여 사용.
		divide(20, 0);		//ArithmeticException: 산술 오류, 나누기 메서드는 0이라는 오류를 내포
		
	}
	
		
		
		
		
		
		
		
		
	

}
