
public class AccountExamplr {

	public static void main(String[] args) {
		Account a1 = new Account("김은섭","0000","신한");
		Account a2 = new Account("김현섭","1234","국민");
		a1.deposit(20000);
		a1.withdraw(100000, "0000");
		a1.withdraw(10000, "1234");
		a1.withdraw(10000, "0000");
		a1.getBalance("0000");
		a1.transfer(10000, "0000", a2 );
		a2.getBalance("1234");

	}

}
