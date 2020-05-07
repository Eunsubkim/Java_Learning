import java.util.Scanner;

public class ScannerReverseExample {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String str = scan.next();
		for(int i=str.length(); i>0; i--) {
			System.out.print(str.charAt(i-1)+" ");
		}
		scan.close();

	}

}
