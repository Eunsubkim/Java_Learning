package inheritance.exam;

public class FruitExample {

	public static void main(String[] args) {
		Person p = new Person();
		Fruit f = new Apple();
		p.eat(f);
		p.eat(new Apple());
		p.eat(new Orange());
		p.eat(new Banana());
		
	}

}
