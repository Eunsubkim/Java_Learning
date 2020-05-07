
public class IfExample조건문 {

	public static void main(String[] args) {
		int jumsu = (int)(Math.random()*101);
		//0~100점이기에 101 곱함.
		
		if(jumsu>=50) {
			System.out.println("시험점수:"+jumsu);
			System.out.println("합격입니다.");
		}else {
			System.out.println("시험점수:"+jumsu);
			System.out.println("불합격입니다.");
		}

	}

}
