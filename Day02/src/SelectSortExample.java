import java.util.*;

public class SelectSortExample {
	
	public static void main(String[] args) {
		//10개의 수를 입력받아 오름차순으로 정렬(selectSort이용)
		Scanner scan = new Scanner(System.in);
		int[] array = new int[10];		
		for(int i=0; i<array.length; i++) {
			//i<array.length-1 : 마지막 10번째 수는 더이상 비교하여 바꿀 수가 없기에 비교하지 않는다.
			System.out.print(i+1+"번째 숫자 입력 : ");
			array[i]=scan.nextInt();
		}
		for(int i=0; i<array.length-1; i++) {
			for(int o=i+1; o<array.length; o++) {
				if(array[i]>array[o]) {
					int a = array[i]; 
		//파이썬처럼 array[i],array[j] = array[j],array[i]
		//배열 바꾸는 수식 안먹히기에 바꿀 자리의 배열 원소를 변수로 받아서 저장 후 대입
					array[i]=array[o];
					array[o]=a;
				}
			}
			
		}System.out.println("오름차순 결과 : "+Arrays.toString(array));

	}

}
