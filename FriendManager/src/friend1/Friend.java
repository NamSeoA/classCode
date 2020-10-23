package friend1;

public class Friend {
	//개인 정보화 프로그램 _객체지향_상속
	
	private String name;         // 친구의 이름
	private String phoneNumber;  // 전화번호	
	private String addr;         // 주소

	
	//생성자를 통해서 인스턴스 변수들을 초기화 , 매개변수이면서 지역변수
	Friend(String name, String pNum, String addr){
		this.name = name;
		this.phoneNumber = pNum;
		this.addr = addr;
	}
	
	//Highfriend에서 private 변수를 사용하지 못해서 사용할 수 있도록 만들어주기
	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getAddr() {
		return addr;
	}
	
	
	//showData, showBasicInfo 메서드를 사용해서 출력
	//오버라이딩 처리 -> 상속하는 클래스의 추가 속성을 출력
	public void showData() {
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + phoneNumber);
		System.out.println("주소 : " + addr);
	}
	
	//오버라이딩 : 비어있는 처리부를 기능을 추가
	public void showBasicInfo() {
		
	}
	
	
	
	
	
	
}
