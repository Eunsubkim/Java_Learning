
public class IfIfExample {

	public static void main(String[] args) {

		int jumsu = (int)(Math.random()*101);

//		System.out.println("점수:"+jumsu);
		//A는 90, B는 80, C는 70점 이상일 떄 출력
		//나머지 재수강 대상입니다
		if(jumsu>=90) { //분기 
			if(jumsu>=95) {
				System.out.println("시험점수:"+jumsu);
				System.out.println("A+학점 입니다.");
			}else {
				System.out.println("시험점수:"+jumsu);
				System.out.println("A학점 입니다.");
			}
		}else if (jumsu>=80) {
			if(jumsu>=85) {
				System.out.println("시험점수:"+jumsu);
				System.out.println("B+학점 입니다.");
			}else{
				System.out.println("시험점수:"+jumsu);
				System.out.println("B학점 입니다.");				
			}
		}else if (jumsu>=70) {
			if (jumsu>=75) {
				System.out.println("시험점수:"+jumsu);
				System.out.println("C+학점 입니다.");
			}else{
				System.out.println("시험점수:"+jumsu);
				System.out.println("C학점 입니다.");
			}
		}else { //나머지 
			System.out.println("시험점수:"+jumsu);
			System.out.println("재수강 대상입니다.");

		}


	}

}
