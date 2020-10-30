package account;

public class AccountMain implements Util {
	
	static int money; // 돈
	
	
	public static void main(String[] args) {
		
		
		while(true) {
			System.out.println(" 안녕하세요. 무엇을 도와드릴까요? ");
			System.out.println("========================== ");
			System.out.println("1. 계좌 생성");
			System.out.println("2. 계좌 조회");
			System.out.println("3. 계좌 해지");
			System.out.println("4. 예금");
			System.out.println("5. 출금");
			System.out.println("6. 이체");
			System.out.println("계좌 거래내역 조회");
			System.out.println("========================== ");
			
			/*int MenuSelect = SC.nextInt();
			if (MenuSelect == 1)
				AccountOpening();
			else if (MenuSelect == )
				
			else if (MenuSelect == )
				
			else if (MenuSelect == )
				
			else if (MenuSelect == )
				
			else if (MenuSelect == )
				
			else if (MenuSelect == )
				
			else if (MenuSelect == )
				Loan();
			else if (MenuSelect == 9)
				KaKaoSavings();
			else if (MenuSelect == 10)
				run = false;
		}
		System.err.println("※ 프로그램이 종료 되었습니다.");
	}
		}
	}*/

	private static void AccountOpening() {
		for (int i = 0; i < AccountArray.length; i++)
			if (AccountArray[i] == null) {
				System.out.print("계좌 번호 :  ");
				String AccountNumber = SC.next();
				if (FindAccount_Nu(AccountNumber) != null) {
					System.err.println("※ 계좌번호가 중복됩니다. ");
					return;
				} else {
					System.out.print("계좌주 : ");
					String AccountName = SC.next();
					System.out.println(
							(new StringBuilder(String.valueOf(AccountName))).append(" 고객의 주민등록번호 : ").toString());
					String ReNumber = scan.next();
					System.out.print("새 비밀번호 : ");
					String Password = scan.next();
					System.out.print("입금 금액 : \r");
					long DepositAmount = scan.nextLong();
					AccountArray[i] = new Account(SelectBank, AccountNumber, AccountName, ReNumber, Password, DepositAmount);
					System.out.println("========================================");
					System.out.println(
							(new StringBuilder("※ ")).append(FindAccount_Nu(AccountNumber).getAccountName()).append("님의 계좌가 정상적으로 개설되었습니다.").toString());
					System.out.println((new StringBuilder("[은행 명 : ")).append(AccountArray[0].getSelectBank()).append("]\n[계좌 주 : ").append(AccountArray[0].getAccountName()).append("]\n[계좌 번호 : ").append(AccountArray[0].getAccountNumber()).append("] 입니다.").toString());
					System.out.println("========================================");
					System.out.println("※ 위 내용을 확인 바랍니다. \r");
					return;
				}
			}

		System.err.println("※ 계좌를 개설 할 수 없습니다.");
	}
	
	private static Account FindAccount_Nu(String AccountNumber) {
		for (int i = 0; AccountArray[i] != null; i++)
			if (AccountArray[i].getAccountNumber().equals(AccountNumber))
				return AccountArray[i];
		return null;
	}
	
	
	
	
	
	
}
