import java.util.*;

public class ArrayExample2 {

	//10개의 수를 입력받아 수들의 합을 구하기(배열 이용)
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[10]; //배열로 사용할 메모리의 10칸 확보
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			System.out.println(i+1+"번째 숫자 입력");
			array[i]=scan.nextInt();
			sum += array[i];
		//여기까지 10개 수의 합을 구하는 코드			
		}
		
		//여기서부터 결과값 출력 하는 코드
		for(int i=0; i<array.length-1; i++) {
			System.out.print(array[i]+" + ");
		}System.out.println(array[9]+" = "+sum);
	}

}
