import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열을 입력하세요:");
		String input = scan.next();
		System.out.println("입력하신 값은"+input.charAt(0)); // 스트링클라스에서의 쓸수있는 스트림 차엣으로 인덱스 지정해서 글자빼오기
		System.out.print("숫자를 입력하세요:");
		int a = scan.nextInt();
		System.out.println("입력하신 숫자는"+a);
//		System.out.println(scan.next());		
		scan.close();  //자원을 쓰고 반납해야함. 안쓰면 메모리를 두게됨.

	}

}
