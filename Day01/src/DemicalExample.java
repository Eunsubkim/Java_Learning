
public class DemicalExample {

	public static void main(String[] args) {
		//	byte a =128; 범위를 넘어서는 값은 할당 불가
		byte a = 0b0111_1111; //0b 이진법
		System.out.println(a);
		byte b = 0010;
		System.out.println(b); //0 8진법
		byte c = 0x000A;
		System.out.println(c);//0x 16진법
		
		long d = 0L; // long 타입으로 선언시에만 L붙임 8바이트 
		// 기본적으로 숫자 쓰면 무조건 int형 취급
		}

}
