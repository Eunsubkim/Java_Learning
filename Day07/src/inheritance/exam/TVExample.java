package inheritance.exam;

public class TVExample {

	public static void main(String[] args) {
		Remocon remo = new Remocon();
//		SamsungTV sam = new SamsungTV();
//		TV sam = new SamsungTV();		/*up-casting*/ 
		remo.off(new SamsungTV());
		remo.off(new AppleTV());
	

	}

}
