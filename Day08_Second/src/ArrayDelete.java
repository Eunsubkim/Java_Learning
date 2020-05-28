import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		
		//삭제기능 = A배열의 삭제할 value값 뒤에서 부터 한칸씩 전진시키고 A배열보다 한칸 작은 B배열을 선언 후 A배열 value값을 B배열에 대입.
		//A=B; B=null(A에게 B의 주소값을 대입, 바뀐 A배열을 확인할 수 있다.
		
		int[] arr = {1,3,5,7,9,11,13};
		
		for(int i=3; i<arr.length-1; i++) {
			arr[i] = arr[i+1];						
		}

	
		System.out.println(Arrays.toString(arr));

		int[] temp = new int[arr.length-1];
		
		for(int i=0; i<temp.length; i++) {
			temp[i]=arr[i];
		}
		
		arr=temp;
		temp = null;
		
		System.out.println(Arrays.toString(arr));
		
	}

}
