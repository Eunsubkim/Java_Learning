package protos;

public class Protos {
	
	int hp=100;
	int attack=10;
	int defense=5;
	
	public Protos(int hp, int attack, int defense) {
//		super();
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
	}
	
	protected void att() {
		System.out.println(this.attack+"만큼의 공격력으로 공격합니다.");
	}
	
	protected void def() {
		System.out.println(this.defense+"만큼의 방어력으로 방어합니다.");
	}
}
