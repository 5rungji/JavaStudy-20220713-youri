package j12_다형성.인터페이스.ATM;


public class Atm {
	
	private AtmService AtmService;
	private User User;

	public Atm(AtmService AtmService, User User) {
		super();
		this.AtmService = AtmService;
		this.User = User;
	}
	
	public void userCheck() {
		System.out.println(User.getName() + "가 조회 버튼을 누릅니다.");
		AtmService.check();		
		System.out.println();
	}
	
	public void userDeposit() {
		System.out.println(User.getName() + "가 입금 버튼을 누릅니다.");
		AtmService.deposit();
		System.out.println();		
	}
	
	public void userWithdraw() {
		System.out.println(User.getName() + "가 출금 버튼을 누릅니다.");
		AtmService.withdraw();		
		System.out.println();
	}
	
	public void userTransfer() {
		System.out.println(User.getName() + "가 송금 버튼을 누릅니다.");
		AtmService.transfer();		
		System.out.println();
	}
	
}
