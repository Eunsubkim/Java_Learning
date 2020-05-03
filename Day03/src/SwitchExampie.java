
public class SwitchExampie {

	public static void main(String[] args) {
		int jumsu = (int)(Math.random()*101);

		switch(jumsu/10) {
		case 10 : 
			System.out.println("시험점수:"+jumsu);
			System.out.println("만점 입니다.");
			break;
		case 9 :
			System.out.println("시험점수:"+jumsu);
			System.out.println("A학점 입니다.");
			break;
		case 8:
			System.out.println("시험점수:"+jumsu);
			System.out.println("B학점 입니다.");
			break;
		case 7:
			System.out.println("시험점수:"+jumsu);
			System.out.println("C학점 입니다.");
			break;
			
//		case 8:
//			
//		case 7:
//			System.out.println("시험점수:"+jumsu);
//			System.out.println("C학점 입니다.");
//			break;
			
//			case 8 에 break가 없기에 case 7까지 인식

			
		default:
			System.out.println("재수강 대상입니다.");
			
		}
	}
}




