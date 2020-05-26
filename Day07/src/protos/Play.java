package protos;

public class Play {

	public static void main(String[] args) {
		Protos Unit1 = new Zilot(200,20,10);
		Protos Unit2 = new Dragon(150,15,7);
		
		Unit1.att();
		Unit1.def();
		Unit2.att();
		Unit2.def();

	}

}
