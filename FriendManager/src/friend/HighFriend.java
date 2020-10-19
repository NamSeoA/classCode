package friend;

public class HighFriend extends Friend {

	private String work;       //고교 동창의 직업
	
	
	// 생성자를 통해 인스턴스 변수 초기화 (상위클래스에 있는 변수를 초기화)
	HighFriend(String name, String pNum, String addr, String work) {
		super(name, pNum, addr); //super가 위
		this.work = work;
	}

	
	//shift+alt+s -> override implement methods
	@Override  //메서드 안에서 사용가능 
	public void showData() {  //Friend f = new HightFriend() 만들어주고 -> f.showData()
		super.showData();
		System.out.println("직업 : " + work);
	}


	@Override
	public void showBasicInfo() {
		System.out.println("이름 : " + getName());
		System.out.println("전화번호 : " + getPhoneNumber());
		System.out.println("주소 : " + getAddr());
	}

	
	
}


