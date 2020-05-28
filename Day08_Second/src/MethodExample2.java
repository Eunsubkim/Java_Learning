/*
 # 매개변수(parameter, argument)
 
 1. 메서드 호출 시 메서드 실행에 필요한 값들을 메서드 내부로 전달하는 매개체
 
 2. 메서드 선언 시 매개변수의 개수 및 종류 지정.
 
 3. 매개변수를 비운채로 메서드 선언 가능
 
 4. 의미를 담은 매개변수
 
 5. 매개변수에는 클래스(상속포함), 배열 대입가능
 */

public class MethodExample2 {

	//x ~ y까지의 누적합
	static int calcRangeTotal(int start, int end) {
		int total =0;
		for(int i=start; i<=end; i++) {
			total+=i;
		}
		return total;
	}
	
	//매개변수 없는 메서드
	static String selectRandomFood() {
		
		double rn = Math.random();
		if(rn > 0.66) {
			return "치킨";
		} else if(rn>0.33) {
			return "족발";
		} else {
			return "삼겹살";
		}
		
	}
	
	//여러 개 정수들의 총합을 리턴하는 메서드
	static int calcNumberTotal(int[] nums) {
		int total = 0;
		for(int i : nums) {
			total +=i;
		}
		return total;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(calcRangeTotal(3, 10));
		
		System.out.println("오늘 점심 : " + selectRandomFood());
		
		int[] arr = {10,20,30,40,50,60,70};
		int sum1 = calcNumberTotal(arr);
		System.out.println("누적합: " + sum1);
		
		int sum2= calcNumberTotal(new int[] {10,20,30,40,50});
		System.out.println(sum2);
		
		
		
		
		
		
		

	}

}
