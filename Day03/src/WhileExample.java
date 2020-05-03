
public class WhileExample {
	//	while무한반복때 씀  예로 로또번호
	public static void main(String[] args) {
		int total = 0;
		int i= 1 ; //인터레이터 =순차적으로 움직임.
		while(i <= 10) { 
			total =total+i; 
			i++;
//total += i++;(전의연산자),total += i++;(후의연산) -> total += i++;
			
		}
		System.out.println(total);
		
		int[] array = {1,2,3,4,5};
		int j = 0;
		System.out.print("[");
		while( j < array.length) {
			
			System.out.print(array[j++]);
		}
		System.out.print("]");
		
	}

}
