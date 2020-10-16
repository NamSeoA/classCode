package first;

public class BaseEnSpeaker extends Speaker {

	private int baseRate;
	
	public void setBaseRate(int base) {
		baseRate = base;
	}
	
	// 오버라이딩 : 상속관계에서 상속받은 메서드를 선언부는 동일하게 하고 처리부를 재구성 하는 것
	// 타입이 int이고 return 0;을 넣으면 오버라이딩이 안됨
	@Override  // 어노테이션 : 자바의 키워드, 주석이 아니다  / 추가적인 의미를 부여한다 / 이걸 넣으면 오버라이딩에서 오류가 난 것을 알려줌
	public void showCurrentState() {
		super.showCurrentState();        // 원래 가지고 있던 기능을 할 수 있도록
		System.out.println("베이스 크기 : " +baseRate);
	}
	
	
	
	
	
	
	
}
