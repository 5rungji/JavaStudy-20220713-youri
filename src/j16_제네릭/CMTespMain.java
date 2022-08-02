package j16_제네릭;

import j14_lombok.*;

public class CMTespMain {

	public static void main(String[] args) {
		// 자동차를 한대 생성해줘
		Car car = Car.builder()
				.company("현대")
				.model("쏘나타")
				.color("화이트")
				.build();
		
		CMRespDto<Car> cmRespDto1 = new CMRespDto<Car>(1, "차량 생성 완료", car);
		System.out.println("응답결과: " + cmRespDto1);

		//해당 차량이 현대자동차인지 확인해줘
		CMRespDto<?> CMRespDto2 = null;
		
		if(car.getCompany().equals("현대")) {
			CMRespDto2 = new CMRespDto<>(1, "현대자동차 맞음", car);
		}else {
			CMRespDto2 = new CMRespDto<>(1, "현대자동차 아님", false);
		}
		
		System.out.println("응답결과: " + CMRespDto2);
	}

}
