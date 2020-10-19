package ver04;

public class PhoneCompanyInfor extends PhoneInfor {

	//회사 관련 전화번호부
	
	//변수선언
	String company; //회사
	
	
	//초기화
	PhoneCompanyInfor(String name, String pNum, String addr, String email, String company) {
		super(name, pNum, addr, email);
		this.company = company;
	}


	//오버라이딩
	@Override
	public void showData() {
		super.showData();
		System.out.println("회사 : " + company);
	}
	
	
}
