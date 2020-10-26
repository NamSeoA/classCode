package ver05;

import ver03.Util;

public class PhoneBookMain implements Util{

	public static void main(String[] args) {
	
		
		//PhoneBookManager manager = new PhoneBookManager(10);
		PhoneBookManager manager = PhoneBookManager.getInstance();
		
		while(true) {
			System.out.println("메뉴를 입력해주세요. ===============");
			System.out.println(Menu.INSERT+"1. 저장");
			System.out.println(Menu.SEARCH+"2. 검색");
			System.out.println(Menu.DELETE+"3. 삭제");
			System.out.println(Menu.DISPLAY_ALL+"4. 모든 정보 출력");
			System.out.println(Menu.EXIT+"5. EXIT");
			
			System.out.println("\n>> ");
			
			int select = SC.nextInt();
			
			if(!(select>0 && select<6)) {
				System.out.println("메뉴의 선택이 옳바르지 않습니다.\n다시 선택해주세요");
				continue;
			}
			
			switch (select) {
			case Menu.INSERT:
				manager.insertInfo();
				break;
			case Menu.SEARCH:
				manager.serchInfor();
				break;
			case Menu.DELETE:
				manager.deleteInfor();
				break;
			case Menu.DISPLAY_ALL:
				manager.showAllInfor();
				break;
			case Menu.EXIT:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
			
		}
		
		
	}

}
