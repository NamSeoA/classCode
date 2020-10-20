package ver4;

public class PhoneInfor {  //extends Object
//강사님과 함께 만든 것
	
		// 친구의 이름, 전화번호, 주소, 이메일
		// 캡슐화 : 정보은닉  (변수의 직접 접근을 제한 - 변수를 보호)
		private String name;         // 이름
		private String phoneNum;     // 전화번호
		private String addr;		 // 주소
		private String email; 		 // 이메일
		
		
		public PhoneInfor(String name, String phoneNum, String addr, String email) {
			//super();		//Object 클래스의 생성자를 호출 (변수가 없어 초기화 한 게 없음 - 호출할 이유가 없음)
			this.name = name;
			this.phoneNum = phoneNum;
			this.addr = addr;
			this.email = email;
			
		}

		// getter(반환)/setter(값 저장) 메서드_ 변수를 캡슐화 시켜줘서 getter, setter로 클래스를 정의해야한당
		//get, set + 변수의 이름 
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPhoneNum() {
			return phoneNum;
		}

		public void setPhoneNum(String phoneNum) {
			this.phoneNum = phoneNum;
		}

		public String getAddr() {
			return addr;
		}

		public void setAddr(String addr) {
			this.addr = addr;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
		
		// 정보 출력 기능 : 하위클래스에서 오버라이딩 하는 목적으로 만듬
		public void showInfor() {
			System.out.println("이름 : " +name);
			System.out.println("전화 : " +phoneNum);
			System.out.println("주소 : " +addr);
			System.out.println("이메일 : " +email);
		}
		
		
		
		
		
		
		
		
}
