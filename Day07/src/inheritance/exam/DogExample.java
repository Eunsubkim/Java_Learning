package inheritance.exam;

public class DogExample {

	public static void main(String[] args) {
		Dog d1 =new Dog();
		d1.name = "꿍이";
		d1.age =18;
		println(d1);
		System.out.println(d1);

	}

	public static void println(Object obj) {
		System.out.println(obj.toString());
		
	}
	
}
