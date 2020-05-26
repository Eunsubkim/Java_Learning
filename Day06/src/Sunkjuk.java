import java.util.*;

public class Sunkjuk {

	public String name;
	public int math,eng,lan,total,rank;
	
	public void disp() {
		System.out.print("이름 : "+name);
		System.out.print("수학 점수 : "+math);
		System.out.print("영어 점수 : "+eng);
		System.out.print("국어 점수 : "+lan);
		System.out.print("총점 : "+total);
		System.out.print("등수 : "+rank);
	}
	
	public void sumTot() {
		total = math+eng+lan;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수를 입력하세요 : ");
		int num=sc.nextInt();
		Sunkjuk sj[] = new Sunkjuk[num]; //배열의 동적할당, 배열 선언 및 배열의 데이터 공간확보
		for(int i=0; i<num; i++) {
			sj[i] = new Sunkjuk();	//new + 생성자로 힙에 실제 데이터 저장할 공간 확보, 여기서 sj[i]는 참조 변수(참조 ID값)
			System.out.print("이름을 입력하세요 : ");
			sj[i].name = sc.next();
			System.out.print("수학점수를 입력하세요 : ");
			sj[i].math = sc.nextInt();
			System.out.print("영어점수를 입력하세요 : ");
			sj[i].eng = sc.nextInt();
			System.out.print("국어점수를 입력하세요 : ");
			sj[i].lan = sc.nextInt();
			
		}
		
	}

}
