package account;

public class AccountMain implements Util {
	
	static int money; // 돈
	private static Account accountArray[] = new Account[100]; //계좌생성 배열
    private int index;
    
    
	
    /*public static void main(String[] args) {
		
		while(true) {
			System.out.println(" 안녕하세요. 무엇을 도와드릴까요? ");
			System.out.println("============================ ");
			System.out.println("1. 계좌 생성");
			System.out.println("2. 계좌 조회");
			System.out.println("3. 계좌 해지");
			System.out.println("4. 예금");
			System.out.println("5. 출금");
			System.out.println("6. 이체");
			System.out.println("7. 계좌 거래내역 조회");
			System.out.println("============================ ");
		}*/
		
			/*int MenuSelect = SC.nextInt();
			if (MenuSelect == 1)
				createAccount();
			else if (MenuSelect == 2)
				AccountCheck();
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
	*/
		
			
			

	    //계좌등록
	    private static void createAccount() {
		for (int i = 0; i < accountArray.length; i++) {
				System.out.println("========================== ");
				System.out.println("계좌번호를 생성하겠습니다");
				System.out.print("계좌번호를 입력해주세요.");
				System.out.print("계좌 번호 :  ");
				String AccountNumber = SC.next();
				if (FindAccount_Nu(AccountNumber) != null) { //계좌번호가 중복될시
					System.err.println("※ 계좌번호가 중복됩니다. ");
					return;
				} else {
					System.out.print("계좌주 : ");
					String AccountName = SC.next();
					System.out.print("비밀번호 : "); //수정 필요 __숫자 4자리 입력
					String Password = SC.next();
					System.out.print("입금 금액 : \r"); //수정 필요_ 입금 안할 경우
					long DepositAmount = SC.nextLong();
					accountArray[i] = new Account(AccountNumber, AccountName, Password, DepositAmount);
				}
					System.out.println("============================================================================");
					System.out.println("*" + FindAccount_Nu(AccountNumber).getAccountName() + "님의 계좌가 정상적으로 개설되었습니다.");
					System.out.println("[계좌 주: " + accountArray[0].getAccountName() + "] , [계좌 번호: " + accountArray[0].getAccountNumber() + "] 입니다.");    
					System.out.println("========================================");
					System.out.println("※ 위 내용을 확인 바랍니다. \r");
					return;
				}
		System.err.println("※ 계좌를 개설 할 수 없습니다.");
	}
	
	  
	 // 검색된 계좌 객체를 반환하는 메서드
	    private static Account FindAccount_Nu(String AccountNumber) {
	      for (int i = 0; accountArray[i] != null; i++)
			if (accountArray[i].getAccountNumber().equals(AccountNumber)) //전달받은 계좌번호와 저장되어 있는 계좌번호가 일치하면
				return accountArray[i];
		return null;
	    }
	
	    
	    
	
	    // 계좌 조회 
	    private static void AccountCheck() {
			String AccountName;
			Account account;
			System.out.println("[   계 좌 조 회    ]");
			if (accountArray[0] == null) {
				System.err.println("※ 등록된 계좌가 없습니다.");
				return;
			}
			System.out.print("조회하실 계좌주 : ");
			AccountName = SC.next();
			account = FindAccount_Na(AccountName);
			if (!AccountName.equals(account.getAccountName())) {
				System.out.println();
				System.err.println("※ 등록된 정보와 일치하지 않습니다.");
				System.err.println("※ 확인 후 다시 이용바랍니다.");
				return;
			} try {
				System.out.print((new StringBuilder(String.valueOf(AccountName))).append(" 고객의 비밀번호 : ").toString());
				String Password = SC.next();
				if (Password.equals(account.getPassword())) {
					for (int i = 0; accountArray[i] != null; i++)
						if (account.getAccountName().equals(accountArray[i].getAccountName())) {
							Account AccountCheck = accountArray[i];
							if (AccountCheck != null) {
								System.out.println("=========================");
								System.out.println((new StringBuilder("     ")).append(AccountCheck.getAccountName()).append(" 님의 계좌 정보").toString());
								System.out.println("-------------------------");
								System.out.println((new StringBuilder("고객의 계좌주\t:")).append(AccountCheck.getAccountName()).toString());
							//	System.out.println((new StringBuilder(String.valueOf(AccountCheck.getAccountName()))).append(" 님의 은행명\t:").append(AccountCheck.getSelectBank()).toString());
								System.out.println((new StringBuilder(String.valueOf(AccountCheck.getAccountName()))).append(" 님의 계좌번호\t:").append(AccountCheck.getAccountNumber()).toString());
								System.out.println((new StringBuilder(String.valueOf(AccountCheck.getAccountName()))).append(" 님의 잔 액 \t:").append(AccountCheck.getBalance()).append(" 원").toString());
								System.out.println("=========================");
								System.out.println("※ 등록된 계좌 정보를 확인 하였습니다.\r");
							}
						}
				} else if (!Password.equals(account.getPassword())) {
					System.err.println("※ 비밀번호가 일치 하지 않습니다.");
					System.err.println("※ 확인 후 다시 이용 바랍니다.");
					return;
				}
			    } catch (Exception e) {
				    System.err.println("계좌 정보가 없습니다.\r");
			    } 
			      return;
		      }

	    
	    private static Account FindAccount_Na(String AccountName) {
			for (int i = 0; accountArray[i] != null; i++)
				if (accountArray[i].getAccountName().equals(AccountName))
					return accountArray[i];
			return null;
		}
	
	
}
