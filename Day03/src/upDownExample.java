import java.util.*;

public class upDownExample {

	public static void main(String[] args) {
		int random = (int)(Math.random()*100+1);
		//0~100까지의 임의의 수 출력
		Scanner a = new Scanner(System.in);
		int count = 0;
		
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			int number = a.nextInt();
			if(random==number)break; 
			else if(random>number) {
				System.out.println("up");
			}else if(random<number) {
				System.out.println("down");
			}
			count++;
		}System.out.println(count+"번만에 맞추셨습니다.");

	}

}
