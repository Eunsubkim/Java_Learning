
public class LogicalExample논리연산자 {

	public static void main(String[] args) {

		int x=10, y=20;
		if ((x != 10)&(++y == 21)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println("x:"+x+",y:"+y);

		if ((x ==10) | (++y == 21)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println("x:"+x+",y:"+y);

		int a=10, b=20;
		if ((a != 10)&&(++b == 21)) {  //&& false나오면 끝남
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println("a:"+a+",b:"+b);

		if ((x ==10) || (++y == 21)) { //||true 한번나오면 끝남 
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println("a:"+a+",b:"+b);
	}//end main
}//end class

