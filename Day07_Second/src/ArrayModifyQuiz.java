import java.util.*;

public class ArrayModifyQuiz {

	public static void main(String[] args) {
		
		/*
		 1. 배열 선언 후 친구들의 이름을 저장
		 {무지, 네오, 어피치, 라이언, 제이지}, String 타입으로
		 
		 2. 사용자에게 수정할 친구 이름을 입력받아 그 값이 배열에 존재한다면
		 수정할 값을 다시 입력받으세요.
		 
		 3. 이름을 수정한 후에 "수정 후 결과: ~~~~" 를 출력하세요.
		 
		 4. 사용자가 입력한 이름이 배열에 없다면 "xxx는 없는 이름입니다."를 출력하세요.
		 */
		
		String[] kakao = {"무지","네오","어피치","라이언","제이지"};
		Scanner sc = new Scanner(System.in);
		int i;		//kakao배열 안의 값의 동등 유무를 비교하기위함
		
		System.out.println("현재 저장된 친구들: "+Arrays.toString(kakao));
		System.out.print("수정할 카카오 친구: ");
		String name1 = sc.next();
		
		for(i=0; i<kakao.length; i++) { 
			if(name1.equals(kakao[i])) {
				System.out.print(name1+"의 이름을 수정합니다.\n> ");
//				String name2 = sc.next();
//				kakao[i]=name2;
				kakao[i]=sc.next();
				System.out.println("변경 완료");
				System.out.println("변경 후 정보: "+Arrays.toString(kakao));
			}			
			
		}
		
		if(i==kakao.length) {
			System.out.println(name1+"이란 친구의 정보가 없습니다.");
		}
		
		
	

	}

}
