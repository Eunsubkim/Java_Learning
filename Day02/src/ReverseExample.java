
public class ReverseExample {

	public static void main(String[] args) {
		// ~ = 비트연산잔. ! =논리반전연산자.
		byte a =1; //0000_0001
		System.out.println(~a); //1111_1110
		System.out.println(!(a==1));
		int b = reverse(4);
		System.out.println(b);
		
	}
	
	static int reverse(int num) {
		return ~num+1;
	}
	

}
