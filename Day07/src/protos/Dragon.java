package protos;

public class Dragon extends Protos{
	
	String name;
	
	public Dragon(int hp, int attack, int defense) {
		super(hp, attack, defense);
		this.name = "Dragon";
	}

	@Override
	protected void att() {
		System.out.println(this.name+"가 "+this.attack+"만큼의 공격력으로 공격합니다.");
	}

	@Override
	protected void def() {
		System.out.println(this.name+"가 "+this.defense+"만큼의 방어력으로 방어합니다.");
	}
}
