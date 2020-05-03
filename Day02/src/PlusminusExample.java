
public class PlusminusExample {

	public static void main(String[] args) {
		// ++,-- = 증감연산자. 붙은 항을 하나씩 증가시키거나 감소시킴.
		//앞에 붙느냐 뒤에 붙는냐에 따라 코드의 결과 값이변화(번위,후위)
		int a =1;
		int b =++a;
		System.out.printf("a의 값 : %d, b의 값 : %d\n",a,b);

		int x =1;
		//후의연산자는 연산을 가장 늦게 실행
		//연산자가 없다 생각하고 코드 확인 후 맨 나중에 처리
		int y =x++;
		System.out.printf("x의 값 : %d, y의 값 : %d\n",x,y);

	}

}
