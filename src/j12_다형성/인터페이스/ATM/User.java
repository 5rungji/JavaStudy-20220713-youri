package j12_다형성.인터페이스.ATM;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
	private String name;
	private int bankCode;
}
