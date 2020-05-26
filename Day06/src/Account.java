import java.util.Random;

public class Account {

	long accountNumber;
	String name;
	String bankName;
	String password;
	long balance;
	
	public Account(String name, String password, String bankName) {
		this.accountNumber = new Random().nextLong();
		this.name =name;
		this.bankName =bankName;
		this.password =password;					
	}
	
	public void deposit(long money) {
		System.out.printf("%s님의 계좌 -입금액 :  %d\n", this.name, money);
		this.balance += money;
		System.out.printf("현재 잔액 :  %d\n", this.balance );
	}
	
	public boolean checkPw(String password) {
		return this.password.equals(password);
	}
	
	public void withdraw(long money, String password) {
		if (checkPw(password)) {
			if (this.balance-money>=0) {
				this.balance -= money;
				System.out.printf("%s님의 계좌 - 잔액:  %d\n", this.name, this.balance );
				System.out.printf("%d원이 출금되었습니다.\n",money);				
			}else {
				System.out.printf("%s님의 계좌 - 잔액:  %d\n", this.name,this.balance);
				System.out.println("잔액이 부족합니다.\n");
			}			
		}else {
			System.out.println("비밀번호가 맞지 않습니다.");
		}
	}
	
	public void getBalance(String password) {
		if (checkPw(password)) {
			System.out.printf("%s님의 계좌 - 잔액:  %d\n", this.name, this.balance );
		}else {
			System.out.println("비밀번호가 맞지 않습니다.");
		}
	}
	
	public void transfer(long money, String password, Account account) {
		if (checkPw(password)) {
			if(this.balance-money>=0) {
				this.balance-=money;
				account.balance += money;
				System.out.printf("%s님의 계좌로  %d원 송금하였습니다.\n", account.name, money);
				System.out.printf("%s님의 계좌 - 잔액:  %d\n", this.name, this.balance);
			}else {
			System.out.printf("%s님의 계좌 - 잔액:  %d\n", this.name, this.balance);
			System.out.println("잔액이 부족합니다.");
			}
		}else {
			System.out.println("비밀번호가 맞지 않습니다.");
		}
	}

	
	
}
