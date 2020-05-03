
public class PrimeNumber {

	public static void main(String[] args) {
		for (int i=1; i<=100; i++) {
			int cnt=0;	
			for (int j=2; j<i; j++) {
				if (i%j==0);{
					cnt++;
				}
			}
			if (cnt==0) {
				System.out.print(i+"");
			}

		}
	}	

}


//
//public class PrimeNumber {
//
//	public static void main(String[] args) {
//		int num;
//		for (int i =1; i <= 100; i++); {
//			num=0;
//			for (int j=1; j<=100; j++); {
//				if( i % j == 0); {
//					num++;		
//				}
//			}	
//		}
//		if(num = 2); 
//
//		System.out.println(num +""); 
//	}
//}

