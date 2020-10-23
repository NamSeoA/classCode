package friend1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FriendInfoMain {

	public static void main(String[] args) throws Exception {
		
		FriendInfoHandler handler = new FriendInfoHandler(10);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("***** 메뉴 선택 *****");
			System.out.println(Menu.INSERT_HIGH+". 고교 친구 정보 저장");
			System.out.println(Menu.INSERT_UNIV+". 대학 친구 정보 저장");
			System.out.println(Menu.SHOW_ALL+". 전체 정보 출력");
			System.out.println(Menu.SHOW_BASIC+". 기본 정보 출력");
			System.out.println(Menu.EXIT+". EXIT");
			System.out.println("선택하세요 >> ");
	
		
		    int choice = 0;  // 1~5까지
			
		try {
			  choice = sc.nextInt();
		  	  if(!(choice>=Menu.INSERT_HIGH && choice<=Menu.EXIT)) {
				//예외 ~!
				BadMenuException e = new BadMenuException("잘못된 메뉴 입력");
				throw e;
			  }
			} catch (InputMismatchException | BadMenuException e) {
				System.out.println("잘못된 메뉴 입력입니다.\n다시 선택해주세요.");
				sc.nextLine();  //안넣으면 공백이 생겨서 무한반복됨
				continue;
			} catch(Exception e) {
				System.out.println("잘못된 메뉴 입력입니다.\n다시 선택해주세요.");
				continue;
			}
		
			
			
			switch(choice) {
			case Menu.INSERT_HIGH: case Menu.INSERT_UNIV: 
				handler.addFriend(choice);
				break;
			case Menu.SHOW_ALL: 
				handler.showAllData();
				break;
			case Menu.SHOW_BASIC:
				handler.showAllSimpleData();
				break;
			case Menu.EXIT:
				System.out.println("프로그램을 종료합니다.");
				return;  //return은 메서드를 종료시킴. main메서드 종료하면 프로그램이 끝이 나는 것
			}
			
		}
	}

}
