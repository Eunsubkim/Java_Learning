import java.util.*;

public class ArrayModify {

	public static void main(String[] args) {
		
		String[] foods = {"삼겹살","족발","피자","햄버거"};
		System.out.println(Arrays.toString(foods));
		
		foods[2]="짜장면";
		foods[3]="짬뽕";
		System.out.println(Arrays.toString(foods));
		
		
		//↓ 배열의 index 탐색
		Scanner sc =new Scanner(System.in);
		System.out.print("탐색할 음식 입력 : ");
		String name = sc.next();
		int i;
		
		for(i=0; i<foods.length; i++) {
			if(name.equals(foods[i])) {
				System.out.println("탐색 완료!");
				System.out.println("인덱스 번호 : " + i + "번");
				break;
			} //else if(i==foods.length-1) {
				//System.out.println("없는 음식입니다.");
			//}
			
		}
		
		if(i==foods.length) {
			System.out.println("없는 음식입니다.");
		}
		

		//boolean flag이용한 코드
		boolean flag=false;
		for(i=0; i<foods.length; i++) {
			if(name.equals(foods[i])) {
				System.out.println("탐색 완료!");
				System.out.println("인덱스 번호 : " + i + "번");
				flag=true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("없는 음식입니다.");
		}
		
		
		
		
		

	}

}
