package ver04;

public class PhoneInfor {
/* 다음 두 클래스를 추가로 삽입. 상속 구조가 가능하다면 상속 구조로 구성 해보세요.
  PhoneUnivInfor, PhoneCompaanyInfor, 개인적인 클래스 추가
    각 클래스에 정의되어야 하는 인스턴스 변수.
	- PhoneUnivInfor                 
	이름 name String
	전화번호 phoneNumber String
	주소 address String
	이메일 email String
	전공 major String
	학년 year String

	- PhoneCompanyInfor
	이름 name String
	전화번호 phoneNumber String
	주소 address String
	이메일 email String
	회사 company String
	Ex) PhoneCafeInfor 또는 PhoneFamilyInfor 등을 추가해 보자  */
	
	
	//변수 설정
	private String name;           //이름
	private String phoneNumber;    //전화번호
	private String address;        //주소
	private String email;          //이메일
	
	
	//생성자를 통해 변수 초기화
	PhoneInfor(String name, String pNum, String addr, String email) {
		this.name = name;
		this.phoneNumber = pNum;
		this.address = addr;
		this.email = email;
	   }
	
	//변수 사용을 위한 메서드
	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public String getEmail() {
		return email;
	}
		
		
	
	//데이터 출력 메서드
	public void showData() {
		System.out.println("이름 : "+ name);
		System.out.println("전화번호 : "+ phoneNumber);
		System.out.println("주소 : "+ address);
		System.out.println("이메일 : "+ email);
	}
	
	
}
