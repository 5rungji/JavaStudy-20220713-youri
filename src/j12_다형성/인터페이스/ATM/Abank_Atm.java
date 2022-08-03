package j12_다형성.인터페이스.ATM;

public class Abank_Atm implements AtmService {

	@Override
	public void check() {
		System.out.println("A은행 잔액을 조회합니다.");
	}

	@Override
	public void deposit() {
		System.out.println("A은행 입금을 확인합니다.");
	}

	@Override
	public void withdraw() {
		System.out.println("A은행 출금을 확인합니다.");
	}

	@Override
	public void transfer() {
		System.out.println("A은행 금액을 이체합니다.");
	}
}
