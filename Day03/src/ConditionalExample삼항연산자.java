
public class ConditionalExample삼항연산자 {

	public static void main(String[] args) {
		
		int a = 5 - (int) (Math.random()*10);
		if (args.length>0) {
			a= Integer.parseInt(args[0]);
		}

		int abs = (a >= 0) ? a:-a;
		System.out.println(a+"의 절대값은 :"+ abs);
	}

}

// 이프 문은 최대한 안쓰는게 좋은 무거워짐. - 람다항식 활용할것
