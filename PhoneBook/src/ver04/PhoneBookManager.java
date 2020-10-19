package ver04;

import java.util.Scanner;

public class PhoneBookManager {
	     
		//정보 입력 받기
		Scanner sc = new Scanner(System.in);
			
	    // 친구 정보를 저장하는 배열 (이름, 전화번호, 주소, 이메일, 전공, 학년, 회사, 가족)
		final PhoneInfor[] phoneBook;   //전화번호부 정보를 저장하는 배열
		int cnt;                        //저장된 전화번호의 개수
	
		// 초기화
		public PhoneBookManager() {
			this(100);
			cnt = 0;
		}

		PhoneBookManager(int size) {
			phoneBook = new PhoneInfor[size];
		    sc = new Scanner(System.in);
		}
	
	
		//저장, 검색, 삭제
		
		// 저장 기능
		// 사용자로부터 데이터를 받아서 -> 인스턴스를 생성 -> 
		// 배열에 생성된 인스턴스의 참조값을 저장 : 저장 index는 cnt 이용
		
		//배열에 전화번호 정보를 저장하는 기능
		void addPhoneInfor(PhoneInfor p) {
			phoneBook[cnt++] = p;
		}
		
		//choice = 1. 학교관련 지인 전화번호  2. 회사관련  3. 가족
		void insertMember(int choice) { //사용자로부터 데이터를 받아서 매개변수 넣지않음
			
			System.out.println("전화번호 정보 입력을 시작합니다.");
			
			// 이름 입력받기
			System.out.println("이름 : ");
			String name = sc.nextLine();
			// 전화번호 받기
			System.out.println("전화번호 : ");
			String pNum = sc.nextLine();
			// 주소 받기
			System.out.println("주소 : ");
			String addr = sc.nextLine();
			// 이메일 받기
			System.out.println("이메일 : ");
			String email = sc.nextLine();
			
			
			//인스턴스 생성 후 저장
			if(choice==1) {
				//학교지인 데이터 받은 후 인스턴스 생성 -> 배열에 저장
				System.out.println("전공 : ");
				String major = sc.nextLine();
				
				System.out.println("학년 : ");
				String year = sc.nextLine();
				
				//배열에 저장
				addPhoneInfor(new PhoneUnivInfor(name, pNum, addr, email, major, year));
				
			}else if (choice==2) { //회사관련 지인
				System.out.println("회사 : ");
				String company = sc.nextLine();
				
				addPhoneInfor(new PhoneCompanyInfor(name, pNum, addr, email, company));
			}else if(choice==3){ //가족
				System.out.println(" 가족 : ");
				String family = sc.nextLine();
				
				addPhoneInfor(new PhoneFamilyInfor(name, pNum, addr, email, family));
			}
			System.out.println("입력이 완료되었습니다 \n");
		
		}
		
		
		// 정보 검색
		// 검색하고자하는 이름을 사용자로 부터 받고 PhoneInfor.name 변수의 값과 검색 이름을 비교(동등비교)
		// 검색된 index로 정보 출력
		void searchMember() {
			if (cnt==0)	{
			System.out.println("저장된 데이터 없습니다. 다시 메뉴로 이동합니다.");
				return;
			}
			
			// 찾고자 하는 이름을 받는다.
			System.out.println("정보 검색을 시작합니다.");
			System.out.println("찾고자 하는 이름을 입력해주세요 : ");
			String name = sc.nextLine();
			
			// 이름을 요소 index 검색
			int index = searchIndex(name);
	
			if(index<0) {
				System.out.println("찾으시는 이름의 정보가 존재하지 않습니다.");
			} else { 
				phoneBook[index].showData();
			}
		}
		

		// 이름 문자열을 받아서, 
		// 배열의 정보와 비교하고, 
		// index를 찾아서 반환하는 메서드
		int searchIndex(String name) {
			int result = -1;
			// 검색 : index를 찾는다.
			for (int i = 0; i < cnt; i++) {
				if (phoneBook[i].getName().equals(name)) {
					result = i;
					break;
				}
			}
			return result;
		}
		
		
		
		// 정보 삭제
		// 삭제하고자 하는 이름을 입력받기 -> 배열에서 이름으로 검색해서 index 찾음 -> 
		// 배열에서 찾은 index의 참조값을 삭제
		// 참조값에 null을 입력하거나, 다른 주소값을 입력 -> 이전에 있던 참조값은 없어진다
		// 삭제 대상의 index부터 왼쪽으로 값을 shift 처리
		void deleteMember() {
			if(cnt==0) {
				System.out.println("등록된 정보가 없습니다.");
				return;
			}
			
			System.out.println("정보 삭제를 진행합니다.");
			System.out.println("삭제 하고자 하는 정보의 이름을 입력해주세요.");
			String name = sc.nextLine();
			
			// 이름을 요소 index 검색
			int index = searchIndex(name);
								
			if(index<0) {
				System.out.println("삭제 하고자 하는 정보가 존재하지 않습니다.");
			}else {
				for(int i=index; i<cnt-1; i++) {
					phoneBook[i] = phoneBook[i+1];
				}
				cnt--;
				System.out.println("정보가 삭제되었습니다.");
			}
	}
		
		
		// 전체 정보 출력
		void showAllData() {
			System.out.println("======= 전체 데이터를 출력합니다 =======");
			
			if(cnt==0) {
				System.out.println("등록된 정보가 없습니다.");
				return;
			}
			
			for(int i=0; i<cnt; i++) {
				phoneBook[i].showData();
				System.out.println("-------------------------------");
			}
		
		
		}
		
		
		
		
		
		
		
		
		
		
}
