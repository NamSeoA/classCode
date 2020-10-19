package ver04;

public class PhoneUnivInfor extends PhoneInfor {
	
	//대학 친구 전화번호부 
	
	//변수선언
	String major; //전공
	String year;  //학년

	
	
	//생성자를 통한 초기화
	PhoneUnivInfor(String name, String pNum, String addr, String email, String major, String year) {
		super(name, pNum, addr, email);
		this.major = major;
		this.year = year;
	}

	
	//오버라이딩
	@Override
	public void showData() {
		super.showData();
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + year);
	}

	
	
}
