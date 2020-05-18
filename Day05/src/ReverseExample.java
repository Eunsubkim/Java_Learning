import java.util.Scanner;

public class ReverseExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println(scan.next());		//nextline : 한줄, next : 공백 기준 끊어서 출력, 같이 사용 불가
		String message = scan.next();
		for(int i=message.length(); i>0; i--) {
			System.out.println(message.charAt(i-1));
		}
	}

}
