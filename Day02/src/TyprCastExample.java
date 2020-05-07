
public class TyprCastExample {

	public static void main(String[] args) {
		// 형변화 
		byte a =1;
		int b = a;   
		//promotion 작은 ->큰
//범위기준 크기: byte -> short -> char -> int -> long -> float -> double

		byte c = (byte)b; //(type) 항변환 연산자
		 System.out.println(c);
		 
		

	}

}
