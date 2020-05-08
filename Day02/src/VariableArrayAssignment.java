import java.util.*;

public class VariableArrayAssignment {
	//인원수, 각 인원의 이름과 전화번호를 입력받아 출력하기(배열사용)
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("인원수를 입력하세요 : ");
		int a = scan.nextInt();
		String[] name = new String[a];
		String[] tel = new String[a];
		//배열의 동적할당(변수를 크기에 대입)
		
		for(int i=0; i<a; i++) {
			System.out.print("이름을 입력하세요 : \n");
			name[i] = scan.next();
			System.out.print("전화번호를 입력하세요 : \n");
			tel[i] = scan.next();			
		}
		
		for(int i=0; i<a; i++) {
			System.out.println(name[i]+"님의 전화번호는 "+tel[i]+"입니다.");
		}

	}

}
