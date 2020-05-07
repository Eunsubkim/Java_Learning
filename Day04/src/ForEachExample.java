
public class ForEachExample {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9};
		for (int i =0; i < array.length; i ++) {
			System.out.print(array[i]);
		}
		
		System.out.println();
		//forEach문 - for(뺴내는 값: 빼낼 곳 (배열 또는 컬렉션))
		for(int a :array) {   
			System.out.print(array[a]);

		}
//		System.out.println(array[1]);

	}
}
