
public class ArithmaticExample사칙연산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a =1;
		byte b =1;
		//int현 이하끼리의 연산은 결과가 int형
//		byte c =a+b; //결과가int형이라 byte에 할당 불가 
		byte c =(byte)(a+b); //결과가int형이라 byte에 할당 불가
		System.out.println('a'+10);
		int x =3;
		int y =2;
		//소수형인double로 값을 받아도 이미 x/y식이
		//int형 이하끼리의 연산이기 때문에 결과가 int 형(소수버림)
		//소수를 반고 싶으면 식 안의 항들 중 최소한 하나 int 보다 커야함.
		double z =x/y;
		System.out.println(z);
	}

}
