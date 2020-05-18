import java.util.Arrays;

public class LottoExample {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		int index = 0;
		while(true) {
			int i = 0;
			int ran = (int)(Math.random()*45+1);
			for(i=0; i<index; i++) {
				if(ran==lotto[i]) {
					break;
				}
			}
			if(i==index) {
				lotto[index++]=ran;
			}
			if(index>5) {
				break;
			}
		}
		System.out.println(Arrays.toString(lotto));
	}

}
