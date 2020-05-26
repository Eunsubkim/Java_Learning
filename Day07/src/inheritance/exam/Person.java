package inheritance.exam;

public class Person {
	
//	public void eat(Apple apple) {
//		System.out.println("사과를 먹습니다");
//	}
//	
//	public void eat(Orange orange) {
//		System.out.println("오렌지를 먹습니다");
//	}

//	public void eat(Fruit  fruit ) {
//		if(fruit instanceof Apple) {
//			
//		}else if(fruit instanceof Orange) {
//			
//		}
//	} //이프로 호출은 너무 오래걸림.
		
	
	
	public void eat(Fruit fruit) {
		System.out.println("사람이 "+fruit.getName()+" 를/을 먹습니다.");	
	
	}
}
