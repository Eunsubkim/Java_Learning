
public class LamdaExample람다항식 {

	public static void main(String[] args) {
		// 3항다항식 = 조건식? 참일때 수식 : 거짓일때 수식
		String message =
				((int) (Math.random()*5))%2 ==0 ? "짝수" : "홀수";
		System.out.println(message);
		
		
		//1~10까지의 난수를 뽑아서 5이상이면 큰 수 라는 글자를 
		//5미만이면 작은 수 라는 글자를 출력하시요.(3항다항식 사용)
		
//		(int) = (Math.random()*10); 0~9까지 나옴
//		(int) = (Math.random()*10)+1) >= 5 ? "큰수" : "작은 수 " ;
		System.out.println(((int)(Math.random()*10)+1) >= 5 ? "큰수" : "작은 수 " );
		

	}

}
//3항다항식 = 조건식? 참일때 수식 : 거짓일때 수식
				//수식에 차형이나 인트형 나와도 상관없음.
