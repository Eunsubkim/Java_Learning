
public class EnhancesForLoop {

	public static void main(String[] args) {
		
		String[] week = {"월","화","수","목","금","토","일"};
		
		for(int i=0; i<week.length; i++) {
			System.out.println(week[i]+"요일");
		}
		
		for(String day : week) {
			System.out.println(day + "요일");
		}
		//week배열의 값이 day라는 변수로 대입.
		
		/*
		 1. scores라는 이름으로 int배열을 선언하여 점수 데이터를 저장.
		 {96,88,74,63,100,55}
		 
		 2. 향상 for문(forEach)을 사용하여 총점과 평균
		 총점(int), 평균(double, 소수점 둘째 자리까지)		 
		 */
		
//		int[] scores = {96,88,74,63,100,55};
//		for(int i : scores) {
//			int total+=i;		//total의 초기값 설정 x, for문 안에서만 total변수 사용 가능(지역변수)
//			double ave=total/scores.length;
//			System.out.printf("총점 %d, 평균 %f",total,ave);
//		}
		
		int[] scores = {96,88,74,63,100,55};
		
		int total = 0;
		
		for(int i : scores) {
			total+=i;	
		}
		
		double ave=(double)(total/scores.length);
		System.out.printf("총점 %d, 평균 %f",total,ave);
	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
