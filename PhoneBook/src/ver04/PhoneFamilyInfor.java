package ver04;

public class PhoneFamilyInfor extends PhoneInfor {
	
	String Family; //가족관계 작성
	
	PhoneFamilyInfor(String name, String pNum, String addr, String email, String Family) {
		super(name, pNum, addr, email);
		this.Family = Family;
	}
	
	//오버라이딩
	@Override
	public void showData() {
		super.showData();
	System.out.println("가족관계 : " + Family);
	}
	

	
	
	

	
	

}
