import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		
		//사용자에게 입력받은 값을 배열에 삽입, 배열의 크기만큼(반복문 사용)		
		String[] names = new String[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<names.length; i++) {
			System.out.print("이름을 입력하세요 : ");
			String name = sc.next();
			
//			if(name=="그만") {		
//				System.out.println("입력을 종료합니다");
//				break;
//			}
			//String타입으로 "문자"라는 데이터 입력시 매번 새로운 참조주소값 생성되어 동등비교 불가
			//객체 참조 타입(String)은 '==' 연산자를 사용하면 비교가 될수 없으므로 '비교문자열1.equals(비교문자열2)'를 사용하여 비교 진행
			
			if(name.equals("그만")) {
				System.out.println("입력을 종료합니다");
				break;
			}
			
			names[i] = name;
		}
		
		System.out.println(Arrays.toString(names));
		
		//↓ names에 null값을 안보이게 출력 
		System.out.println("----------------------------------");
		for(String str : names) {
			if(str==null) break;		//null은 문자열이 아닌 키워드로 동등비교 가능
			System.out.print(str + " ");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
