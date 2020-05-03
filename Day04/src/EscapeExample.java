
public class EscapeExample {

	public static void main(String[] args) {
		//break - 반복문 살행 종료
		//comtinue - 해당 경우만 패스. 이어서 쭉 실행
		//return - 메소드를 종료하는 명령어 

		for (int i=0; i<5; i++) {
			if (i==2)break;
			System.out.println(i);
		}

		for (int i=0; i<5; i++) {
			if (i==2)continue;
			System.out.println(i);
		}

		for (int i=0; i<5; i++) {
			if (i==2)return;  //메인함수는 메소드임. 메인함수의 리턴은 void(아무값도 주지 않음.)
			System.out.println(i);
		}


	}
}
