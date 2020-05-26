	// 팜플렛을 만듬
public class Pen {

	// 생성자, 속성(변수), 메서드 - 클래스의 3요소 (맴버변수)
	// 여기서 속성(필드)는 데이터 영역에 속한다.
	
	// 생성자는 클래스와 이름이 같아야함, 특별한 메소드로 취급되며 오버로딩(매개변수만 다른 메소드)가능
	// 반환을 하지않는다
	Pen (String color, int price, int thickness){  //속성을 전달 받음.
		this.color = color; 
		this.price= price;
		this.thickness=thickness;		
	}
	
	Pen() { //기본 생성자  
		
	}
	
	//private  나밖에 못쓰게 막아둠 <-> public 공공제
	private String color; //맴버변수는 초기화를 안해줘도됨 클래스에 넣을 때 초기화      //(String)참조형 기본값은 null , int 기본값 0
	private int price;
	private int thickness  ;
//	int thickness =10 ; // 굵기를 10으로 고정시킬수 있으며 고정된 값을 유지할땐 생성자 매개변수에서 제외
	
	 void write(String message) {
		 System.out.println(this.color+" : "+message); //메소드 =쓰다의 기능
	 }
	 
	 
	//클래스 영역에서 우클릭 source 

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		if(price<0) {
			System.out.println("가격은 음수가 될 수 없습니다.");
			this.price = 0;
		}else {
			this.price = price;
		}
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getThickness() {
		return thickness;
	}

	public void setThickness(int thickness) {
		this.thickness = thickness;
	}

	@Override
	public String toString() {
		return "Pen [color(색깔)=" + color + ", price=" + price + ", thickness=" + thickness + "]"; //변수 = 이름값 순 변수를 바꿔도 됨
	}
	 

	
	
	 
	 
}
