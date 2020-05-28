import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		String[] kakao = {"무지","네오","어피치","라이언","제이지"};
		String[] kakao2 = new String[kakao.length-1]; 
		System.out.println("현재 저장된 친구들: "+Arrays.toString(kakao));
		System.out.print("삭제할 카카오 친구: ");
		String name = sc.next();
		
		/*
		 1. 삭제할 이름을 입력받아서 해당 값을 삭제.
		 
		 2. 삭제 후 정보도 출력.
		 
		 3. 없으면 없는 이름이라고 출력.
		 */
		
		int j; int i;
		for(i=0; i<kakao.length; i++) {
			if(name.equals(kakao[i])) {
				System.out.println(name+"삭제");
				break;
			}  
		}
		
		if(i==kakao.length) {
			System.out.println("없는 이름입니다.");
		}
		
		for(j=i; j<kakao.length-1; j++) {
			kakao[j]=kakao[j+1];
		}
		
		for(int k=0; k<kakao2.length; k++) {
			kakao2[k]=kakao[k];
		}
		
		kakao=kakao2;
		kakao2=null;
		
		System.out.println(Arrays.toString(kakao));				
		
		
		
		
		// ↓ 강사님 풀이
//		int idx;
//		for(idx=0; idx<kakao.length; idx++) {
//			if(name.equals(kakao[idx])) {
//				System.out.println(kakao[idx] + "의 이름을 삭제합니다.");
//				
//				for(int j=idx; j<kakao.length-1; j++) {
//					kakao[j] = kakao[j+1];
//				}
//				break;
//			}
//		}
//		
//		if(idx != kakao.length) {
//			String[] temp = new String[kakao.length-1];
//			for(int k=0; k<temp.length; k++) {
//				temp[k] = kakao[k];
//			}
//			kakao = temp;
//			temp = null;
//			System.out.println("삭제 후 정보: " + Arrays.toString(kakao));
//			
//		} else {
//			System.out.println("해당 이름은 존재하지 않습니다.");
//		}
//		
//		sc.close();
		

	}

}
