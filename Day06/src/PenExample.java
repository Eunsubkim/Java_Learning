
public class PenExample {

	public static void main(String[] args) {
		Pen blackPen = new Pen(); //인스터스를 만들면서 초기화를 같이
//		Pen blackPen : 참조변수 선언(힙에 저장될 생성자 Pen의 주소를 지칭하는 참조 Id값), new Pen : 실질적인 기억공간 생성 및 데이터 저장(힙)
//		'.' : 참조 연산자		
//		blackPen.color= "검정"; //blackPen호출 
//		blackPen.price= 1000;
//		blackPen.thickness = 10;  //데이터를 가진 Pen이 됨. = 객체지향
		blackPen.setColor("검정");
		blackPen.setPrice(-1000);
		blackPen.setThickness(20);		
		
		
//		System.out.printf("이 펜의 색깔은 %s \n", blackPen.color );
//		System.out.printf("이 펜의 가격은 %s \n", blackPen.price );
//		System.out.printf("이 펜의 굵기는 %s \n", blackPen.thickness);
//		blackPen.write("써지나?");
		System.out.printf("이 펜의 색깔은 %s \n", blackPen.getColor());
		System.out.printf("이 펜의 가격은 %d \n", blackPen.getPrice() );
		System.out.printf("이 펜의 굵기는 %s \n", blackPen.getThickness());
		blackPen.write("써지나?");
		
//		
//		Pen redPen = new Pen("빨강",1500,20);  // 지정해준 순서대로 색,가격,굵기
//		System.out.printf("이 펜의 색깔은 %s \n", redPen.color );
//		System.out.printf("이 펜의 가격은 %s \n", redPen.price );
//		System.out.printf("이 펜의 굵기는 %s \n", redPen.thickness);
//		redPen.write("써지나?");
		
		Pen redPen = new Pen("빨강",1500,20); 
		System.out.printf("이 펜의 색깔은 %s \n", redPen.getColor ());
		System.out.printf("이 펜의 가격은 %s \n", redPen.getPrice ());
		System.out.printf("이 펜의 굵기는 %s \n", redPen.getThickness());
		redPen.write("써지나?");
		
		System.out.println(blackPen);  //참조형 데이터는 주소값이 나옴, 클래스에 toString override 필요.
		System.out.println(redPen);
		
		

	}

}
