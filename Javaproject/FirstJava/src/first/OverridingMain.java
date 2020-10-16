package first;

public class OverridingMain {

	public static void main(String[] args) {
		
		/*showCurrentState()클래스가 Speaker과 BaseEnSpeaker클래스에 두개가 있다.
		헷갈리지 말아야 할 것은 이름이 같은 클래스가 두개 있다면
		 조상클래스가 호출이 되는 것이 아니라
		호출을 하면 오버라이딩 되어있는 메서드가 호출이 된다*/
		
		//상속받은 클래스
		//BaseEnSpeaker bs = new BaseEnSpeaker();
		//bs.showCurrentState();
		
		//오버라이딩한 클래스
		//Speaker s = new Speaker();
		//s.showCurrentState();
		
		
		//다형성
		//조상클래스 타입의 참조변수에 자손클래스타입의 인스턴스를 참조할 수 있는 것
		//참조변수는 해당 타입의 멤버만 사용하겠다라고 선언
		Speaker s = new BaseEnSpeaker();
		//참조변수 s는 volumeRate 변수와 showCurrentState(), setVoulme()만 사용하겠다
		
		//setVolume은 Speaker 클래스가 가지는 멤버
		s.setVolume(10);
		
		//BaseEnSpeaker가 가지는 멤버이기 때문에 오류.
		//s.setBaseRate(20);
		
		//BaseEnSpeaker 오버라이딩한 메서드가 호출된다!
		s.showCurrentState();
		

	
	}
}
