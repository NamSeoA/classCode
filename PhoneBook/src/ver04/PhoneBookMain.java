package ver04;

import java.util.Scanner;

public class PhoneBookMain {

		public static void main(String[] args) {
			
	   //PhoneBookManage 인스턴스 생성 : 배열과 메서드 사용 위해서
	
		PhoneBookManager manager = new PhoneBookManager();
		System.out.println("현재 저장된 정보의 개수 : " + manager.cnt);
		System.out.println("저장이 가능한 정보의 총 개수 : " + manager.phoneBook.length);
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.println("전화번호 관리 프로그램 =============");
			System.out.println("메뉴를 입력하세요");
			System.out.println(" 1. 대학 지인 정보 저장 ");
			System.out.println(" 2. 회사 지인 정보 저장 ");
			System.out.println(" 3. 가족 정보 저장 ");
			System.out.println(" 4. 정보 검색 ");
			System.out.println(" 5. 정보 삭제 ");
			System.out.println(" 6. 정보 전체보기 ");
			System.out.println(" 7. 프로그램 종료 ");
			System.out.println("==============================");
			
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1 :
					manager.insertMember(1);
					break;
				case 2 :
					manager.insertMember(2);
					break;
				case 3 :
					manager.insertMember(3);
					break;
				case 4:
					manager.searchMember();
					break;
				case 5 :
					manager.deleteMember();
					break;
				case 6 :
					manager.showAllData();
					break;
				case 7 :
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);  
					break;
			}
	
		}

		
	}
}
